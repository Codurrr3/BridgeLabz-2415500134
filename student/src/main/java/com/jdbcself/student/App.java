package com.jdbcself.student;


public class App 
{
	public static void main(String[] args) {
        IConnection conn = (IConnection) new DBConnection();
        IStudent studentService = new StudentImpl(conn);
        IMenu menu = new Menu(studentService);
        menu.show();
    }
}
