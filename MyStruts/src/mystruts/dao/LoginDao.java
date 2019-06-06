package mystruts.dao;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import org.apache.struts.upload.FormFile;

public class LoginDao {
    public void insertData(String userName, String password, FormFile file) throws Exception {
    	
    	String url = "jdbc:postgresql://localhost:5432/postgres";
    	String user = "postgres";
    	String passwd = "root";
    	
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, user, passwd);
 
        try {
 
            try {
//                Statement st = con.createStatement();
//                int value = st
//                        .executeUpdate("INSERT INTO login(username, password) "
//                                + "VALUES('"                                
//                                + userName
//                                + "','"
//                                + password
//                                + "')");
//                System.out.println("1 row affected" + value);
//                
//                ResultSet rs = st.executeQuery("SELECT * FROM login");
//                while (rs.next()) {
//                    // Didplaying data of tables
//                    System.out.println("Name : " + rs.getString("username"));
//                    System.out.println("password : " + rs.getString("password"));                    
//                }
//                
            	File image = (File) file;
                FileInputStream fis = new FileInputStream(image);
                PreparedStatement ps = con.prepareStatement("INSERT INTO login(username, password, image) VALUES (?, ?, ?)");
                ps.setString(1, userName);
                ps.setString(2, password);
                ps.setBinaryStream(3, fis, (int)(image).length());
                ps.executeUpdate();
                ps.close();
                fis.close();

            } catch (SQLException ex) {
                System.out.println("SQL statement is not executed!" + ex);
            }
            
            
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
