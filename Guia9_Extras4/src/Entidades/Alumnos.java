/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class Alumnos {
    private String nombreCompleto;
    private Integer dni;
    private Integer canridadDeVotos;
    
    public Alumnos(){
        this.canridadDeVotos = 0;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getCanridadDeVotos() {
        return canridadDeVotos;
    }

    public void setCanridadDeVotos(Integer canridadDeVotos) {
        this.canridadDeVotos = canridadDeVotos;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombreCompleto=" + nombreCompleto + ", dni=" + dni + ", canridadDeVotos=" + canridadDeVotos + '}';
    }
   
    
}
