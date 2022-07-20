<%-- 
    Document   : listado
    Created on : 07-18-2022, 11:02:11 AM
    Author     : jonat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de personas</title>
    </head>
    <body>
        <h1>Listado de Personas</h1>
        <table border="1">
            <caption>Listado de personas</caption>
            <tr>
                <th>Id Personas</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Email</th>
                <th>Telefono</th>
            </tr>
            <c:forEach var="persona" items="${personas}">
                <tr>
                    <th>${persona.idPersona}</th>
                    <th>${persona.nombre}</th>
                    <th>${persona.apellido}</th>
                    <th>${persona.email}</th>
                    <th>${persona.telefono}</th>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
