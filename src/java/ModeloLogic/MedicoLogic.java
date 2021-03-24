/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloLogic;

import Config.Conexion;
import Interfaces.CrudMedico;
import Modelo.Medico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class MedicoLogic implements CrudMedico {

    Conexion conexion = new Conexion();
    Connection con;
    PreparedStatement statment;
    ResultSet rset;
    Medico m = new Medico();

    @Override
    public List listaMedicos() {
        ArrayList<Medico> lista = new ArrayList<>();
        String sql = "SELECT * FROM medico";

        try {
            con = conexion.getConnection();
            statment = con.prepareStatement(sql);
            rset = statment.executeQuery();

            while (rset.next()) {
                Medico medico = new Medico();
                medico.setIdentificacion(rset.getString("Identificacion"));
                medico.setNombreCompleto(rset.getString("NombreCompleto"));
                medico.setTipoIdentificacion(rset.getString("TipoIdentificacion"));
                medico.setNumeroTProfesional(rset.getString("NumeroTProfesional"));
                medico.setAniosExperiencia(rset.getInt("AniosExperiencia"));
                medico.setEspecialidad(rset.getString("Especialidad"));
                medico.setHoraInicioAtencion(rset.getString("HoraInicioAtencion"));
                medico.setHoraFinAtencion(rset.getString("HoraFinAtencion"));
                lista.add(medico);

            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public Medico list(String Identificacion) {
        String sql = "SELECT * FROM medico WHERE Identificacion = " + Identificacion;

        try {
            con = conexion.getConnection();
            statment = con.prepareStatement(sql);
            rset = statment.executeQuery();

            while (rset.next()) {
                m.setIdentificacion(rset.getString("Identificacion"));
                m.setNombreCompleto(rset.getString("NombreCompleto"));
                m.setTipoIdentificacion(rset.getString("TipoIdentificacion"));
                m.setNumeroTProfesional(rset.getString("NumeroTProfesional"));
                m.setAniosExperiencia(rset.getInt("AniosExperiencia"));
                m.setEspecialidad(rset.getString("Especialidad"));
                m.setHoraInicioAtencion(rset.getString("HoraInicioAtencion"));
                m.setHoraFinAtencion(rset.getString("HoraFinAtencion"));
            }
        } catch (Exception e) {
        }
        return m;
    }

    @Override
    public boolean add(Medico medico) {
        String sql = "INSERT INTO medico (NombreCompleto,NumeroTProfesional,Identificacion,TipoIdentificacion,AniosExperiencia,Especialidad,HoraInicioAtencion,HoraFinAtencion)values('"
                + medico.getNombreCompleto() + "','"
                + medico.getNumeroTProfesional()+ "','"
                + medico.getIdentificacion() + "','"
                + medico.getTipoIdentificacion() + "','"
                + medico.getAniosExperiencia()+ "','"
                + medico.getEspecialidad()+ "','"
                + medico.getHoraInicioAtencion()+ "','"
                + medico.getHoraFinAtencion()+ "')";

        try {
            con = conexion.getConnection();
            statment = con.prepareStatement(sql);
            statment.executeUpdate();
        } catch (Exception e) {
        }

        return false;

    }

    @Override
    public boolean edit(Medico medico) {
        String sql = "update medico set NombreCompleto='"
                + medico.getNombreCompleto() + "',NumeroTProfesional='"
                + medico.getNumeroTProfesional()+ "',Identificacion='"
                + medico.getIdentificacion() + "',TipoIdentificacion='"
                + medico.getTipoIdentificacion() + "',AniosExperiencia='"
                + medico.getAniosExperiencia()+ "',HoraInicioAtencion='"
                + medico.getHoraInicioAtencion()+ "',HoraFinAtencion='"
                + medico.getHoraFinAtencion()+ "',Especialidad='"
                + medico.getEspecialidad()+ "'where Identificacion=" + medico.getIdentificacion();
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
        String sql = "Delete from medico where Identificacion =" + Identificacion;
        try {
            con = conexion.getConnection();
            statment = con.prepareStatement(sql);
            statment.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

}
