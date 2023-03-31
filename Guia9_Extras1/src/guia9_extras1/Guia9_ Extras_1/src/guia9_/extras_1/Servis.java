/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
*/
package guia9_.extras_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Giu-L
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
         System.out.println("============= Lista de Perritos ============ ");
        
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
    String perroAdoptado = listade.remove(listade.indexOf(nompe));
    System.out.println("Felicidades " + nombre + " usted ha adoptado a : " + nompe);
    System.out.println("Nombre de la pareja: " + nombre + " y " + nompe);
           System.out.println("Perritos que quedan por adoptar: " + listade);
        }else {
            System.out.println("Lo siento " + nombre + ", el perro " + nompe + " no está disponible para adopción.");
        }
    }
   public void opcio() {
    boolean seguir = true;
    do {
        System.out.println("Desea adoptar otro perrito ? (si/no)");
        String op = lee.nextLine();

        if( op.equals("si") ) {
            personas();
        } else if( op.equals("no") ) {
            System.out.println("Hasta la proxima");
            seguir = false;
        } else {
            System.out.println("Respuesta inválida. Por favor ingrese 'si' o 'no'.");
        }
    } while(seguir);
}

}

   
