package imageupload.dao;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Base64;

import javax.servlet.http.*;

import org.apache.struts.upload.FormFile;

import imageupload.form.UploadForm;

public class UploadDao {
	public void insertData(String userName, String password, File file) throws Exception {

		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String passwd = "root";
		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection(url, user, passwd);

		try {

			try {
				Statement st = con.createStatement();
//                int value = st
//                        .executeUpdate("INSERT INTO login(username, password) "
//                                + "VALUES('"                                
//                                + userName
//                                + "','"
//                                + password
//                                + "')");
//                System.out.println("1 row affected" + value);
//                
				ResultSet rs = st.executeQuery("SELECT * FROM login");
				while (rs.next()) {
					// Displaying data of tables
					System.out.println("Name : " + rs.getString("username"));
					System.out.println("password : " + rs.getString("password"));
//                    Bytes
					System.out.println("image : " + rs.getBinaryStream("image"));
				}
//                
				File image = file;
				FileInputStream fis = new FileInputStream(image);
				PreparedStatement ps = con
						.prepareStatement("INSERT INTO login(username, password, image) VALUES (?, ?, ?)");
				ps.setString(1, userName);
				ps.setString(2, password);
				ps.setBinaryStream(3, fis, (int) (image).length());
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

	public void getFile(File file) throws ClassNotFoundException, SQLException, IOException {

		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String passwd = "root";

		Class.forName("org.postgresql.Driver");
		Connection con = DriverManager.getConnection(url, user, passwd);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM login");

		while (rs.next()) {
			// Displaying data of tables
			System.out.println("Name : " + rs.getString("username"));
			System.out.println("password : " + rs.getString("password"));
			System.out.println("IMAGE : " + rs.getBytes("file"));
//    }
		}
		//		File temp = file;
//		FileOutputStream fos = new FileOutputStream(temp);
//		    rs.next();
//		    byte[] fileBytes = rs.getBytes(1);
//		    fos.write(fileBytes);
//		UploadForm.setFile(file);
		while (rs.next()) {			
			HttpServletRequest request = null;
			HttpSession session = request.getSession(true);
			String img = "data:image/jpeg;base64," + Base64.getEncoder().encodeToString(rs.getBytes("file"));
			session.setAttribute("url", img);
		}
	}
}
