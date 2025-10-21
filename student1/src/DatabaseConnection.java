import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
       public static Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // Load MySQL driver
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student", "root", ""  // Update with your DB name and password
            );
        } catch (Exception e) {
            System.out.println("❌ Connection failed: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}