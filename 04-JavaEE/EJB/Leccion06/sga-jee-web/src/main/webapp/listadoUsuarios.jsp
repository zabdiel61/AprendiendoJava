<%-- 
    Document   : listadoUsuarios
    Created on : 07-10-2022, 11:28:06 PM
    Author     : jonat
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de usuarios</title>
    </head>
    <body>
        <h1>Listado de usuarios</h1>
        <ul>
            <c:forEach items="${usuarios}" var="usuario">
                <li>${usuario.idUsuario} ${usuario.username} ${usuario.password}</li>
                </c:forEach>
        </ul>
    </body>
</html>
