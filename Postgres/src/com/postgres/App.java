package com.postgres;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {
	
	private final String url = "jdbc:postgresql://localhost/postgres";
	private final String user = "postgres";
	private final String password = "root";

	public Connection connect() throws IOException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
            File file = new File("Articuno-desk.jpg");
            FileInputStream fis = new FileInputStream(file);
            PreparedStatement ps = conn.prepareStatement("INSERT INTO images VALUES (?, ?)");
            ps.setString(1, file.getName());
            ps.setBinaryStream(2, fis, (int)file.length());
            ps.executeUpdate();
            ps.close();
            fis.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
 
        return conn;
    }
 
    /**
     * @param args the command line arguments
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        App app = new App();
        app.connect();
    }

}
