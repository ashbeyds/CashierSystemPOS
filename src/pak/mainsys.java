package pak;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class mainsys {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:sqlite:/C:\\Users\\alcai\\database.db";
		
		try {

			Connection connection = DriverManager.getConnection(jdbcUrl);
			Statement statement = connection.createStatement();
			
			ResultSet result = statement.executeQuery("SELECT * FROM database");
			
			while (result.next()) {
				System.out.println(result.getString("name"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
