/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eentidades;

import Entidades.Alumnos;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Voto {
    private Alumnos alu;
    
    private ArrayList<String> lista  = new ArrayList();
    
    public Voto(){
        
    }
    public Voto(Alumnos alu){
        this.alu = alu;
     
    }

    public Alumnos getAlu() {
        return alu;
    }

    public void setAlu(Alumnos alu) {
        this.alu = alu;
    }

    public ArrayList<String> getLista() {
        return lista;
    }

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }
}
