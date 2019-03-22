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
            <fieldset><legend>Selecione o Estado da Federação</legend><br />
                <select name="estadoSelecionado" form="selecionarEstado">
                    <option selected disabled >Selecione um Estado</option>
                    <option value="AC" ><%out.println(estados.get(0));%></option>
                    <option value="AL" ><%out.println(estados.get(1));%></option>
                    <option value="AP" ><%out.println(estados.get(2));%></option>
                    <option value="AM" ><%out.println(estados.get(3));%></option>
                    <option value="BA" ><%out.println(estados.get(4));%></option>
                    <option value="CE" ><%out.println(estados.get(5));%></option>
                    <option value="DF" ><%out.println(estados.get(6));%></option>
                    <option value="ES" ><%out.println(estados.get(7));%></option>
                    <option value="GO" ><%out.println(estados.get(8));%></option>
                    <option value="MA" ><%out.println(estados.get(9));%></option>
                    <option value="MT" ><%out.println(estados.get(10));%></option>
                    <option value="MS" ><%out.println(estados.get(11));%></option>
                    <option value="MG" ><%out.println(estados.get(12));%></option>
                    <option value="PA" ><%out.println(estados.get(13));%></option>
                    <option value="PB" ><%out.println(estados.get(14));%></option>
                    <option value="PR" ><%out.println(estados.get(15));%></option>
                    <option value="PE" ><%out.println(estados.get(16));%></option>
                    <option value="PI" ><%out.println(estados.get(17));%></option>
                    <option value="RJ" ><%out.println(estados.get(18));%></option>
                    <option value="RN" ><%out.println(estados.get(19));%></option>
                    <option value="RS" ><%out.println(estados.get(20));%></option>
                    <option value="RO" ><%out.println(estados.get(21));%></option>
                    <option value="RR" ><%out.println(estados.get(22));%></option>
                    <option value="SC" ><%out.println(estados.get(23));%></option>
                    <option value="SP" ><%out.println(estados.get(24));%></option>
                    <option value="SE" ><%out.println(estados.get(25));%></option>
                    <option value="TO" ><%out.println(estados.get(26));%></option>
                </select>
                <br /><br />

                <form action="cidades" method="POST" id="selecionarEstado">
                    <input type="hidden" name="estados" value="estadoSelecionado">
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

            <form > 
                <fieldset><legend>Cidades do Estado</legend><br />
                    <select>
                        <option selected disabled >Cidades</option>
                        <option value="cidade1" ><%out.println(cidadesBuscadas.get(0));%></option>
                        <option value="cidade2" ><%out.println(cidadesBuscadas.get(1));%></option>
                        <option value="cidade3" ><%out.println(cidadesBuscadas.get(2));%></option>
                        <option value="cidade4" ><%out.println(cidadesBuscadas.get(3));%></option>
                    </select>
                    <br /><br />
                </fieldset> 
            </form>
            <br />

            Tabela das Cidades do Estado Selecionado<br /><br />
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
                        <td ><input type="text" name="cidade_<%= i%>" value="<%= cidadesBuscadas.get(i)%>" ></td>
                    <%
  
                        int linhas = 0;
                        if (request.getAttribute("conteudo") != null) {
                            linhas = ((Integer) (request.getAttribute("conteudo"))).intValue();
                        }
                   
                            String populacao = (String) request.getAttribute(i + "populacao");
                            String area = (String) request.getAttribute(i + "area");
                            String densidade = (String) request.getAttribute(i + "densidade");
                            String pib = (String) request.getAttribute(i + "pib");
                    %>
                        <td ><input type="number" name="populacao_<%= i%>" value="<%= populacao %>"</td>
                        <td ><input type="number" name="area_<%= i%>" value="<%= area %>"</td>
                        <td ><input type="number" name="densidade_<%= i%>" value="<%= densidade%>"</td>
                        <td ><input type="number" name="pib_<%= i%>" value="<%= pib%>"</td>
                         
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
