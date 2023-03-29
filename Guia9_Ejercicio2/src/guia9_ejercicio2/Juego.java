/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*

*/
package guia9_ejercicio2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Giu-L
 */
public class Juego {
    private ArrayList jugadores;
    private Revolver revolver;
    
    public Juego(){
   
    }
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r){
        this.jugadores = jugadores;
        this.revolver =r;
    }
    public void ronda(){
        boolean mojado = false;
        Random ra = new Random();
        int jugadorActual = ra.nextInt(jugadores.size());
        
        do{
            
            System.out.println("jugador " + jugadores.getNombre() + " se apunta");
            
            
            
        }
 
    }
    
}
