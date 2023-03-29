/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:



• toString(): muestra información del revolver (posición actual y donde está el agua)
*/
package guia9_ejercicio2;

import java.util.Random;

/**
 *
 * @author Giu-L
 */
public class Revolver {
    private int posicionActual;
    private int posicionAgua;
    

public Revolver(int posicionActual, int posicionAgua){
    this.posicionActual = posicionActual;
    this.posicionAgua = posicionAgua;
}
 public int getPosicionActual() {
        return posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }
public Revolver(){
    
}
//• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
//deben ser aleatorios.
public void llenrRevolver(){
    Random al = new Random();
     this.posicionActual = al.nextInt(6)+1;
    this.posicionAgua =al.nextInt(6)+1;
}
//• mojar(): devuelve true si la posición del agua coincide con la posición actual
public boolean mojar(){
    return  this.posicionActual == this.posicionAgua;
}
//• siguienteChorro(): cambia a la siguiente posición del tambor
   public void siguienteChorro(){
       if(this.posicionActual  == 6){
           this.posicionActual =1;
       }else{
           this.posicionActual ++;
       }
   }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + this.posicionActual + ", posicionAgua=" + this.posicionAgua + '}';
    }

   
    }
   
