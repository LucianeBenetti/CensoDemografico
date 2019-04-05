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
        <link rel="stylesheet" type="text/css" href="telaInicial.css">
        <title>Cadastrar Usuários</title>

    </head>
    <body class="corpo">

        <div class="principal">
            <div class="secao5">

            </div>

            <div class="logincadastro">
                <fieldset><legend><a>Insira os Dados para Cadastrar o Usuário</a></legend><br><br>

                    <form action="cadastrarusuario" method="post">
                        Nome  : <input type="text" name="nome"> <br><br>
                        Senha : <input type="password" name="senha"> <br><br>
                        <input type="submit" name="login" value="Cadastrar"/>                
                    </form><br>

                    <form action="censoDemografico.jsp" method="post">
                        <input type="submit" value = "Retornar para a Página Principal">
                    </form>  
                </fieldset>

            </div>
        </form>

        <div class="secao6">

        </div>
    </div>
</body>
</html>
