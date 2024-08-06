package scom.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CP {
	
	static Connection con;
	
	
	public static  Connection createconn() throws SQLException {
		
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			String user="root";
			String password="R123@rohit#";
			String url="jdbc:mysql://localhost:3306/ student_manage ";
			
			
			con= DriverManager.getConnection(url,user,password);
			
			
			
			
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		} catch (SQLException e) {
            e.printStackTrace();
        }
		
		return con;
	}

}
