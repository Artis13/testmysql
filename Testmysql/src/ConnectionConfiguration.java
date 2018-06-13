import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionConfiguration {
    public static Connection getConnection(){
        Connection connection = null;

        try {

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
            Class.forName("com.mysql.cj.jdbc.MysqlConnectionPoolDataSource").newInstance();
            // com.mysql.jdbc.Driver
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
