<%-- 
    Document   : cadastrarCidade
    Created on : 03/04/2019, 11:05:56
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

        <header class="logado">

            <%
                String usuario = (String) request.getSession().getAttribute("user");
                if (usuario != null) {%>
            Você está logado como: <input type="text" size="20" readonly="" value="<%= usuario%>"> <br><br>
            <%   }%>  

        </header>

        <div>
            <h1>Tela para cadastrar Cidade</h1> <br><br>
            <form action="cadastrarcidade" method="POST">
                <fieldset>
                    <legend>Por gentileza, preencha os dados a seguir e clique em enviar.</legend><br />
                    <h3>Digite o nome do estado para incluir as cidades</h3>
                    <input type="text" name="estadoCadastrarCidade" ><br /><br />

                    <h3>Digite o nome da cidade a ser cadastrada</h3>
                    <br>
                    <input type="text" name="novaCidade" ><br /><br />
                    <input type="submit">   
                    <br />         
                </fieldset> 
            </form>
        </div>
    </body>
</html>
