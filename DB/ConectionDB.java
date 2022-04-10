
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConectionDB {
public static Connection conn = null;
public static Connection setconn(){
    try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = DriverManager.getConnection("jdbc:sqlserver://AHMED-KASSIM:1433;databaseName=Clinic;user=aladhas;password=123456");
        System.out.println("conection success");
        return conn;
    }
    catch(Exception ex){   
        System.out.println("conection error !");
         JOptionPane.showMessageDialog(null, "Conection Database Error !");
        return null;
    }
}
}
