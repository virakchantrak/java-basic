package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() throws Exception {
        String url = "jdbc:postgresql://localhost:5432/school-management";
        String user = "postgres";
        String pass = "Virak@123";

        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(url, user, pass);
    }
}
