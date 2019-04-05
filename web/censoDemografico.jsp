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
        <link rel="stylesheet" type="text/css" href="telaInicial.css">
        <script type="text/javascript" src="validarCampos.js"></script> 
        <title>Censo demográfico</title>

    </head>

    <body class="corpo">
        <header class="logado">
            <form action="telaDeLogin.jsp" method="POST">
                <input type="submit" value="Acessar Sistema"><br><br> 
            </form>

            <form action="cadastrarUsuarios.jsp" method="POST">
                <a>Não é cadastrado?</a> <input type="submit" value="Clique aqui!"><br><br> 
            </form>
        </header>

        <div class="principal">

            <div class="secao1">

                <h3>Dados de Cidades Brasileiras</h3>
                <h4>Escolha um estado para listar os dados de suas cidades:</h4><br />

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

                <h3> Tabela das Cidades do Estado Selecionado</h3> <br /><br />
                <form name="formDadosDaCidade" method="POST">

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

                    <%}%>
                </form>
            </div>

            <footer class="cabecalho"> 
                &&copy; Luciane Benetti e Marco Sena.

            </footer>
        </div>

    </body>
</html>
