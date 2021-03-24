<%-- 
    Document   : index
    Created on : 22/03/2021, 06:23:46 PM
    Author     : santi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/bootstrap.css" rel="stylesheet" type="text/css"/>

        <title>JSP Page</title>
    </head>
    <div class="container">
        <a class="btn btn-success btn-lg" href="Controlador?accion=listaPacientes">Pacientes</a>
        <a class="btn btn-success btn-lg" href="ControladorMedico?accion=listaMedicos">Médicos</a>
        <a class="btn btn-success btn-lg" href="ControladorCita?accion=listaCitas">Citas</a>
    </div>
