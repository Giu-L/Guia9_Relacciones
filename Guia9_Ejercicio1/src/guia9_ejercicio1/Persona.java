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
public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private int edad;
    private Perro perro;

    
   public  Persona(String nombre, String aprellido, int dni,int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.apellido = apellido;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

  public int getEdad() {
        return edad;
    }
   public void adop(Perro perro){
       System.out.println("DATOS DE LA PERSONA ");
       System.out.println("Nombre del dueño " + nombre);
       System.out.println("Apellido " + apellido);
       System.out.println("Dni " + dni);
       System.out.println("Edad " + edad);
       System.out.println("DATOS DE LA MASCOTA");
       System.out.println("Nombre " + perro.getNombre() );
       System.out.println("Raza " + perro.getRaza());
       System.out.println("Tamaño " + perro.getTanio());
       System.out.println("Edad " + perro.getEdad());
   }
   }
    

