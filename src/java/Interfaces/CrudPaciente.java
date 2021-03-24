/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Paciente;
import java.util.List;

/**
 *
 * @author santi
 */
public interface CrudPaciente {

    public List listaPacientes();

    public Paciente list(String Identificacion);

    public boolean add(Paciente paciente);

    public boolean edit(Paciente paciente);

    public boolean eliminar(String id);

}
