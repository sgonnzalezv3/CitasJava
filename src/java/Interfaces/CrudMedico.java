/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Medico;
import java.util.List;

/**
 *
 * @author santi
 */
public interface CrudMedico {

    public List listaMedicos();

    public Medico list(String Identificacion);

    public boolean add(Medico medico);

    public boolean edit(Medico medico);

    public boolean eliminar(String id);

}
