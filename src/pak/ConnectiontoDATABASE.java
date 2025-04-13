package pak;
import java.sql.DriverManager;
import javax.swing.*;
import java.sql.*;

public class ConnectiontoDATABASE {
	Connection conn = null;
	public static Connection connect() {
		
		try {
			Class.forName("org.sqlite.JDBC");
			 Connection conn = DriverManager.getConnection("jdbc:sqlite:databaselogin.db"); // Copy Qualified name or just copy file location
			 JOptionPane.showMessageDialog(null, "Connection Done");
			return conn;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
}
}