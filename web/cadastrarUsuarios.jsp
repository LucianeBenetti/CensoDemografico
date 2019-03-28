<%-- 
    Document   : cadastrarUsuarios
    Created on : 28/03/2019, 09:22:41
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
        <h1>Página de Cadastro de Usuários</h1> <br><br>
        <fieldset><legend>Dados do Usuário</legend><br><br>
        <form action="cadastrarusuario" method="post">
            Nome  : <input type="text" name="nome"> <br><br>
            Senha : <input type="password" name="senha"> <br><br>
            <input type="submit" name="login" value="Cadastrar"/> <br>

        </form>    
        </fieldset>
        </body>
</html>
