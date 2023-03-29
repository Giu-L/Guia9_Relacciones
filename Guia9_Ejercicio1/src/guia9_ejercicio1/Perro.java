/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.Perro, que tendrá como atributos: nombre, raza, edad y tamaño;

 */
package guia9_ejercicio1;

/**
 *
 * @author Giu-L
 */
public class Perro {
    private String nombre;
    private String raza;
    private String tanio;
    private int edad;

public Perro(){

}
public Perro(String nombre, String raza, String tanio, int edad){
    this.nombre = nombre;
    this.raza = raza;
    this.tanio = tanio;
    this.edad = edad;
}

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getTanio() {
        return tanio;
    }

    public int getEdad() {
        return edad;
    }

}