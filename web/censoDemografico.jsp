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
            if (request.getAttribute("lista") != null) {
                String[] estados = (String[]) request.getAttribute("lista");

        %>

        <form action="estados" method="POST">
            <fieldset><legend>Selecione o Estado da Federação</legend><br />
                <select>
                    <option value="estados" size="30">Selecione</option>
                    <option value="AC" size="30"><%out.println(estados[0]);%></option>
                    <option value="AL" size="30"><%out.println(estados[1]);%></option>
                    <option value="AP" size="30"><%out.println(estados[2]);%></option>
                    <option value="AM" size="30"><%out.println(estados[3]);%></option>
                    <option value="BA" size="30"><%out.println(estados[4]);%></option>
                    <option value="CE" size="30"><%out.println(estados[5]);%></option>
                    <option value="DF" size="30"><%out.println(estados[6]);%></option>
                    <option value="ES" size="30"><%out.println(estados[7]);%></option>
                    <option value="GO" size="30"><%out.println(estados[8]);%></option>
                    <option value="MA" size="30"><%out.println(estados[9]);%></option>
                    <option value="MT" size="30"><%out.println(estados[10]);%></option>
                    <option value="MS" size="30"><%out.println(estados[11]);%></option>
                    <option value="MG" size="30"><%out.println(estados[12]);%></option>
                    <option value="PA" size="30"><%out.println(estados[13]);%></option>
                    <option value="PB" size="30"><%out.println(estados[14]);%></option>
                    <option value="PR" size="30"><%out.println(estados[15]);%></option>
                    <option value="PE" size="30"><%out.println(estados[16]);%></option>
                    <option value="PI" size="30"><%out.println(estados[17]);%></option>
                    <option value="RJ" size="30"><%out.println(estados[18]);%></option>
                    <option value="RN" size="30"><%out.println(estados[19]);%></option>
                    <option value="RS" size="30"><%out.println(estados[20]);%></option>
                    <option value="RO" size="30"><%out.println(estados[21]);%></option>
                    <option value="RR" size="30"><%out.println(estados[22]);%></option>
                    <option value="SC" size="30"><%out.println(estados[23]);%></option>
                    <option value="SP" size="30"><%out.println(estados[24]);%></option>
                    <option value="SE" size="30"><%out.println(estados[25]);%></option>
                    <option value="TO" size="30"><%out.println(estados[26]);%></option>
                   
                </select>
                <br /><br />
            </fieldset>     
        </form>
        <%}%>
    </body>
</html>
