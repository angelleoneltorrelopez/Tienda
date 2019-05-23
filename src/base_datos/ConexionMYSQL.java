/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base_datos;
import java.sql.*;
import javax.swing.JOptionPane;


public class ConexionMYSQL{
 
public String db="farmacia";
public String url="jdbc:mysql://localhost/"+db;
public String user="root";
public String Pass="angelzero87A";
/**
 *
 * @author Angel
 */
public class conexionmysql {
    
}

public Connection Conectar()
{
    Connection link=null;
    try
    {
        Class.forName("org.gjt.mm.mysql.Driver");
        link= DriverManager.getConnection(this.url,this.user,this.Pass);
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
return link;


}

}