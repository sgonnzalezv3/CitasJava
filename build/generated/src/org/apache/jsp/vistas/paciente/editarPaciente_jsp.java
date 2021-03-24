package org.apache.jsp.vistas.paciente;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Modelo.Paciente;
import ModeloLogic.PacienteLogic;

public final class editarPaciente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            ");

                PacienteLogic pL = new PacienteLogic();
                String id = (String)request.getAttribute("idpa");
                Paciente p =(Paciente)pL.list(id);
            
      out.write("\n");
      out.write("            <h1>Editar Paciente</h1>\n");
      out.write("            <form action=\"Controlador\">\n");
      out.write("                Nombre Completo:<br>\n");
      out.write("                <input type=\"text\" name=\"txtNom\" value=\"");
      out.print(p.getNombreCompleto());
      out.write("\"><br>\n");
      out.write("                Tipo Identificación:<br>\n");
      out.write("                <input type=\"text\" name=\"txtTId\" value=\"");
      out.print(p.getIdentificacion());
      out.write("\"><br>\n");
      out.write("                Identificación:<br>\n");
      out.write("                <input type=\"text\" name=\"txtId\" value=\"");
      out.print(p.getIdentificacion());
      out.write("\"><br>\n");
      out.write("                Fecha de Nacimiento:<br>\n");
      out.write("                <input type=\"date\" name=\"txtFN\"  required pattern=\"[0-9]{4}-[0-9]{2}-[0-9]{2}\" value=\"");
      out.print(p.getFNacimiento());
      out.write("\"><br>\n");
      out.write("                EPS:<br>\n");
      out.write("                <input type=\"text\" name=\"txtEPS\" value=\"");
      out.print(p.getEps());
      out.write("\"><br>\n");
      out.write("                Historia Clinica:<br>\n");
      out.write("                <input type=\"text\" name=\"txtHI\" value=\"");
      out.print(p.getHistoriaClinica());
      out.write("\"><br>\n");
      out.write("\n");
      out.write("                <input type=\"submit\" name=\"accion\" value=\"Actualizar\"><br>\n");
      out.write("                <a href=\"Controlador?accion=listaPacientes\">Regresar</a>\n");
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
