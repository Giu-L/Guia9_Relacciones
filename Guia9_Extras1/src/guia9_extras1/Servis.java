/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_extras1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
*/
/**
 *
 * @author Usuario
 */
/*
  creo una clase y una lista estatica con nombre de perros 
*/
public class Servis {
    Scanner lee = new Scanner(System.in);
    ArrayList<String> listade;

    public Servis() {
        listade = new ArrayList<>();
        listade.add("loquillo");
        listade.add("firulais");
        listade.add("marco");
        listade.add("cloe");
        listade.add("vrida");
    }
    
   

    public void personas() {
        System.out.println(" Lista de Perritos: ");
        
        listade.stream().map((aux) -> {
            
            return aux;
        }).forEachOrdered((aux) -> {
            System.out.println(aux);
        });

        ArrayList<String> personas = new ArrayList<>();
        System.out.println("Ingrese su nombre: ");
        String nombre = lee.nextLine();
        personas.add(nombre);

        System.out.println("Hola " + nombre + " Ingrese el nombre del Perrito que queres adoptar: ");
        String nompe = lee.nextLine();

        personas.addAll(listade);

        if (listade.contains(nompe)) {
            System.out.println("Felicidades " + nombre + " usted ha adoptado a : " + nompe);
        } else {
            System.out.println("Lo siento " + nombre + ", el perro " + nompe + " no está disponible para adopción.");
        }
        
        System.out.println("Perros adoptados ");
        System.out.println(personas);
    }
}
