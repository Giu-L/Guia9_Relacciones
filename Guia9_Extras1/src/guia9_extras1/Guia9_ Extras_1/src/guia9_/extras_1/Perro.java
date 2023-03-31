/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_.extras_1;

/**
 *
 * @author Giu-L
 */
class perro {
    public class Entidades_extras1 {
    public String perro;

        public void setPerro(String perro) {
            this.perro = perro;
        }

        public void setPersonas(String personas) {
            this.personas = personas;
        }
    public String personas;
    
    public Entidades_extras1(){
        
    }
    
    public Entidades_extras1(String perro, String personas){
        this.perro = perro;
        this.personas = personas;
        
    }
  

    public String getPerro() {
        return perro;
    }

    public String getPersonas() {
        return personas;
    }
        
  }

}


