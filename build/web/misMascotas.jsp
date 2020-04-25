<%-- 
    Document   : inicio
    Created on : 14/07/2019, 01:49:15 PM
    Author     : hp
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page session="true" %>
<!DOCTYPE html>
<html lang="en">
    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>SOULMATE</title>
        <link rel="icon" type="image/png" href="img/logo.png" />
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>
        <link type="text/css" rel="stylesheet" href="css/slick.css"/>
        <link type="text/css" rel="stylesheet" href="css/slick-theme.css"/>
        <link type="text/css" rel="stylesheet" href="css/nouislider.min.css"/>
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link type="text/css" rel="stylesheet" href="css/style.css"/>
    </head>
    <body>

        <header>


            <div id="header">
                <%@include file="userLog.jsp" %>
                <div class="container">
                    <div class="row">
                        <div class="col-md-3">
                            <div class="header-logo">
                                <a href="#" class="logo">
                                    <img src="./img/logo.png" alt="logo">
                                </a>
                            </div>
                        </div>
                        <div style="text-align: right">
                            <div class="contenedor">
                                <article>
                                    <select id="btn-abrir-popup" class="btn-abrir-popup">
                                        <option value="0">Filtro</option>
                                        <option value="1">Perros</option>
                                        <option value="1">Gatos</option>
                                    </select>
                                    <button id="btn-abrir-popup" class="btn-abrir-popup" onclick="location.href = 'adopcion.jsp?#'">Dar en adopción.</button>

                                </article>
                            </div>
                        </div>
                    </div>
                    <div class="contenedor">
                    </div>
                </div>
            </div>

        </div>
    </div>
</header>
<%@include file="navegacion.jsp" %>


<div class="col-md-12">
    <div class="section-title">
        <h1 class="title">Mis mascotas</h1>
        <form action="Controler" method="POST">
            
            <input type="submit" name="accion" value="ListarMisMascotas">

        </form>

    </div>

</div>


<div class="section">
    <!-- container -->
    <div class="container">
        <section class="columnasDivididas">

            <c:forEach var="dato" items="${listaMisMascotas}">
                <article>
                    <div class="product">
                        <a  href='adoptar.jsp?#'>
                            <div class="product-img">
                                <img src="./imagenesSubidas/${dato.getFoto()}" value = "${dato.getFoto()}"width="300" height="120">
                            </div>
                            <div class="product-body">

                                <h1>${dato.getNombre()}</h1>
                                <p>${dato.getDescripcion()}</p>
                                <ul style="text-align: justify;">
                                    <li><strong>Especie: </strong>${dato.getEspecie()}</li>
                                    <li><strong>Edad: </strong>${dato.getEdad()}</li>
                                    <li><strong>Vacunas: </strong>${dato.getVacuna()}</li>
                                    <li><strong>Teléfono: </strong>${dato.getTelefono()}</li>
                                </ul>


                            </div>
                        </a>
                    </div>
                </article>
            </c:forEach>
        </section>


    </div>
</div>

<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/slick.min.js"></script>
<script src="js/nouislider.min.js"></script>
<script src="js/jquery.zoom.min.js"></script>
<script src="js/main.js"></script>


</body>
</html>
