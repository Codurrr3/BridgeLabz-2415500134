package com.jdbcself.student;
	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class DBConnection implements IConnection {

	    private static final String URL = "jdbc:mysql://localhost:3306/studentjdbc";
	    private static final String USER = "root";
	    private static final String PASS = "10130406@SQL";
	    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

	    @Override
	    public Connection createConnection() throws SQLException, ClassNotFoundException {
	        Class.forName(DRIVER);
	        return DriverManager.getConnection(URL, USER, PASS);
	    }
	    
	    

}
