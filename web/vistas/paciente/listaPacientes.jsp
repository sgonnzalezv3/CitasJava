<%-- 
    Document   : listaPacientes
    Created on : 22/03/2021, 06:25:16 PM
    Author     : santi
--%>


<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Paciente"%>
<%@page import="ModeloLogic.PacienteLogic"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>

        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1 class="text-center">Pacientes</h1>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th class="text-center">Nombre Completo</th>
                        <th class="text-center">Identificación</th>
                        <th class="text-center">Tipo de Identificación</th>
                        <th class="text-center">EPS</th>
                        <th class="text-center">Fecha de Nacimiento</th>
                        <th class="text-center">Historia Clinica</th>
                        <th class="text-center">Acciones</th>
                    </tr>
                </thead>
                <%
                    PacienteLogic paciente = new PacienteLogic();
                    List<Paciente> list = paciente.listaPacientes();
                    Iterator<Paciente> iter = list.iterator();
                    Paciente pac = null;
                    while (iter.hasNext()) {
                        pac = iter.next();

                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= pac.getNombreCompleto()%></td>
                        <td class="text-center"><%= pac.getIdentificacion()%></td>
                        <td class="text-center"><%= pac.getTipoIdentificacion()%></td>
                        <td class="text-center"><%= pac.getEps()%></td>
                        <td class="text-center"><%= pac.getFNacimiento()%></td>
                        <td class="text-center"><%= pac.getHistoriaClinica()%></td>
                        <td>
                            <div class="row">
                                <div class="row-12 text-center">
                                    <a class=" centrarBoton btn btn-danger" href="Controlador?accion=editarPaciente&identificacion=<%= pac.getIdentificacion()%>">Editar</a>                                    
                                    <a class=" centrarBoton btn btn-danger" href="Controlador?accion=eliminar&identificacion=<%= pac.getIdentificacion()%>">Eliminar</a>
                                </div>
                            </div>

                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
            <br>
            <div class="text-center row">
                <div>
                    <a class=" content-center btn btn-success"  href="Controlador?accion=agregarPaciente">Agregar Paciente</a>                    
                </div>
                <br>
                <div>
                    <a class="btn btn-default" href="index.jsp">Regresar</a>    
                </div>
            </div>
        </div>
    </body>
</html>
