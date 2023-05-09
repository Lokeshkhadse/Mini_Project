package Employee_management_system;

import java.sql.*;

public class Conn {     // 5 step to jdbc connectivity
	  
	 Connection c;                   // interface it is sql pakage
	 Statement s;
	
	
	public Conn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");    //1st step register Drive class
			c=DriverManager.getConnection("jdbc:mysql:///  employeemanagementsystem1","root","lokesh19112002"); // 2nd step create in connection string
		    s=c.createStatement();              // 3rd  step create statement
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}  
	
	
	
	

	public static void main(String[] args) {
		

	}

}
