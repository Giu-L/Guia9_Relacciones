/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_ejercicio1;

/**
 *
 * @author Giu-L
 */
public class Guia9_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Persona persona1 = new Persona("Fredy ", " Mercuri ", 123456432, 23);
      Persona persona2 = new Persona("Sheila ", " Saenz ", 1234567, 26);
      
      Perro perro1 = new Perro("chiquito ", " Salchicha ", " chico", 3);
      Perro perro2 = new Perro("Maximo ", " labrador ", " grande ", 6);
      
      persona1.adop(perro1);
      persona2.adop(perro2);
    }
    
}
