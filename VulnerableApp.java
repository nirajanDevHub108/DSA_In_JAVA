import java.io.*;
import java.sql.*;
import javax.servlet.http.*;

public class VulnerableApp extends HttpServlet {

    // ⚠️ Hardcoded credentials
    private static final String DB_USER = "admin";
    private static final String DB_PASSWORD = "password123";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();

        // ⚠️ SQL Injection
        String username = request.getParameter("username");
        try {
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM users WHERE username = '" + username + "'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                out.println("User: " + rs.getString("username"));
            }
        } catch (SQLException e) {
            e.printStackTrace(); // ⚠️ Exposing stack trace
        }

        // ⚠️ Insecure file access (Path Traversal)
        String filename = request.getParameter("file");
        File file = new File("/var/data/" + filename);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace(); // ⚠️ Exposing stack trace
        }

        // ⚠️ Improper input validation
        String ageStr = request.getParameter("age");
        int age = Integer.parseInt(ageStr); // No validation
        out.println("Age entered: " + age);
    }
}
