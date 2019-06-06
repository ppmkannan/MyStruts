package mysqlcon;

import java.sql.*;  
class MysqlCon{  
	public static void main(String args[]){  
	try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirstschema","root","root");  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from myfirsttable");  
		while(rs.next())  
		System.out.println(rs.getString("username")+"  "+rs.getString("password"));  
		con.close();  
	}catch(Exception e){ System.out.println(e);}  
	}  
}