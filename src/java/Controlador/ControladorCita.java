/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cita;
import ModeloLogic.CitaLogic;
import ModeloLogic.MedicoLogic;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author santi
 */
public class ControladorCita extends HttpServlet {

    String listaCitas = "vistas/cita/listaCitas.jsp";
    String add = "vistas/cita/agregarCita.jsp";
    String edit = "vistas/cita/editarCita.jsp";
    Cita c = new Cita();
    CitaLogic cL = new CitaLogic();
    int Identificacion;
    int id;

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
            out.println("<title>Servlet ControladorCita</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorCita at " + request.getContextPath() + "</h1>");
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
        if (action.equalsIgnoreCase("listaCitas")) {
            acceso = listaCitas;
        } else if (action.equalsIgnoreCase("agregarCita")) {
            acceso = add;
        } else if (action.equalsIgnoreCase("Agregar")) {

            String FechaCita = request.getParameter("txtFC");
            String HoraCita = request.getParameter("txtHC");
            String PacienteId = request.getParameter("txtPI");
            String MedicoId = request.getParameter("txtMI");

            CitaLogic cita = new CitaLogic();
            List<Cita> list = cita.listaCitas();
            MedicoLogic medico = new MedicoLogic();
            medico.list(MedicoId);

            c.setFechaCita(FechaCita);
            c.setHoraCita(HoraCita);
            c.setPacienteId(PacienteId);
            c.setMedicoId(MedicoId);
            if (cita.listaCitasReservadas(FechaCita, HoraCita, MedicoId, medico.list(MedicoId).getHoraInicioAtencion(), medico.list(MedicoId).getHoraFinAtencion()) == true) {
                // YA EXISTE UNA CITA PARA ESE DIA 
                acceso = "vistas/cita/citaNo.jsp";

            } else {
                cL.add(c);
                acceso = listaCitas;
            }

        } else if (action.equalsIgnoreCase("editarCita")) {
            request.setAttribute("id", request.getParameter("id"));
            acceso = edit;
        } else if (action.equalsIgnoreCase("eliminar")) {
            Identificacion = Integer.parseInt(request.getParameter("id"));
            c.setId(Identificacion);
            cL.eliminar(Identificacion);
            acceso = listaCitas;
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
