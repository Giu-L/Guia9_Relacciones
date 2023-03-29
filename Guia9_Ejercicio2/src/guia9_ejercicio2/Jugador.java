/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
*/
package guia9_ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Giu-L
 */
public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;
    private int cantJugadores;
    
    public Jugador(int id, boolean mojado, String nombre,int cantJugadores){
        this.id =id;
        this.mojado = mojado;
        this.nombre =nombre;
        this.cantJugadores =cantJugadores;
    }
    Scanner lee = new Scanner(System.in);

    Jugador() {
    }
    public void armadoDeJuego(){
        System.out.println("Ingrse la canitdad de jugadores");
         int cant = lee.nextInt();
        System.out.println("Ingrese su nombre: ");
        this.nombre = lee.nextLine();
        System.out.println("Ingrese su numero de id (debe ser de 1 a 6): ");
        this.id = lee.nextInt();

        if(cant == 0){
            this.cantJugadores = 6;
        } 
        }
    /*
    
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
    */
    public boolean disparo(){
        Revolver r = new Revolver();
        r.siguienteChorro(); 
        boolean resultado = r.mojar();
        this.mojado = resultado;
        return resultado;
        
    }
    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public boolean getMojado(){
        return mojado;
    }
    }
    

