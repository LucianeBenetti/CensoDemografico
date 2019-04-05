<%-- 
    Document   : telaDeLogin
    Created on : 28/03/2019, 13:12:09
    Author     : 80130917
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="telaInicial.css">
        <title>Login de Usuário</title>
    </head>

    <body class="corpo">

        <div class="principal">
            <div class="secao3">

            </div>

            <div class="logincadastro">
                <fieldset><legend><a>Login de Usuários</a></legend><br><br>

                    <form action="validarusuario" method="post">
                        Nome  : <input type="text" name="nome" required=""> <br><br>
                        Senha : <input type="password" name="senha" required=""> <br><br>
                        <input type="submit" name="login" value="OK"/>

                    </form><br> 

                    <form action="censoDemografico.jsp" method="post">
                        <input type="submit" value = "Retornar para a Página Principal">
                    </form> 


                </fieldset>
            </div>
        </form>

        <div class="secao4">

        </div>
    </div>
</body>
</html>
