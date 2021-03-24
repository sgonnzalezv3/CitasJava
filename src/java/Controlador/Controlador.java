/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Paciente;
import ModeloLogic.PacienteLogic;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author santi
 */
public class Controlador extends HttpServlet {

    String listaPacientes = "vistas/paciente/listaPacientes.jsp";
    String add = "vistas/paciente/agregarPaciente.jsp";
    String edit = "vistas/paciente/editarPaciente.jsp";
    Paciente p = new Paciente();
    PacienteLogic pL = new PacienteLogic();
    String Identificacion ="";

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
        if (action.equalsIgnoreCase("listaPacientes")) {
            acceso = listaPacientes;
        } else if (action.equalsIgnoreCase("agregarPaciente")) {
            acceso = add;
        } else if (action.equalsIgnoreCase("Agregar")) {
            try {
                String NombreCompleto = request.getParameter("txtNom");
                String FNacimiento = request.getParameter("txtFN");
                String Identificacion = request.getParameter("txtId");
                String TipoIdentificacion = request.getParameter("txtTId");
                String EPS = request.getParameter("txtEPS");
                String HistoriaClinica = request.getParameter("txtHI");
                p.setEps(EPS);
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Date parsed = format.parse(FNacimiento);
                java.sql.Date sql = new java.sql.Date(parsed.getTime());
                p.setFNacimiento(sql);
                p.setHistoriaClinica(HistoriaClinica);
                p.setIdentificacion(Identificacion);
                p.setTipoIdentificacion(TipoIdentificacion);
                p.setNombreCompleto(NombreCompleto);
                pL.add(p);
                acceso = listaPacientes;
            } catch (ParseException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (action.equalsIgnoreCase("editarPaciente")) {
            request.setAttribute("identificacion", request.getParameter("identificacion"));
            acceso = edit;
        } else if (action.equalsIgnoreCase("Actualizar")) {
            try {
                String NombreCompleto = request.getParameter("txtNom");
                String FNacimiento = request.getParameter("txtFN");
                String Identificacion = request.getParameter("txtId");
                String TipoIdentificacion = request.getParameter("txtTId");
                String EPS = request.getParameter("txtEPS");
                String HistoriaClinica = request.getParameter("txtHI");
                p.setEps(EPS);
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Date parsed = format.parse(FNacimiento);
                java.sql.Date sql = new java.sql.Date(parsed.getTime());
                p.setFNacimiento(sql);
                p.setHistoriaClinica(HistoriaClinica);
                p.setIdentificacion(Identificacion);
                p.setTipoIdentificacion(TipoIdentificacion);
                p.setNombreCompleto(NombreCompleto);
                pL.edit(p);
                acceso = listaPacientes;
            } catch (ParseException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(action.equalsIgnoreCase("eliminar")){
            Identificacion = request.getParameter("identificacion");
            p.setIdentificacion(Identificacion);
            pL.eliminar(Identificacion);
            acceso = listaPacientes;
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
