<%-- 
    Document   : censoDomografico
    Created on : 13/03/2019, 20:30:27
    Author     : luciane
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="censoDemografico.css">
        <script type="text/javascript" src="validarCampos.js"></script> 
        <title>Censo demográfico</title>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">  
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

        <style>
            /* Make the image fully responsive */  
            .carousel-inner{margin: 0 auto;       
            }
            .carousel-inner img {max-width: 100%;    
            }
            .container{float:top}
            .menu{float: bottom}
        </style>    

    <div class="container">    
        <div id="demo" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ul class="carousel-indicators">
                <li data-target="#demo" data-slide-to="0" class="active"></li>
                <li data-target="#demo" data-slide-to="1"></li>
                <li data-target="#demo" data-slide-to="2"></li>
            </ul>

            <!-- The slideshow -->
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="Slide1.PNG" alt="Senac" width="1500" height="150">
                </div>
                <div class="carousel-item">
                    <img src="Slide2.PNG" alt="Disciplina" width="1500" height="150">
                </div>
                <div class="carousel-item">
                    <img src="Slide3.PNG" alt="Professor" width="1500" height="150">
                </div>
            </div>
            <!-- Left and right controls -->
            <a class="carousel-control-prev" href="#demo" data-slide="prev">
                <span class="carousel-control-prev-icon"></span>
            </a>
            <a class="carousel-control-next" href="#demo" data-slide="next">
                <span class="carousel-control-next-icon"></span>
            </a>
        </div>
    </div>
</head>

</head>
<body>
    <div class="principal">

        <div class="secao1">

            <h5>Atualização de Dados de Cidades Brasileiras</h5>
            <h6>Escolha um estado para atualizar os dados de uma cidade:</h6><br />

            <form action="estados" method="POST"> 

                <input type="submit" name="conteudo" value="Acessar Lista de Estados"><br><br>
            </form>

            <%

                Object obj = request.getAttribute("lista");
                if (obj != null) {
                    ArrayList<String> estados = (ArrayList<String>) obj;

            %>
            <form action="cidades" method="POST" >
                <fieldset><legend>Selecione o Estado da Federação</legend><br />

                    <select name="estadoSelecionado" >
                        <option selected disabled >Selecione um Estado</option>
                        <% for (int i = 0; i < estados.size(); i++) {%>

                        <option value="<%=estados.get(i)%>_" ><%out.println(estados.get(i));%></option>

                        <%} %>  
                    </select>
                    <br /><br />
                    <input type="submit"<br><br>

                    </form>
                </fieldset>  

                <%} %>       

        </div> 
        <div class="secao2">
            <%

                Object cidades = request.getAttribute("listaCidades");
                if (cidades != null) {
                    ArrayList<String> cidadesBuscadas = (ArrayList<String>) cidades;
            %>

            <h5> Tabela das Cidades do Estado Selecionado</h5> <br /><br />
            <form name="formDadosDaCidade" onsubmit="return validarDadosDoFormulario()" action="gravardadoscidades" method="POST">

                <table border="1">
                    <thead>
                        <tr>
                            <th>Cidade</th>
                            <th>População</th>
                            <th>Àrea</th>
                            <th>Densidade</th>
                            <th>PIB</th>
                        </tr>
                    </thead>
                    <% for (int i = 0; i < cidadesBuscadas.size(); i++) {%>
                    <tr>
                        <td ><input readonly="" type="text" name="cidade_<%= i%>" value="<%= cidadesBuscadas.get(i)%>" ></td>
                            <%
                                String populacao = (String) request.getAttribute(i + "populacao");
                                String area = (String) request.getAttribute(i + "area");
                                String densidade = (String) request.getAttribute(i + "densidade");
                                String pib = (String) request.getAttribute(i + "pib");
                            %>
                        <td ><input readonly="" type="number" step="any" name="populacao_<%= i%>" value="<%= populacao%>"</td>
                        <td ><input readonly="" type="number" step="any" name="area_<%= i%>" value="<%= area%>"</td>
                        <td ><input readonly="" type="number" step="any" name="densidade_<%= i%>" value="<%= densidade%>"</td>
                        <td ><input readonly="" type="number" step="any" name="pib_<%= i%>" value="<%= pib%>"</td>

                    </tr>
                    <% }%>  
                </table><br /><br />

                <input type="submit" value="Gravar Dados">

                <%}%>
            </form>


            <%
                if (request.getAttribute("caminho") == null) {
                    out.println("Arquivo ainda não foi gravado!");
                } else {
                    String fullPath = (String) request.getAttribute("caminho");
                    out.println("Arquivo gravado com sucesso!");
                }
            %>         

        </div>
        <footer class="cabecalho"> 
            &&copy; Luciane Benetti e Marco Sena.
        </footer>
    </div>
</body>
</html>
