<%-- 
    Document   : censoDemograficoAutenticado
    Created on : 02/04/2019, 19:13:00
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

    <body>

        <header class="logado">

            <%
                Object nomeUsuario = request.getAttribute("login");
                if (nomeUsuario != null) {%>
            <input type="text" readonly="" value="<%= nomeUsuario%>"> <br><br>
            <%   } %>  

        </header>

        <div class="principal">

            <div class="secao1">

                <h3>Atualização de Dados de Cidades Brasileiras</h3>
                <h4>Escolha um estado para atualizar os dados de uma cidade:</h4><br />

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
                        <input type="submit" value="Gerar tabela"<br><br>
                        </form>

                        <form action="cadastrarCidade.jsp" method="POST" >
                            <br><br>
                            <input type="submit" value="Cadastrar Cidades"<br><br>
                        </form>

                    </fieldset>  

                    <%} %>   
                    <form action="cadastrarEstado.jsp" method="POST">
                        <br><br>
                        <input type="submit" value="Cadastrar novo Estado"><br><br>

                    </form>

            </div> 
            <div class="secao2">

                <%
                    Object cidades = request.getAttribute("listaCidades");
                    if (cidades != null) {
                        ArrayList<String> cidadesBuscadas = (ArrayList<String>) cidades;
                %>

                <h3> Tabela das Cidades do Estado Selecionado</h3> <br /><br />
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
                            <td ><input type="number" step="any" name="populacao_<%= i%>" value="<%= populacao%>"</td>
                            <td ><input type="number" step="any" name="area_<%= i%>" value="<%= area%>"</td>
                            <td ><input type="number" step="any" name="densidade_<%= i%>" value="<%= densidade%>"</td>
                            <td ><input type="number" step="any" name="pib_<%= i%>" value="<%= pib%>"</td>

                        </tr>
                        <% }%>  
                    </table><br /><br />

                    <input type="submit" value="Gravar Dados">

                    <%}%>
                </form>


                <%
                    if (request.getAttribute("caminho") == null) {
                        out.println("Arquivo ainda não foi gravado!");%><br><br>

                <%} else {
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
