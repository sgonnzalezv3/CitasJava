<%-- 
    Document   : agregarCita
    Created on : 24/03/2021, 12:36:16 AM
    Author     : santi
--%>

<%@page import="Modelo.Paciente"%>
<%@page import="ModeloLogic.PacienteLogic"%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Medico"%>
<%@page import="java.util.List"%>
<%@page import="ModeloLogic.MedicoLogic"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>

        <title>JSP Page</title>
    </head>
    <body>
        <h1 class="text-center">Nueva Cita</h1>

        <div class="container">
            <form action="ControladorCita">
                <div class="form-">
                    <label>Médico</label><br>

                    <select name="txtMI" class="form-se" >
                        <%
                            MedicoLogic medico = new MedicoLogic();
                            List<Medico> list = medico.listaMedicos();
                            Iterator<Medico> iter = list.iterator();
                            Medico med = null;
                            while (iter.hasNext()) {
                                med = iter.next();
                        %>
                        <option  value="<%= med.getIdentificacion()%>"><%= med.getNombreCompleto()%> - <%= med.getIdentificacion()%></option>
                        <%}%>
                    </select>
                    <br>
                    <label>Paciente</label><br>
                    <select name="txtPI" >
                        <%
                            PacienteLogic paciente = new PacienteLogic();
                            List<Paciente> lista = paciente.listaPacientes();
                            Iterator<Paciente> iterator = lista.iterator();
                            Paciente pac = null;
                            while (iterator.hasNext()) {
                                pac = iterator.next();
                        %>
                        <option  value="<%= pac.getIdentificacion()%>"><%= pac.getNombreCompleto()%> - <%= pac.getIdentificacion()%> </option>
                        <%}%>
                    </select><br>
                    <label>Fecha Cita</label>
                    <input type="date"  placeholder="Digite la fecha de la cita" class="form-control" name="txtFC" pattern="[0-9]{4}-[0-9]{2}-[0-9]{2}"><br>
                    <label>Hora Cita</label>
                    <input type="time"  class="form-control" name="txtHC"  required placeholder="Escriba número de tarjeta profesional"><br>

                    <div>
                        <div class="container row text-center">
                            <div class="col-6">   
                                <input class="btn btn-success" type="submit" name="accion" value="Agregar"><br>
                            </div>
                            <br>
                            <div class="col-6">
                                <a class="btn btn-default" href="ControladorCita?accion=listaCitas">Regresar</a>      
                            </div>
                        </div>
                    </div>
                </div>
                <br>

            </form>
        </div>
    </body>
</html>
