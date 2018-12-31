
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANIL
 */
public class database
{

    private static void forname(String orgsqliteJDBC) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Connection con;
    public static Connection connecrDb()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection con=DriverManager.getConnection("");
            return con;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;     
        }
    }
}
