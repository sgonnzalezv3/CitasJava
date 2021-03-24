/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloLogic;

import Config.Conexion;
import Interfaces.CrudPaciente;
import Modelo.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class PacienteLogic implements CrudPaciente {

    Conexion conexion = new Conexion();
    Connection con;
    PreparedStatement statment;
    ResultSet rset;
    Paciente p = new Paciente();

    @Override
    public List listaPacientes() {
        ArrayList<Paciente> lista = new ArrayList<>();
        String sql = "SELECT * FROM paciente";

        try {
            con = conexion.getConnection();
            statment = con.prepareStatement(sql);
            rset = statment.executeQuery();

            while (rset.next()) {
                Paciente paciente = new Paciente();
                paciente.setIdentificacion(rset.getString("Identificacion"));
                paciente.setNombreCompleto(rset.getString("NombreCompleto"));
                paciente.setTipoIdentificacion(rset.getString("TipoIdentificacion"));
                paciente.setEps(rset.getString("EPS"));
                paciente.setHistoriaClinica(rset.getString("HistoriaClinica"));
                paciente.setFNacimiento(rset.getDate("FNacimiento"));
                lista.add(paciente);

            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public Paciente list(String Identificacion) {
        String sql = "SELECT * FROM paciente WHERE Identificacion = " + Identificacion;

        try {
            con = conexion.getConnection();
            statment = con.prepareStatement(sql);
            rset = statment.executeQuery();

            while (rset.next()) {
                p.setIdentificacion(rset.getString("Identificacion"));
                p.setNombreCompleto(rset.getString("NombreCompleto"));
                p.setTipoIdentificacion(rset.getString("TipoIdentificacion"));
                p.setEps(rset.getString("EPS"));
                p.setHistoriaClinica(rset.getString("HistoriaClinica"));
                p.setFNacimiento(rset.getDate("FNacimiento"));

            }
        } catch (Exception e) {
        }
        return p;
    }

    @Override
    public boolean add(Paciente paciente) {
        String sql = "INSERT INTO paciente (NombreCompleto,FNacimiento,Identificacion,TipoIdentificacion,EPS,HistoriaClinica)values('"
                + paciente.getNombreCompleto() + "','"
                + paciente.getFNacimiento() + "','"
                + paciente.getIdentificacion() + "','"
                + paciente.getTipoIdentificacion() + "','"
                + paciente.getEps() + "','"
                + paciente.getHistoriaClinica() + "')";

        try {
            con = conexion.getConnection();
            statment = con.prepareStatement(sql);
            statment.executeUpdate();
        } catch (Exception e) {
        }

        return false;

    }

    @Override
    public boolean edit(Paciente paciente) {
        String sql = "update paciente set NombreCompleto='"
                + paciente.getNombreCompleto() + "',FNacimiento='"
                + paciente.getFNacimiento() + "',Identificacion='"
                + paciente.getIdentificacion() + "',TipoIdentificacion='"
                + paciente.getTipoIdentificacion() + "',EPS='"
                + paciente.getEps() + "',HistoriaClinica='"
                + paciente.getHistoriaClinica() + "'where Identificacion=" + paciente.getIdentificacion();
        try {
            con = conexion.getConnection();
            statment = con.prepareStatement(sql);
            statment.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(String Identificacion) {
        String sql = "Delete from paciente where Identificacion =" + Identificacion;
        try {
            con = conexion.getConnection();
            statment = con.prepareStatement(sql);
            statment.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

}
