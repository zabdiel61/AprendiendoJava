<%-- 
    Document   : agregarAlumno
    Created on : 07-25-2022, 01:11:29 PM
    Author     : jonat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Alumno</title>
    </head>
    <body>
        <h1>Aregar Alumno</h1>
        <form name="form1" action="${pageContext.request.contextPath}/ServletAgregar" method="post">
            Nombre: <input type="text" name="nombre">
            <br/>
            Apellido: <input type="text" name="apellido">
            <br/>
            <br/>
            Datos Domicilio:
            <br/>
            Calle: <input type="text" name="calle">
            <br/>
            No. Calle: <input type="text" name="noCalle">
            <br/>
            Pais: <input type="text" name="pais">
            <br/>
            <br/>
            Datos de contacto:
            <br/>
            Email: <input type="email" name="email">
            <br/>
            Telefono: <input type="text" name="telefono">
            <br/>
            <input type="submit" name="Agregar" value="Agregar">
        </form>
    </body>
</html>
