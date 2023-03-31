 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.

*/
package guia9_extras2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Giu-L
 */
public class Servicio {
   Scanner lee = new  Scanner(System.in);
    char[][] sala = new char [8][6];
   
  public void Menu(){
      System.out.println("======== BIENVENIDOS AL CINE ========" + "\n" + "A cotinuacion se muestran las opciones: ");
      System.out.println(" 1- Cartelera ");
      System.out.println(" 2 - Comprar entrada ");
      System.out.println(" 3 - Lugares en la sala ");
      int op= lee.nextInt();
      
      boolean seguir = true;
      while(seguir){
          
      switch(op){
          case 1: 
           Cartelera();
           break;
          case 2:
            comprar();
            break;
          case 3:    
              sala();
              break;
      }}
  }
  
  public void Cartelera(){
      ArrayList cine = new ArrayList();
            System.out.println(" ===== CARTELERA ===== ");
            
             System.out.println("Opcion 1 " + "\n" +"EL HOMBRE ARAÑA 3 " + "\n");
             System.out.println("Opcion 2"+ "\n"+"MADAGASCAR "  + "\n");
             System.out.println("Opcion 3 "+ "\n" + "ALICIA EN El PAIS DE LAS MARAVILLAS" +" \n");
             System.out.println("Opcion 4 "+ "\n" + "ALICIA TARS EL ESPEJO " +" \n");
             
            
      
        System.out.println("Ingrese el numero de la pelicula para saber mas informacion  ");
      int x = lee.nextInt();
      
      switch(x){
          case 1:
             System.out.println("Opcion 1 " + "\n" +"EL HOMBRE ARAÑA 3 ");
             System.out.println("Duracion 02:34:07 ");
             System.out.println("Apto todo publico ");
             break;
          case 2:
              System.out.println( "Opcion 2"+ "\n"+"MADAGASCAR ");
              System.out.println("Duracion 01: 56: 00 "  );
              System.out.println("Apto todo publico " );
              break;
          case 3: 
              System.out.println("Opcion 3 "+ "\n" + "ALICIA EN El PAIS DE LAS MARAVILLAS");
              System.out.println("Durcion 02:06:33 ");
              System.out.println("Mayores de 12 " );
              break;
          case 4: 
              System.out.println("Opcion 4 "+ "\n" + "ALICIA TARS EL ESPEJO ");
              System.out.println("Duracion 02: 34: 09 ");
              System.out.println("Mayores de 23 " );
              break;    
  }
      Menu();
}
  public void comprar(){
     System.out.println("Por protocolo para comprar la entrada necesitamos que complete unos datos.");
     
     System.out.println(" ACLARACION EL COSTO DE LAS ENTRADAS NO VARIA, CADA UNA CUESTA $1113");
     
     System.out.println("Indique su nombre:");
     String nombre = lee.next();
   
    System.out.println("Hola, " + nombre + ".");
    System.out.println("Ingrese su edad:");
    int edad = lee.nextInt();

    System.out.println("¿Cuántas entradas quiere?");
    int entradas = lee.nextInt();
    int suma = 1113 * entradas;
    
    System.out.println("Usted va a comprar " + entradas + " entradas. Serían " + suma + " pesos." + "\n" + "¡QUE LO DISFRUTE!");
     Menu(); 
  }
  
  public  void sala(){


    // INICIALIZO MATRIZ DE FILAS Y COLUMNAS         
    int numFilas = 6;
    int numColumnas = 8;
    
//  CREO LA MATRIZ
char[][] sala = new char[numFilas][numColumnas];
boolean[][] ocupados = new boolean[numFilas][numColumnas];

// ESTE BUCLE INICIALIZA LA MATRIZ 
for (int fila = 0; fila < numFilas; fila++) {
    for (int columna = 0; columna < numColumnas; columna++) {
        sala[fila][columna] = (char) ('A' + fila);
        ocupados[fila][columna] = false;
    }
}

// Generar asientos aleatorios para el número de entradas compradas
        System.out.println("¿Cuántas entradas quiere?");
        int entradas = lee.nextInt();
    for (int i = 0; i < entradas; i++) {
        int filaAle = (int) (Math.random() * numFilas);
         int columnaAle = (int) (Math.random() * numColumnas);
        while (ocupados[filaAle][columnaAle]) {
        filaAle = (int) (Math.random() * numFilas);
        columnaAle = (int) (Math.random() * numColumnas);
    }
    sala[filaAle][columnaAle] = 'X';
    ocupados[filaAle][columnaAle] = true;
}

// Imprimir la matriz de asientos
    System.out.println("  1 2 3 4 5 6 7 8");
    for (int fila = 0; fila < numFilas; fila++) {
        System.out.print(sala[fila][0] + " ");
    for (int columna = 1; columna < numColumnas; columna++) {
        if (ocupados[fila][columna]) {
            System.out.print("X ");
        } else {
            System.out.print("  ");
        }
    }
    System.out.println();
}
 Menu();           
          }
          
      
  }


