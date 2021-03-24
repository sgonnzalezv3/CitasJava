<%-- 
    Document   : editarPaciente
    Created on : 22/03/2021, 11:28:39 PM
    Author     : santi
--%>

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
        <h1 class="text-center">Editar Paciente</h1>

        <div class="container">
            <%
                PacienteLogic pL = new PacienteLogic();
                //String Identificacion = (String)request.getAttribute("Identificacion");
                String Identificacion = request.getParameter("identificacion");
                Paciente p = (Paciente) pL.list(Identificacion);
            %>
            <form action="Controlador">
                <label>Nombre Completo</label>

                <input class="form-control" type="text" name="txtNom" required value="<%=p.getNombreCompleto()%>"><br>
                <label>Tipo de Identificación</label>

                <input class="form-control" type="text" name="txtTId" required value="<%=p.getIdentificacion()%>"><br>
                <label>Identificación</label>

                <input class="form-control" type="text" name="txtId" required pattern="[0-9]*" value="<%=p.getIdentificacion()%>"><br>
                <label>Fecha de Nacimiento</label>

                <input class="form-control" type="date" name="txtFN"  required  pattern="[0-9]{4}-[0-9]{2}-[0-9]{2}" value="<%=p.getFNacimiento()%>"><br>
                <label>EPS</label>

                <input class="form-control" type="text" name="txtEPS" required value="<%=p.getEps()%>"><br>
                <label>Historia Clinica</label>

                <input class="form-control" type="text" name="txtHI" required value="<%=p.getHistoriaClinica()%>"><br>
                <div class="text-center">

                    <input type="submit" class="btn btn-success" name="accion" value="Actualizar"><br>
                    <br>
                    <a class="btn btn-default" href="Controlador?accion=listaPacientes">Regresar</a>    
                </div>


            </form>
            <

        </div>
    </body>
</html>
