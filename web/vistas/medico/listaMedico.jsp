


<%@page import="Modelo.Medico"%>
<%@page import="ModeloLogic.MedicoLogic"%>
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
                        <th class="text-center">Número de tarjeta profesional</th>
                        <th class="text-center">Años de Experiencia</th>
                        <th class="text-center">Especialidad</th>
                        <th class="text-center">Hora de inicio de atención</th>
                        <th class="text-center">Hora de fin de atención</th>
                        <th class="text-center">Acciones</th>
                    </tr>
                </thead>
                <%
                    MedicoLogic medico = new MedicoLogic();
                    List<Medico> list = medico.listaMedicos();
                    Iterator<Medico> iter = list.iterator();
                    Medico med = null;
                    while (iter.hasNext()) {
                        med = iter.next();

                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= med.getNombreCompleto()%></td>
                        <td class="text-center"><%= med.getIdentificacion()%></td>
                        <td class="text-center"><%= med.getTipoIdentificacion()%></td>
                        <td class="text-center"><%= med.getNumeroTProfesional()%></td>
                        <td class="text-center"><%= med.getAniosExperiencia()%></td>
                        <td class="text-center"><%= med.getEspecialidad()%></td>
                        <td class="text-center"><%= med.getHoraInicioAtencion()%></td>
                        <td class="text-center"><%= med.getHoraFinAtencion()%></td>
                        <td>
                            <div class="row">
                                <div class="row-12 text-center">
                                    <a class=" centrarBoton btn btn-danger" href="ControladorMedico?accion=editarMedico&identificacion=<%= med.getIdentificacion()%>">Editar</a>                                    
                                    <a class=" centrarBoton btn btn-danger" href="ControladorMedico?accion=eliminar&identificacion=<%= med.getIdentificacion()%>">Eliminar</a>
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
                    <a class=" content-center btn btn-success"  href="ControladorMedico?accion=agregarMedico">Agregar Médico</a>                    
                </div>
                <br>
                <div>
                    <a class="btn btn-default" href="index.jsp">Regresar</a>    
                </div>
            </div>
        </div>
    </body>
</html>
