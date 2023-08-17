<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <!-- Codificación de Caracteres -->
        <meta charset="UTF-8">

        <!-- Configuración inicial de ancho y escala -->
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- Título de la página -->
        <title>Inicio</title>

        <!-- Hoja de estilo -->
        <link rel="stylesheet" href="<core:url value="/res/css/estilo.css" />">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
    
    </head>
    <body>
        <header>
            <%@ include file='menu.jsp'%>
        </header>
        

        <section id="inicio" class="hero">
  <div class="hero-content">
    <h1>Bienvenido a Clínica Sanitas</h1>
    <p>Tu salud es nuestra prioridad</p>
  </div>

</section>

<section id="Quienessomos" class="quienessomos">
  
  <h1>Quiénes Somos</h1>
                <p>Clínica Sanitas es una institución médica comprometida con la salud y el bienestar de nuestros pacientes. Con años de experiencia en el campo de la medicina, nuestro equipo de médicos altamente calificados y personal de apoyo dedican su tiempo y esfuerzo para proporcionar la mejor atención médica posible.</p>
                <p>Nuestro enfoque se basa en la atención integral, la tecnología de vanguardia y la calidez humana. Estamos dedicados a brindar diagnósticos precisos, tratamientos efectivos y seguimiento continuo para garantizar la recuperación y la mejora de la calidad de vida de nuestros pacientes.</p>
                <p>En Clínica Sanitas, nos enorgullece ser parte de su camino hacia el bienestar y la salud. Nuestra misión es ser su aliado confiable en cada paso de su viaje hacia una vida saludable y feliz.</p>
         
</section>

   
        <script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>
		    <%@ include file='footer.jsp'%>
    </body>
</html>
