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

            <div class="cadastroEstado">

             <form action="cadastrarestado" method="POST">
                 <fieldset><legend><a>Digite o nome do estado a ser cadastrado</a></legend><br />
                    <br>
                    <input type="text" name="novoEstado" ><br /><br />
                    <input type="submit">   <br />         
                 </form><br>

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
