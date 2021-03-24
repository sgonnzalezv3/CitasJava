
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>

        <title>JSP Page</title>
    </head>
    <body>
        <h1 class="text-center">Agregar Médico</h1>

        <div class="container">
            <form action="ControladorMedico">
                <div class="form-">
                    <label>Nombre Completo</label>
                    <input type="text" placeholder="Escriba el nombre completo del médico" class="form-control" name="txtNom" required><br>
                    <label>Tipo de Identificación</label>
                    <input type="text" placeholder="Escriba el tipo de identificación del médico" class="form-control" name="txtTId" required><br>
                    <label>Identificación</label>
                    <input type="number"  placeholder="Digite la identificación del médico" class="form-control" name="txtId" required pattern="[0-9]*"><br>
                    <label>Número de tarjeta profesional</label>
                    <input type="number"  class="form-control" name="txtTP"  required pattern="[0-9]{4}-[0-9]{2}-[0-9]{2}" placeholder="Escriba número de tarjeta profesional"><br>
                    <label>Años de experiencia</label>
                    <input type="number" placeholder="Escriba los años de experiencia del médico" class="form-control" name="txtAE" required><br>
                    <label>Especialidad</label>
                    <input type="text" placeholder="Escriba la especialidad del medico" class="form-control" name="txtEs" required><br>
                    <label>Hora de inicio de atención</label>
                    <input type="time" placeholder="Escriba la Hora en que inicia la atención" class="form-control" name="txtHI" required><br>
                    <label>Hora final de atención</label>
                    <input type="time" placeholder="Escriba la Hora en que finaliza la atención" class="form-control" name="txtHF" required><br>
                    <div>
                        <div class="container row text-center">
                            <div class="col-6">   
                                <input class="btn btn-success" type="submit" name="accion" value="Agregar"><br>
                            </div>
                            <br>
                            <div class="col-6">
                                <a class="btn btn-default" href="ControladorMedico?accion=listaMedicos">Regresar</a>      
                            </div>
                        </div>
                    </div>
                </div>
                <br>

            </form>
        </div>
    </body>
</html>
