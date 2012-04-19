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
public class DespliegaProductos {
    
    private static final String dbClassName = "com.mysql.jdbc.Driver";
    private static final String CONNECTION = "jdbc:mysql://localhost:3306/tienda";
    private static final String userBD = "root";
    private static final String passwordBD = "";
    
    
  public static String despliega(String categoria){
      
      try {
          
      String http = "";
      String query;
    
      Class.forName(dbClassName);
      Connection c = DriverManager.getConnection(CONNECTION, userBD, passwordBD);

      Statement s = c.createStatement();

      //Ejecuta el query
      if(categoria.equals("todos"))
      query = "SELECT * FROM productos";
      else 
      query = "SELECT * FROM productos WHERE categoria='" + categoria + "'"; 
      s.executeQuery(query);
      ResultSet rs = s.getResultSet();

      //Barre el query, imprime informacion;;
      while (rs.next()) {
      int id = rs.getInt("id");
      


      String nombre = rs.getString("nombre");
      String precio = rs.getString("precio");
  
      http +=
                       "<li>" 
                       + "<span><img id ='producto1' src='image.jsp?imgID=" + id + "' alt='shirt' /></span>" 
                       + "<span class='price'>$" + precio + "</span>" + nombre +"<br/>"
                       + "<a href='shop.jsp' class='buy'>Comprar</a>" 
		       + "</li>";
      
      }
      
   rs.close();
   s.close();
   c.close();
  return http;
      }
      
  catch (SQLException e) {
            return "Error en Sistema.java.." + e.getSQLState();
        } catch (ClassNotFoundException e) {
            return "Error en Sistema.java.." + e.getMessage();
        }
  }
  
  
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
 
   
