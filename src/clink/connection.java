package clink;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class connection {
    public static Connection getConnection(){
     
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/clink", "root", "");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        return con;
    }
}
