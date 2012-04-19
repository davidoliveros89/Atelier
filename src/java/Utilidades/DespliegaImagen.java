/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.sql.*;

/**
 *
 * @author claudiahdz
 */
public class DespliegaImagen {
    
    
  /*-------------------------
   *   Get the Blob image
   *------------------------*/
  public static byte[] getPhoto (int iNumPhoto)
       throws Exception, SQLException
  {
      
    //Conecta a la base de datos
    Class.forName("com.mysql.jdbc.Driver");
    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");

    String req = "" ;
    Blob img ;
    byte[] imgData = null ;
    
    //Crea el Statement para hacer queries
    Statement s = c.createStatement();
  
    //Ejecuta el query
    s.executeQuery("SELECT foto FROM productos where id = " + iNumPhoto);
    ResultSet rs = s.getResultSet();
    
   
    while (rs.next ())
    {   
      img = rs.getBlob(1);
      imgData = img.getBytes(1,(int)img.length());
    }   
   
    rs.close();
    s.close();
    c.close();
    return imgData ;
 
}  
}
    
