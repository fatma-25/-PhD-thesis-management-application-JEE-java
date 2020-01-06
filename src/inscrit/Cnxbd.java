package inscrit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Cnxbd {
	private static  Connection con ; 
	   
	   static {
		   try {
			Class.forName("com.mysql.jdbc.Driver") ;
			 	try {
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecoledoctorale1", "root", "");
				} catch (SQLException c) {
					// TODO Auto-generated catch block
					c.printStackTrace();
				}
		 
		} catch (ClassNotFoundException c) {
			// TODO Auto-generated catch block
			c.printStackTrace();
		}  
		   
		   
		   
	   }

	public static Connection getCon() {
		return con;
	}
}
