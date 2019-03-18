<%-- 
    Document   : censoDomografico
    Created on : 13/03/2019, 20:30:27
    Author     : luciane
--%>

<%@page import="Servlet.CidadesBuscadas"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Censo Demografico</title>
        <!--        <script>
                   document.form(estados).onchange();
                </script>-->

    </head>
    <body>
        <form action="estados" method="POST"> 
            <h2>Listar Estados Brasileiros</h2><br />
            <input type="submit" name="conteudo" value="Acessar estados"><br><br>
        </form> 

        <form action="cidades" method="POST" id="selecionarEstado">

            <input type="hidden" name="estados" value="estadoSelecionado">
            <input type="submit"<br><br>

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
        </fieldset>   

        <%} %>

        <%

            Object cidades = request.getAttribute("listaCidades");
            if (cidades != null) {
                ArrayList<String> cidadesBuscadas = (ArrayList<String>) cidades;
        %>
        <form> 
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
            <form action="gravardadoscidades" method="POST">
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
                <tr>
                    <td ><input type="text" name="cidade1" value="<%= cidadesBuscadas.get(0) %>" ></td>     
                    <td ><input type="text" name="pop1"></td>
                    <td ><input type="text" name="area1"></td>
                    <td ><input type="text" name="dens1"></td>
                    <td ><input type="text" name="pib1"></td>
                </tr>
                <tr>
                    <td><%out.println(cidadesBuscadas.get(1));%></td>     
                    <td ><input type="text" name="pop2"></td>
                    <td ><input type="text" name="area2"></td>
                    <td ><input type="text" name="dens2"></td>
                    <td ><input type="text" name="pib2"></td>
                </tr>
                <tr>
                    <td><%out.println(cidadesBuscadas.get(2));%></td>     
                    <td ><input type="text" name="pop3"></td>
                    <td ><input type="text" name="area3"></td>
                    <td ><input type="text" name="dens3"></td>
                    <td ><input type="text" name="pib3"></td>
                </tr>
                <tr>
                    <td><%out.println(cidadesBuscadas.get(3));%></td>     
                    <td ><input type="text" name="pop4"></td>
                    <td ><input type="text" name="area4"></td>
                    <td ><input type="text" name="dens4"></td>
                    <td ><input type="text" name="pib4"></td>
                </tr>
              
            </table><br /><br />
            
                    <input type="submit" value="Gravar Dados">
                    
            <%}%>
            
            
            </form>
           <%
//         Object arquivoGravado= request.getParameter("arquivoGravado");
//         
//         if(arquivoGravado!=null){
//             
//             out.println ("Arquivo gravado com sucesso!");
//             
//         }else{
//            
//             out.println ("Não foi possível gravar o arquivo!");
//          
//         }
         %>
            
    </body>
</html>
