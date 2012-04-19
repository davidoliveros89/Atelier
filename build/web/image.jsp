<%@ page import = "Utilidades.DespliegaProductos" %>
<%@ page import = "java.io.*" %>
<%
 
  int iNumPhoto ;
 
  if ( request.getParameter("imgID") != null )
  {
  
    iNumPhoto = Integer.parseInt(request.getParameter("imgID")) ;  
 
       // get the image from the database
       byte[] imgData = DespliegaProductos.getPhoto(iNumPhoto) ;  
       // display the image
       response.setContentType("image/gif");
       OutputStream o = response.getOutputStream();
       o.write(imgData);
       o.flush();
       o.close();

  }
%>
