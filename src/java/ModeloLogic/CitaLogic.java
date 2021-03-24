/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloLogic;

import Config.Conexion;
import Interfaces.CrudCita;
import Modelo.Cita;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class CitaLogic implements CrudCita {

    Conexion conexion = new Conexion();
    Connection con;
    PreparedStatement statment;
    ResultSet rset;
    Cita c = new Cita();

    public boolean listaCitasReservadas(String dia, String hora, String medicoId, String medicoHoraInicio, String medicoHoraFin) {
        ArrayList<Cita> lista = new ArrayList<>();

        String sql = "SELECT * FROM `cita` c"
                + " where c.medicoId = '" + medicoId + "' AND c.fechaCita='" + dia + "' AND CONVERT(c.horaCita,TIME) BETWEEN CONVERT('" + medicoHoraInicio + "',TIME) AND CONVERT('" + medicoHoraFin + "',TIME)"
                + " AND CONVERT(c.horaCita,TIME) BETWEEN (CONVERT('" + hora + "',TIME) - CONVERT('01:00',TIME)) AND (CONVERT('" + hora + "',TIME) + CONVERT('01:00',TIME))";

        try {
            con = conexion.getConnection();
            statment = con.prepareStatement(sql);
            rset = statment.executeQuery();

            while (rset.next()) {
                Cita cita = new Cita();
                cita.setId(rset.getInt("id"));
                cita.setMedicoId(rset.getString("medicoid"));
                cita.setPacienteId(rset.getString("paciente_id"));
                cita.setFechaCita(rset.getString("fechaCita"));
                cita.setHoraCita(rset.getString("horaCita"));
                lista.add(cita);
            }
        } catch (Exception e) {
        }
        
        return lista.size() > 0;
    }

    @Override
    public List listaCitas() {
        ArrayList<Cita> lista = new ArrayList<>();
        String sql = "SELECT * FROM cita";

        try {
            con = conexion.getConnection();
            statment = con.prepareStatement(sql);
            rset = statment.executeQuery();

            while (rset.next()) {
                Cita cita = new Cita();
                cita.setId(rset.getInt("id"));
                cita.setMedicoId(rset.getString("medicoid"));
                cita.setPacienteId(rset.getString("paciente_id"));
                cita.setFechaCita(rset.getString("fechaCita"));
                cita.setHoraCita(rset.getString("horaCita"));
                lista.add(cita);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public Cita list(int Identificacion) {
        String sql = "SELECT * FROM cita WHERE id = " + Identificacion;

        try {
            con = conexion.getConnection();
            statment = con.prepareStatement(sql);
            rset = statment.executeQuery();

            while (rset.next()) {
                c.setId(rset.getInt("id"));
                c.setMedicoId(rset.getString("medicoid"));
                c.setPacienteId(rset.getString("paciente_id"));
                c.setFechaCita(rset.getString("fechaCita"));
                c.setHoraCita(rset.getString("horaCita"));
            }
        } catch (Exception e) {
        }
        return c;

    }

    @Override
    public boolean add(Cita cita) {

        String sql = "INSERT INTO cita (fechaCita,horaCita,paciente_id,medicoId)values('"
                + cita.getFechaCita() + "','"
                + cita.getHoraCita() + "','"
                + cita.getPacienteId() + "','"
                + cita.getMedicoId() + "')";
        try {
            con = conexion.getConnection();
            statment = con.prepareStatement(sql);
            statment.executeUpdate();
        } catch (Exception e) {
        }

        return false;

    }


    @Override
    public boolean eliminar(int id) {
        String sql = "Delete from cita where id =" + id;
        try {
            con = conexion.getConnection();
            statment = con.prepareStatement(sql);
            statment.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

}
