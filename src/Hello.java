
import java.sql.*;

public class Hello {

	public static void main(String[] args) {
		try {
			//1. create connection to database
			Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cruddatabase", "root", "Sean0342591");
			// 2. create a statement
			Statement myStmt = myConn.createStatement();
			// 3. Execute SQL query
			ResultSet myRes = myStmt.executeQuery("SELECT * from movie_reviews");
			//4. Process the result set
			while(myRes.next()) {
				System.out.println(myRes.getString("id")+" "+ myRes.getString("movieName"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
