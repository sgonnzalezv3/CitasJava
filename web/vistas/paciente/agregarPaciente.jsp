
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>

        <title>JSP Page</title>
    </head>
    <body>
        <h1 class="text-center">Agregar Paciente</h1>

        <div class="container">
            <form action="Controlador">
                <div class="form-">
                    <label>Nombre Completo</label>
                    <input type="text" placeholder="Escriba el nombre completo del paciente" class="form-control" name="txtNom" required><br>
                    <label>Tipo de Identificación</label>
                    <input type="text" placeholder="Escriba el tipo de identificación del paciente" class="form-control" name="txtTId" required><br>
                    <label>Identificación</label>

                    <input type="number"  placeholder="Digite la identificación del paciente" class="form-control" name="txtId" required pattern="[0-9]*"><br>
                    <label>Tipo de Fecha de Nacimiento</label>

                    <input type="date"  class="form-control" name="txtFN"  required pattern="[0-9]{4}-[0-9]{2}-[0-9]{2}"><br>
                    <label>EPS</label>

                    <input type="text" placeholder="Escriba la EPS del paciente" class="form-control" name="txtEPS" required><br>
                    <label>Historia Clinica</label>

                    <textarea type="textarea" placeholder="Describa la historia clinica del paciente"  class="form-control" name="txtHI" required></textarea><br>
                    <div>
                        <div class="container row text-center">
                            <div class="col-6">   
                                <input class="btn btn-success" type="submit" name="accion" value="Agregar"><br>
                            </div>
                            <br>
                            <div class="col-6">
                                <a class="btn btn-default" href="Controlador?accion=listaPacientes">Regresar</a>      
                            </div>
                        </div>
                    </div>
                </div>
                <br>

            </form>
        </div>
    </body>
</html>
