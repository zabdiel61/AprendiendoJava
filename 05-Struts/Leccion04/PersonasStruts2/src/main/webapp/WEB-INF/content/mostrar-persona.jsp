<%-- 
Document   : saludos
Created on : 02-07-2023, 11:46:01 AM
Author     : jonat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:property value="titulo"/></title>
    </head>
    <body>
        <h1><s:property value="titulo"/></h1>
        <s:form>
            <s:textfield name="nombre"/>
            <s:submit key="persona.boton" name="submit"/>
        </s:form>
        <div>
            <s:property value="valor"/> :
            <s:property value="nombre"/>
        </div>
    </body>
</html>
