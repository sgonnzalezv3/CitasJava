

<%@page import="Modelo.Medico"%>
<%@page import="ModeloLogic.MedicoLogic"%>
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
        <h1 class="text-center">Editar Médico</h1>

        <div class="container">
            <%
                MedicoLogic mL = new MedicoLogic();
                //String Identificacion = (String)request.getAttribute("Identificacion");
                String Identificacion = request.getParameter("identificacion");
                Medico m = (Medico)mL.list(Identificacion);
            %>
            <form action="ControladorMedico">

                <label>Nombre Completo</label>
                <input type="text" placeholder="Escriba el nombre completo del médico" class="form-control" name="txtNom" required value="<%=m.getNombreCompleto()%>"><br>
                <label>Tipo de Identificación</label>
                <input type="text" placeholder="Escriba el tipo de identificación del médico" class="form-control" name="txtTId" required value="<%=m.getTipoIdentificacion()%>"><br>
                <label>Identificación</label>
                <input type="number"  placeholder="Digite la identificación del médico" class="form-control" name="txtId" required pattern="[0-9]*" value="<%=m.getIdentificacion()%>"><br>
                <label>Número de tarjeta profesional</label>
                <input type="number"  class="form-control" name="txtTP"  required pattern="[0-9]{4}-[0-9]{2}-[0-9]{2}" placeholder="Escriba número de tarjeta profesional" value="<%=m.getNumeroTProfesional()%>"><br>
                <label>Años de experiencia</label>
                <input type="number" placeholder="Escriba los años de experiencia del médico" class="form-control" name="txtAE" required value="<%=m.getAniosExperiencia()%>"><br>
                <label>Especialidad</label>
                <input type="text" placeholder="Escriba la especialidad del medico" class="form-control" name="txtEs" required value="<%=m.getEspecialidad()%>"><br>
                <label>Hora de inicio de atención</label>
                <input type="time" placeholder="Escriba la Hora en que inicia la atención" class="form-control" name="txtHI" required value="<%=m.getHoraInicioAtencion()%>"><br>
                <label>Hora final de atención</label>
                <input type="time" placeholder="Escriba la Hora en que finaliza la atención" class="form-control" name="txtHF" required value="<%=m.getHoraFinAtencion()%>"><br>

                <div class="text-center">

                    <input type="submit" class="btn btn-success" name="accion" value="Actualizar"><br>
                    <br>
                    <a class="btn btn-default" href="ControladorMedico?accion=listaMedicos">Regresar</a>    
                </div>


            </form>


        </div>
    </body>
</html>
