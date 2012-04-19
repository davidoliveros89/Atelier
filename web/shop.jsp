<!DOCTYPE html>
<!-- Website template by freewebsitetemplates.com -->
<%@ page import = "Utilidades.DespliegaProductos" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>Proyecto DAD</title>
	<link rel="stylesheet" href="css/style.css" type="text/css" charset="utf-8" />
        <link href='http://fonts.googleapis.com/css?family=Graduate' rel='stylesheet' type='text/css'>
       <script type="text/javascript" src="funciones.js"></script>
</head>

<body>
	<div id="background">
		<div id="page">
			<div id="header">
				<span id="connect">
					<a href="http://facebook.com/memes-cristianos" target="_blank" class="facebook"></a>
					<a href="http://twitter.com/charlmander" target="_blank" class="twitter"></a>
					<a href="http://www.youtube.com/" target="_blank" class="vimeo"></a>
				</span>
				<span id="infos">
					<a href="">Ver Compras</a>|<a href="">Checkout</a>
				</span>
				<a href="index.html" id="logo"></a> <!-- /#logo -->
				<ul id="navigation">
					<li><a href="fundas.jsp">Fundas</a></li>
                                        <li class="selected"><a href="joyeria.jsp">Joyeria</a></li>
					<li><a href="about.html">Acerca de</a></li>
					<li><a href="contact-us.html">Contacto</a></li>
				</ul>
			</div> <!-- /#header -->
			<div id="contents">
				<div id="shop">
					<ul class="items">	
                                            
                                          
                                            <%= DespliegaProductos.despliega("todos") %>  
                                            
                                            
					</ul>
                               
				</div>
			</div> <!-- /#contents -->
			<div id="footer">
				<div id="description">
					<div>
						<a href="index.html" class="logo"></a>
						<span>&copy; Copyright &copy; 2011. <a href="index.html">Company name</a> All rights reserved</span>
					</div>
					<p>
						Proyecto de DAD. Claudia, David y Carlos.
					</p>
				</div>
				<div class="navigation">
					<a href="index.html">Home</a>|
                                        <a href="shop.jsp">Tienda</a>|
					<a href="about.html">Acerca de</a>|
					<a href="contact-us.html">Contacto</a>
				</div>
			</div> <!-- /#footer -->
		</div> <!-- /#page -->
	</div> <!-- /#background -->
</body>
</html>
