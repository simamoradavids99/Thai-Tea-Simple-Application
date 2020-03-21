
package ThaiTea;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection mysqlconfig;
    
    public static Connection configDB()throws SQLException{
    try {
        String ur1 = "jdbc:mariadb://localhost:3306/thaiteadb";
        String user = "root";
        String pass ="";
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        mysqlconfig = DriverManager.getConnection(ur1, user, pass);
    }catch (SQLException e){
        System.err.println("koneksi gagal" + e.getMessage());      
    }
    
    return mysqlconfig;
    }
}
