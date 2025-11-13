package com.jdbcself.student;

import java.sql.SQLException;
import java.util.List;

public interface IStudent {
	
	
    void insertStudent(Student s) throws SQLException, ClassNotFoundException;
    
    void insertStudents(List<Student> students) throws SQLException, ClassNotFoundException;
    void updateStudent(Student s) throws SQLException, ClassNotFoundException;
    void updateStudents(List<Student> students) throws SQLException, ClassNotFoundException;
    void deleteStudent(int id) throws SQLException, ClassNotFoundException;
    
    void deleteStudents(List<Integer> ids) throws SQLException, ClassNotFoundException;
    List<Student> getAllStudents() throws SQLException, ClassNotFoundException;
    
    
}
