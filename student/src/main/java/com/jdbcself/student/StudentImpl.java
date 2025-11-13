package com.jdbcself.student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentImpl implements IStudent {
    private final IConnection connectionProvider;

    public StudentImpl(IConnection connectionProvider) {
        this.connectionProvider = connectionProvider;
    }

    private void ensureTable() throws SQLException, ClassNotFoundException {
        try (Connection conn = connectionProvider.createConnection();
             Statement stmt = conn.createStatement()) {
        	String sql = "CREATE TABLE IF NOT EXISTS students (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "name VARCHAR(100) NOT NULL, " +
                    "age INT, " +
                    "email VARCHAR(100)" +
                    ")";

            stmt.execute(sql);
        }
    }

    @Override
    public void insertStudent(Student s) throws SQLException, ClassNotFoundException {
        ensureTable();
        String sql = "INSERT INTO students (name, age, email) VALUES (?, ?, ? )";
        try (Connection conn = connectionProvider.createConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, s.getName());
            ps.setInt(2, s.getAge());
            ps.setString(3, s.getEmail());
            ps.executeUpdate();
        }
    }

    @Override
    public void insertStudents(List<Student> students) throws SQLException, ClassNotFoundException {
        ensureTable();
        String sql = "INSERT INTO students (name, age, email) VALUES (?, ?, ? )";
        try (Connection conn = connectionProvider.createConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            for (Student s : students) {
                ps.setString(1, s.getName());
                ps.setInt(2, s.getAge());
                ps.setString(3, s.getEmail());
                ps.addBatch();
            }
            ps.executeBatch();
        }
    }

    @Override
    public void updateStudent(Student s) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE students SET name = ?, age = ?, email = ? WHERE id = ?";
        try (Connection conn = connectionProvider.createConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, s.getName());
            ps.setInt(2, s.getAge());
            ps.setString(3, s.getEmail());
            ps.setInt(4, s.getId());
            ps.executeUpdate();
        }
    }

    @Override
    public void updateStudents(List<Student> students) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE students SET name = ?, age = ?, email = ? WHERE id = ?";
        try (Connection conn = connectionProvider.createConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            for (Student s : students) {
                ps.setString(1, s.getName());
                ps.setInt(2, s.getAge());
                ps.setString(3, s.getEmail());
                ps.setInt(4, s.getId());
                ps.addBatch();
            }
            ps.executeBatch();
        }
    }

    @Override
    public void deleteStudent(int id) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM students WHERE id = ?";
        try (Connection conn = connectionProvider.createConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }

    @Override
    public void deleteStudents(List<Integer> ids) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM students WHERE id = ?";
        try (Connection conn = connectionProvider.createConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            for (Integer id : ids) {
                ps.setInt(1, id);
                ps.addBatch();
            }
            ps.executeBatch();
        }
    }

    @Override
    public List<Student> getAllStudents() throws SQLException, ClassNotFoundException {
        ensureTable();
        String sql = "SELECT id, name, age, email FROM students";
        List<Student> list = new ArrayList<>();
        try (Connection conn = connectionProvider.createConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Student s = new Student(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getString("email"));
                list.add(s);
            }
        }
        return list;
    }
}

