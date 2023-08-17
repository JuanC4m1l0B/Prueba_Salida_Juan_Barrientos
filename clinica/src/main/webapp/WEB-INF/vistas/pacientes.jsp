<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de pacientes</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
<%@ include file='menu.jsp'%>
</head>
<body>
<header>
<%@ include file='menu.jsp'%>
</header>
<div class = "container">


<section>

<table class="table">
<thead class="table dark">
<tr>
<th>Id</th>
<th>Nombre</th>
<th>Fecha de Nacimiento</th>
</tr>
</thead>
<tbody>

<c:forEach var="p" items="${pacientes}">
<tr>
<td><c:out value="${p.getId()}"></c:out></td>
<td><c:out value="${p.getNombre()}"></c:out></td>
<td><c:out value="${p.getFecha_Nacimiento()}"></c:out></td>
</tr>
</c:forEach>

</tbody>

</table>

</section>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
		    <%@ include file='footer.jsp'%>
</body>
</html>