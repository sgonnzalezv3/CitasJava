/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Medico;
import ModeloLogic.MedicoLogic;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author santi
 */
public class ControladorMedico extends HttpServlet {

    String listaMedicos = "vistas/medico/listaMedico.jsp";
    String add = "vistas/medico/agregarMedico.jsp";
    String edit = "vistas/medico/editarMedico.jsp";
    Medico m = new Medico();
    MedicoLogic mL = new MedicoLogic();
    String Identificacion = "";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso = "";
        String action = request.getParameter("accion");
        if (action.equalsIgnoreCase("listaMedicos")) {
            acceso = listaMedicos;
        } else if (action.equalsIgnoreCase("agregarMedico")) {
            acceso = add;
        } else if (action.equalsIgnoreCase("Agregar")) {
            String NombreCompleto = request.getParameter("txtNom");
            String NumeroTProfesional = request.getParameter("txtTP");
            String Identificacion = request.getParameter("txtId");
            String TipoIdentificacion = request.getParameter("txtTId");
            String AniosExperiencia = request.getParameter("txtAE");
            String Especialidad = request.getParameter("txtEs");
            String FechaInicio = request.getParameter("txtHI");
            String FechaFIn = request.getParameter("txtHF");
            m.setNumeroTProfesional(NumeroTProfesional);
            m.setEspecialidad(Especialidad);
            m.setHoraInicioAtencion(FechaInicio);
            m.setHoraFinAtencion(FechaFIn);
            m.setIdentificacion(Identificacion);
            m.setTipoIdentificacion(TipoIdentificacion);
            m.setNombreCompleto(NombreCompleto);
            float f = Float.parseFloat(AniosExperiencia);
            m.setAniosExperiencia(f);
            mL.add(m);
            acceso = listaMedicos;
        } else if (action.equalsIgnoreCase("editarMedico")) {
            request.setAttribute("identificacion", request.getParameter("identificacion"));
            acceso = edit;
        } else if (action.equalsIgnoreCase("Actualizar")) {
            String NombreCompleto = request.getParameter("txtNom");
            String NumeroTProfesional = request.getParameter("txtTP");
            String Identificacion = request.getParameter("txtId");
            String TipoIdentificacion = request.getParameter("txtTId");
            String AniosExperiencia = request.getParameter("txtAE");
            String Especialidad = request.getParameter("txtEs");
            String FechaInicio = request.getParameter("txtHI");
            String FechaFIn = request.getParameter("txtHF");
            m.setNumeroTProfesional(NumeroTProfesional);
            m.setEspecialidad(Especialidad);
            m.setHoraInicioAtencion(FechaInicio);
            m.setHoraFinAtencion(FechaFIn);
            m.setIdentificacion(Identificacion);
            m.setTipoIdentificacion(TipoIdentificacion);
            m.setNombreCompleto(NombreCompleto);
            float f = Float.parseFloat(AniosExperiencia);
            m.setAniosExperiencia(f);
            mL.edit(m);
            acceso = listaMedicos;
        } else if (action.equalsIgnoreCase("eliminar")) {
            Identificacion = request.getParameter("identificacion");
            m.setIdentificacion(Identificacion);
            mL.eliminar(Identificacion);
            acceso = listaMedicos;
        }
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
