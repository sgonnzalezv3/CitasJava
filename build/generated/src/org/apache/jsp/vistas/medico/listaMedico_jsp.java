package org.apache.jsp.vistas.medico;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Medico;
import ModeloLogic.MedicoLogic;
import java.util.Iterator;
import java.util.List;
import Modelo.Paciente;
import ModeloLogic.PacienteLogic;

public final class listaMedico_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1 class=\"text-center\">Pacientes</h1>\n");
      out.write("            <table class=\"table table-hover\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th class=\"text-center\">Nombre Completo</th>\n");
      out.write("                        <th class=\"text-center\">Identificación</th>\n");
      out.write("                        <th class=\"text-center\">Tipo de Identificación</th>\n");
      out.write("                        <th class=\"text-center\">Número de tarjeta profesional</th>\n");
      out.write("                        <th class=\"text-center\">Años de Experiencia</th>\n");
      out.write("                        <th class=\"text-center\">Especialidad</th>\n");
      out.write("                        <th class=\"text-center\">Hora de inicio de atención</th>\n");
      out.write("                        <th class=\"text-center\">Hora de fin de atención</th>\n");
      out.write("                        <th class=\"text-center\">Acciones</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                ");

                    MedicoLogic medico = new MedicoLogic();
                    List<Medico> list = medico.listaMedicos();
                    Iterator<Medico> iter = list.iterator();
                    Medico med = null;
                    while (iter.hasNext()) {
                        med = iter.next();

                
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"text-center\">");
      out.print( med.getNombreCompleto());
      out.write("</td>\n");
      out.write("                        <td class=\"text-center\">");
      out.print( med.getIdentificacion());
      out.write("</td>\n");
      out.write("                        <td class=\"text-center\">");
      out.print( med.getTipoIdentificacion());
      out.write("</td>\n");
      out.write("                        <td class=\"text-center\">");
      out.print( med.getNumeroTProfesional());
      out.write("</td>\n");
      out.write("                        <td class=\"text-center\">");
      out.print( med.getAniosExperiencia());
      out.write("</td>\n");
      out.write("                        <td class=\"text-center\">");
      out.print( med.getEspecialidad());
      out.write("</td>\n");
      out.write("                        <td class=\"text-center\">");
      out.print( med.getHoraInicioAtencion());
      out.write("</td>\n");
      out.write("                        <td class=\"text-center\">");
      out.print( med.getHoraFinAtencion());
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"row-12 text-center\">\n");
      out.write("                                    <a class=\" centrarBoton btn btn-danger\" href=\"ControladorMedico?accion=editarMedico&identificacion=");
      out.print( med.getIdentificacion());
      out.write("\">Editar</a>                                    \n");
      out.write("                                    <a class=\" centrarBoton btn btn-danger\" href=\"ControladorMedico?accion=eliminar&identificacion=");
      out.print( med.getIdentificacion());
      out.write("\">Eliminar</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"text-center row\">\n");
      out.write("                <div>\n");
      out.write("                    <a class=\" content-center btn btn-success\"  href=\"ControladorMedico?accion=agregarMedico\">Agregar Médico</a>                    \n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <div>\n");
      out.write("                    <a class=\"btn btn-default\" href=\"index.jsp\">Regresar</a>    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
