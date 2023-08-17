<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de citas</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
  // Aquí puedes agregar tus scripts si los necesitas
</script>
</head>

<body>
<header>
<%@ include file='menu.jsp'%>
</header>


<section>

<table class="table">
<thead class="table-dark"> <!-- Cambiado a "table-dark" -->
<tr>
<th>Id</th>
<th>Paciente Id</th>
<th>Doctor Id</th>
<th>Fecha</th>
<th>Factura Id</th>
</tr>
</thead>
<tbody>

<c:forEach var="p" items="${citas}">
<tr>
<td><c:out value="${p.id}"/></td> <!-- Corregido el acceso a los atributos -->
<td><c:out value="${p.paciente_Id}"/></td>
<td><c:out value="${p.doctor_Id}"/></td>
<td><c:out value="${p.fecha}"/></td>
<td><c:out value="${p.factura_Id}"/></td>
</tr>
</c:forEach>

</tbody>

</table>

</section>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
<%@ include file='footer.jsp'%>
</div> <!-- Cerrado el div "container" -->
</body>
</html>
