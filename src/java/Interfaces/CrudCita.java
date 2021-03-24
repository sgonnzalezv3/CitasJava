/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Cita;
import Modelo.Medico;
import java.util.List;

/**
 *
 * @author santi
 */
public interface CrudCita {

    public List listaCitas();

    public Cita list(int id);

    public boolean add(Cita cita);

    public boolean eliminar(int id);
}
