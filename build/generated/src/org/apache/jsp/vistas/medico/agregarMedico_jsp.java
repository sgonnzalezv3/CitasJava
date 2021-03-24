package org.apache.jsp.vistas.medico;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class agregarMedico_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 class=\"text-center\">Agregar Médico</h1>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form action=\"ControladorMedico\">\n");
      out.write("                <div class=\"form-\">\n");
      out.write("                    <label>Nombre Completo</label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Escriba el nombre completo del médico\" class=\"form-control\" name=\"txtNom\" required><br>\n");
      out.write("                    <label>Tipo de Identificación</label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Escriba el tipo de identificación del médico\" class=\"form-control\" name=\"txtTId\" required><br>\n");
      out.write("                    <label>Identificación</label>\n");
      out.write("                    <input type=\"number\"  placeholder=\"Digite la identificación del médico\" class=\"form-control\" name=\"txtId\" required pattern=\"[0-9]*\"><br>\n");
      out.write("                    <label>Número de tarjeta profesional</label>\n");
      out.write("                    <input type=\"number\"  class=\"form-control\" name=\"txtTP\"  required pattern=\"[0-9]{4}-[0-9]{2}-[0-9]{2}\"><br>\n");
      out.write("                    <label>Años de experiencia</label>\n");
      out.write("                    <input type=\"number\" placeholder=\"Escriba los años de experiencia del médico\" class=\"form-control\" name=\"txtAE\" required><br>\n");
      out.write("                    <label>Especialidad</label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Escriba la especialidad del medico\" class=\"form-control\" name=\"txtEs\" required><br>\n");
      out.write("                    <label>Hora de inicio de atención</label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Escriba la especialidad del medico\" class=\"form-control\" name=\"txtHI\" required><br>\n");
      out.write("                    <label>Hora final de atención</label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Escriba la especialidad del medico\" class=\"form-control\" name=\"txtHF\" required><br>\n");
      out.write("                    <textarea type=\"textarea\" placeholder=\"Describa la historia clinica del paciente\"  class=\"form-control\" name=\"txtHI\" required></textarea><br>\n");
      out.write("                    <div>\n");
      out.write("                        <div class=\"container row text-center\">\n");
      out.write("                            <div class=\"col-6\">   \n");
      out.write("                                <input class=\"btn btn-success\" type=\"submit\" name=\"accion\" value=\"Agregar\"><br>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"col-6\">\n");
      out.write("                                <a class=\"btn btn-default\" href=\"ControladorMedico?accion=listaMedicos\">Regresar</a>      \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("            </form>\n");
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
