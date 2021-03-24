/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author santi
 */
public class Paciente {
    String nombreCompleto;
    Date FNacimiento;
    String identificacion;
    String TipoIdentificacion;
    String eps;
    String HistoriaClinica;

    public Paciente() {
    }

    public Paciente(String nombreCompleto, Date FNacimiento, String identificacion, String TipoIdentificacion, String eps, String HistoriaClinica) {
        this.nombreCompleto = nombreCompleto;
        this.FNacimiento = FNacimiento;
        this.identificacion = identificacion;
        this.TipoIdentificacion = TipoIdentificacion;
        this.eps = eps;
        this.HistoriaClinica = HistoriaClinica;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Date getFNacimiento() {
        return FNacimiento;
    }

    public void setFNacimiento(Date FNacimiento) {
        this.FNacimiento = FNacimiento;
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

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getHistoriaClinica() {
        return HistoriaClinica;
    }

    public void setHistoriaClinica(String HistoriaClinica) {
        this.HistoriaClinica = HistoriaClinica;
    }
    
}
