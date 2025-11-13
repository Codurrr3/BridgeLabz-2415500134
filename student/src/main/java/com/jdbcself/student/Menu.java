package com.jdbcself.student;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jdbcself.student.IMenu;
import com.jdbcself.student.IStudent;
import com.jdbcself.student.Student;

public class Menu implements IMenu {
    private final IStudent studentService;
    private final Scanner scanner = new Scanner(System.in);

    public Menu(IStudent studentService) {
        this.studentService = studentService;
    }

    @Override
    public void show() {
        while (true) {
            System.out.println("\nWelcome to JDBC");
            System.out.println("Student Database Menu");
            System.out.println("1.Insert a student");
            System.out.println("2.Insert Multiple Students");
            System.out.println("3.Update a student");
            System.out.println("4.Update multiple Students");
            System.out.println("5.Delete a student");
            System.out.println("6.Delete multiple Students");
            System.out.println("7.Show Students");
            System.out.println("8.Exit");
            System.out.print("Choose an option: ");

            String opt = scanner.nextLine().trim();
            try {
            	switch (opt) {
                case "1":
                    insertSingle();
                    break;
                case "2":
                    insertMultiple();
                    break;
                case "3":
                    updateSingle();
                    break;
                case "4":
                    updateMultiple();
                    break;
                case "5":
                    deleteSingle();
                    break;
                case "6":
                    deleteMultiple();
                    break;
                case "7":
                    showStudents();
                    break;
                case "8":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option");
                    break;
            }

            } catch (SQLException | ClassNotFoundException e) {
                System.out.println("Database error: " + e.getMessage());
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number format."); 
            }
        }
    }

    private void insertSingle() throws SQLException, ClassNotFoundException {
        System.out.print("Name: "); String name = scanner.nextLine();
        System.out.print("Age: "); int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Email: "); String email = scanner.nextLine();
        studentService.insertStudent(new Student(name, age, email));
        System.out.println("Inserted."); 
    }

    private void insertMultiple() throws SQLException, ClassNotFoundException {
        System.out.print("How many? "); int n = Integer.parseInt(scanner.nextLine());
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d Name: ", i+1); String name = scanner.nextLine();
            System.out.printf("Student %d Age: ", i+1); int age = Integer.parseInt(scanner.nextLine());
            System.out.printf("Student %d Email: ", i+1); String email = scanner.nextLine();
            list.add(new Student(name, age, email));
        }
        studentService.insertStudents(list);
        System.out.println("Inserted batch."); 
    }

    private void updateSingle() throws SQLException, ClassNotFoundException {
        System.out.print("ID to update: "); int id = Integer.parseInt(scanner.nextLine());
        System.out.print("New Name: "); String name = scanner.nextLine();
        System.out.print("New Age: "); int age = Integer.parseInt(scanner.nextLine());
        System.out.print("New Email: "); String email = scanner.nextLine();
        studentService.updateStudent(new Student(id, name, age, email));
        System.out.println("Updated."); 
    }

    private void updateMultiple() throws SQLException, ClassNotFoundException {
        System.out.print("How many to update? "); int n = Integer.parseInt(scanner.nextLine());
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d ID: ", i+1); int id = Integer.parseInt(scanner.nextLine());
            System.out.printf("Student %d Name: ", i+1); String name = scanner.nextLine();
            System.out.printf("Student %d Age: ", i+1); int age = Integer.parseInt(scanner.nextLine());
            System.out.printf("Student %d Email: ", i+1); String email = scanner.nextLine();
            list.add(new Student(id, name, age, email));
        }
        studentService.updateStudents(list);
        System.out.println("Batch update done."); 
    }

    private void deleteSingle() throws SQLException, ClassNotFoundException {
        System.out.print("ID to delete: "); int id = Integer.parseInt(scanner.nextLine());
        studentService.deleteStudent(id);
        System.out.println("Deleted."); 
    }

    private void deleteMultiple() throws SQLException, ClassNotFoundException {
        System.out.print("How many to delete? "); int n = Integer.parseInt(scanner.nextLine());
        List<Integer> ids = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("ID %d: ", i+1); ids.add(Integer.parseInt(scanner.nextLine()));
        }
        studentService.deleteStudents(ids);
        System.out.println("Batch delete done."); 
    }

    private void showStudents() throws SQLException, ClassNotFoundException {
        List<Student> list = studentService.getAllStudents();
        if (list.isEmpty()) {
            System.out.println("No students found.");
        } else {
            list.forEach(System.out::println);
        }
    }
}

