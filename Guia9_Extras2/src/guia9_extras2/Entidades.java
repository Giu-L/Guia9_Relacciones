/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_extras2;

import java.util.ArrayList;

/**
 *
 * @author Giu-L
 */
public class Entidades {
    public String titulo;
    public String diretor;
    public  int duracion;
    public int edadmin;
    
    public ArrayList<Entidades> getCine(ArrayList<Entidades> cine){
        return cine;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadmin() {
        return edadmin;
    }

    public void setEdadmin(int edadmin) {
        this.edadmin = edadmin;
    }
    
   public Entidades(){
       
   }
   
}
