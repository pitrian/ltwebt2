package vn.iostar.configs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import vn.iostar.models.UserModel;

public class DBConnectMySQL {

	private static String USERNAME = "root";
	private static String PASSWORD ="chung21345";
	private static String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static String URL = "jdbc:mysql://localhost:3306/ltwebt2";
	
	public static Connection getDatabaseConnection() throws SQLException, Exception {
		try {	
			Class.forName(DRIVER);
			return DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
}

	public static void main(String[] args) {
		try {
			new DBConnectMySQL();
			System.out.println(DBConnectMySQL.getDatabaseConnection());	
		} catch (Exception e 	) {
			e.printStackTrace();
		}
	}

	public List<UserModel> FindAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
