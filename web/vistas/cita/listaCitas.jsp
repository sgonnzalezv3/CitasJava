<%-- 
    Document   : listaCitas
    Created on : 24/03/2021, 12:36:07 AM
    Author     : santi
--%>

<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Cita"%>
<%@page import="java.util.List"%>
<%@page import="ModeloLogic.CitaLogic"%>
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
            <h1 class="text-center">Citas</h1>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th class="text-center">Id</th>
                        <th class="text-center">Medico Id</th>
                        <th class="text-center">Paciente Id</th>
                        <th class="text-center">Fecha</th>
                        <th class="text-center">Hora</th>
                        <th class="text-center">Acciones</th>
                    </tr>
                </thead>
                <%
                    CitaLogic cita = new CitaLogic();
                    List<Cita> list = cita.listaCitas();
                    Iterator<Cita> iter = list.iterator();
                    Cita cit = null;
                    while (iter.hasNext()) {
                        cit = iter.next();

                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= cit.getId()%></td>
                        <td class="text-center"><%= cit.getMedicoId()%></td>
                        <td class="text-center"><%= cit.getPacienteId()%></td>
                        <td class="text-center"><%= cit.getFechaCita()%></td>
                        <td class="text-center"><%= cit.getHoraCita()%></td>
                        <td>
                            <div class="row">
                                <div class="row-12 text-center">
                                    <a class=" centrarBoton btn btn-danger" href="ControladorCita?accion=eliminar&id=<%= cit.getId()%>">Eliminar</a>
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
                    <a class=" content-center btn btn-success"  href="ControladorCita?accion=agregarCita">Agregar Cita</a>                    
                </div>
                <br>
                <div>
                    <a class="btn btn-default" href="index.jsp">Regresar</a>    
                </div>
            </div>
        </div>
    </body>
</html>
