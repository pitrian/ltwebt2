package vn.iostar.configs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.DatabaseMetaData;

public class DBConnectSQL {
	private final String serverName = "localhost";
	private final String dbName = "ltwebt2";
	private final String portNumber = "1433";
	private final String instance ="";
	private final String userID = "sa";
	private final String password = "chung21345";

	
	public 	Connection getConnection() throws Exception{
		
			String url = "jdbc:sqlserver://"+ serverName+":"+portNumber	+"\\"+ instance +";databaseName ="+dbName;
			if 	(instance == null	|| instance.trim().isEmpty())
				
				url = "jdbc:sqlserver://" +serverName +":"+portNumber	+";databaseName ="+dbName;
			
			return  DriverManager.getConnection(url, userID, password);
	}	
			
		
		
		//test chương trình . run as ==> java application
		public  static void  main(String[]  args) {
			try {
				System.out.println(new DBConnectSQL().getConnection());
			} catch (Exception e ) {
				e.printStackTrace();
			}
		
		
		
	}
}
