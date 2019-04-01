<%-- 
    Document   : cadastrarEstado
    Created on : 01/04/2019, 09:48:00
    Author     : 80130917
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
        <h1>Tela para cadastrar Estado</h1> <br><br>
        <form action="cadastrarestado" method="POST">
             <fieldset><legend>Digite o nome do estado a ser cadastrado</legend><br />
            <br>
            <input type="text" name="novoEstado" ><br /><br />
            <input type="submit">   <br />         
            </fieldset> 
        </form>
          
    </body>
</html>
