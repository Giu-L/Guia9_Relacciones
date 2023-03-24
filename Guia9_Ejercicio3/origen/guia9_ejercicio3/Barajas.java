/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_ejercicio3;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Usuario
 */
/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
*/
public class Barajas {
    public ArrayList<Carta> cartas;
     
    
    
    public Barajas(){   
        //lista de crtas
      this.cartas = new ArrayList<Carta>(40);
        String[] palos = { "ORO","ESPADA","COPA","BASTO"};
        // se crea una lista de palos y see dice que va entre 0-13 obviando los 8y9
        for (String aux : palos) {
            for (int i = 0; i < 10; i++) {
                    if(i!=8 && i!=9){
                Carta carta = new Carta(i, aux);
                this.cartas.add(carta);
            }
                    System.out.println(aux + i);
            }
            
        }
                
               
                }

            }
         //• barajar(): cambia de posición todas las cartas aleatoriamente.
            public void bajar(){
                Collections.shuffle(cartas, random);
                
            }
//            • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.
//          
            public void siguienteCarta(){
                
            }
            }
        
    
    
    

