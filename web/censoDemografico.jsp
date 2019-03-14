<%-- 
    Document   : censoDomografico
    Created on : 13/03/2019, 20:30:27
    Author     : luciane
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Censo Demografico</title>
    </head>
    <body>
        <%
            if (request.getAttribute("estados") != null) {
                String[] estados = (String[]) request.getAttribute("estados");

        %>


        <form action="estados" method="Post">
            <fieldset><legend>Selecione o Estado da Federação</legend><br />
                <select>
                    <option value="estados" size="30">Selecione</option>
                    <option value="estado1" size="30"><%out.println(estados[0]);%></option>
                    <option value="estado2" size="30"><%out.println(estados[1]);%></option>
                    <option value="estado3" size="30"><%out.println(estados[2]);%></option>
                </select>
                <br /><br />
            </fieldset>     
        </form>
        <%}%>
    </body>
</html>
