/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_ejercicio3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import java.util.Scanner;




/**
 *
 * @author Usuario
 */
/*

*/
public class Barajas {
    public ArrayList<Carta> cartas;
    public List<Carta> cartasMonton;
    int cartasDadas;
   Scanner leo = new Scanner(System.in);
   
  //   -----------------------  CARTAS -------------------------
    public Barajas(){   
             this.cartas = Mazo();
 
    }
        private ArrayList<Carta> Mazo() {
             ArrayList<Carta> nuevoMazo = new ArrayList();
               for (int i = 0; i <4 ; i++) {
                
                 for (int e = 0; e < 10; e++) {
                      Carta car = new Carta();
                     if(e > 6){
                        car.setNum( e + 3);
                      } else {
                         car.setNum(e + 1);
                       }
                switch (i){
                    case 0 :
                        car.setPalo(" ESPADA ");
                        break;
                    case 1 : 
                        car.setPalo(" ORO ");
                        break;
                        
                    case 2 :
                        car.setPalo(" COPA ");
                        break;
                    case 3 :
                        car.setPalo(" BASTO ");
                        break;
                }
                nuevoMazo.add(car);
          
            }
        }
            this.cartasDadas =0;
            
        return nuevoMazo;
     
    }  
     //------------------------- MENU --------------------------------------
        public void menu(){
        System.out.println("================ Elija una opcion: ==============");
        System.out.println("1 - BARAJAR");
        System.out.println("2 - SIGUIENTE CARTA ");
        System.out.println("3 -  DAR CARTA ");
        System.out.println("4 - CANTIDAD DE CARTAS DISPONIBLES ");
        System.out.println("5 - CARTAN MONTON ");
        System.out.println("6 -MOSTRAR BARAJA ");
            int op = leo.nextInt();
        switch(op){
            case 1: 
                  baraja();
                  break;
            
            case 2 :
                 siguienteCarta();
                 break;
            case 3:
                    darCartas();
                    break;
            case 4:
                  cartasDisponibles();
                  break;
            case 5:
                 cartasMonton();
                 break;
            case 6 :
                mostrarBaraja();
        
        default:
        System.out.println("opcion invalida -----------------------------");
        }
        boolean seguir = true;
          while(seguir){
            System.out.println("  ======== MENU ====== ");
              System.out.println("Desea seguir ? ");
              leo.nextLine();
              
              String oc = leo.nextLine();
           if(oc.equalsIgnoreCase("si")){
             menu();
                } else{
               seguir = false; 
           }
        }  
    }
        
    // ------------------------ METODO BARAJA --------------------------------------
       public void baraja(){
           boolean mas = true;
         while(mas){
             System.out.println("Desea mas cartas? ");
             String opc = leo.next();
             
             if(opc.equalsIgnoreCase("s")){
                 Collections.shuffle(cartas);
                    System.out.println(cartas);
                } else{
                 System.out.println("====== NO SE PIDIERON MAS CARTAS=============== ");
                 
             }
             mas = false;
         }              
      }
         
     // ------------------ METODO SIGUIENTE CARTA -------------------------------------------
        public void siguienteCarta(){
                 if(cartasDadas<40){
            System.out.print(cartas.get(cartasDadas).toString() + "\t");
            cartasDadas++;
               } else{
            System.out.println("No hay más cartas...!");
           }
        } 
            
    // -------------------- METODO CARTAS DISPONIBLES -------------------------------------        
       public int cartasDisponibles(){
        System.out.println("\nQuedan " + (40 - cartasDadas) + " cartas");
        return cartas.size();
       }

// --------------------- METODODAR CARTAS --------------------------
    public void darCartas(){
                       System.out.println("Cuantas cartas desea? ");
                    int deseo = leo.nextInt();

                      if (cartasDadas + deseo > 40) {
                          System.out.println("============ NO HAY MAS CARTAS ===============");
                                return;
                             }

                for (int i = 0; i < deseo; i++) {
                 Collections.shuffle(cartas);
                 System.out.println(cartas.get(cartasDadas).toString() + "\t");
                  cartasDadas++;
                      }
     
        }
   // ------------------- METODO CREAR MONTON ---------------------------------
    public void cartasMonton(){
        if( cartasDadas >0){
            System.out.println("Las cartas dadas son: ");
            
            for (int i = 0; i < cartasDadas; i++) {
                
                System.out.println(cartas.get(i).toString());
                     if(i%10 == 9){
                    System.out.println("");
                 }
               }
             } else{
              System.out.println("\nAún no ha salido ninguna carta");
             }
          }
        
    
// ------------------------- METODO MOSTRAR BARAJA -----------------------------------
  public void mostrarBaraja() {
             
      System.out.println("===== LAS CARTAS DADAS SON ==========  ");
      for (int i = cartasDadas; i < cartas.size(); i++) {
          System.out.println(cartas.get(i).toString());
           if ( i % 10 == 9){
               System.out.println("");
      }

}
}      
}    
    
    

