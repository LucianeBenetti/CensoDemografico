<%-- 
    Document   : paginaComum
    Created on : 02/04/2019, 13:55:38
    Author     : 80130917
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="censoDemografico.css">
        <script type="text/javascript" src="validarCampos.js"></script> 
        <title>Comum</title>

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
                    <img src="Slide1.PNG" alt="Senac" width="1400" height="150">
                </div>
                <div class="carousel-item">
                    <img src="Slide2.PNG" alt="Disciplina" width="1400" height="150">
                </div>
                <div class="carousel-item">
                    <img src="Slide3.PNG" alt="Professor" width="1400" height="150">
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
    <body>
        <div class="logado">
    <%
                Object nomeUsuario = request.getAttribute("login");
                if (nomeUsuario != null) {%>
    <input size="5" type="text" value="<%= nomeUsuario%>">
    <%   }
    %>  
    <input

</div>
    </body>
</html>
