/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Medico {
    String nombreCompleto;
    float aniosExperiencia;
    String identificacion;
    String TipoIdentificacion;
    String numeroTProfesional;
    String especialidad;
    String horaInicioAtencion;
    String horaFinAtencion;

    public Medico() {
    }

    public Medico(String nombreCompleto, float aniosExperiencia, String identificacion, String TipoIdentificacion, String numeroTProfesional, String especialidad, String horaInicioAtencion, String horaFinAtencion) {
        this.nombreCompleto = nombreCompleto;
        this.aniosExperiencia = aniosExperiencia;
        this.identificacion = identificacion;
        this.TipoIdentificacion = TipoIdentificacion;
        this.numeroTProfesional = numeroTProfesional;
        this.especialidad = especialidad;
        this.horaInicioAtencion = horaInicioAtencion;
        this.horaFinAtencion = horaFinAtencion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public float getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(float aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getTipoIdentificacion() {
        return TipoIdentificacion;
    }

    public void setTipoIdentificacion(String TipoIdentificacion) {
        this.TipoIdentificacion = TipoIdentificacion;
    }

    public String getNumeroTProfesional() {
        return numeroTProfesional;
    }

    public void setNumeroTProfesional(String numeroTProfesional) {
        this.numeroTProfesional = numeroTProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getHoraInicioAtencion() {
        return horaInicioAtencion;
    }

    public void setHoraInicioAtencion(String horaInicioAtencion) {
        this.horaInicioAtencion = horaInicioAtencion;
    }

    public String getHoraFinAtencion() {
        return horaFinAtencion;
    }

    public void setHoraFinAtencion(String horaFinAtencion) {
        this.horaFinAtencion = horaFinAtencion;
    }
    
}
