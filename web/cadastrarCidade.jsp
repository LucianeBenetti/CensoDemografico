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
        <link rel="stylesheet" type="text/css" href="telaInicial.css">
        <title>JSP Page</title>
    </head>
    <body class="corpo">
        <header class="logado">
            <%
                String usuario = (String) request.getSession().getAttribute("user");
                if (usuario != null) {%>
            Você está logado como: <input type="text" size="20" readonly="" value="<%= usuario%>"> <br><br>
            <%   }%>  

        </header>

        <div class="principal"> 

            <div class="secao5">

            </div>

            <div class="cadastroCidade">

                <form action="cadastrarcidade" method="POST">
                    <fieldset>
                        <legend><a>Por gentileza, preencha os dados a seguir e clique em enviar.</a></legend><br />
                        Digite o nome do estado para incluir as cidades
                        <input type="text" name="estadoCadastrarCidade" ><br /><br />

                        Digite o nome da cidade a ser cadastrada
                        <input type="text" name="novaCidade" ><br /><br />
                        <input type="submit">   
                        
                        </form><br><br>

                        <form action="censoDemograficoAutenticado.jsp" method="post">
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
