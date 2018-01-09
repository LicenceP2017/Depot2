import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Enumeration;
import java.util.Properties;
 
public class Connect {
 
    public static void main(String[] args) {
 
         try {
 
             Class.forName("org.sql.Driver");
 
             String url = "jdbc:sql://localhost:5432/Projet1";
             String user = "sql";
             String passwd = "sql";
 
             Connection conn = DriverManager.getConnection(url, user, passwd);
 
             System.out.println("Connection effective !");
 
         } catch (Exception e) {
 
             e.printStackTrace();
         }
    }
}