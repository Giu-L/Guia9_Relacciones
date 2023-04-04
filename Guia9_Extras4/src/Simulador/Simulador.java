/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simulador;

import Entidades.Alumnos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Simulador {
     private Scanner scan;
     private HashMap<Integer, Alumno> alumnos;
     
     // CONSTANTES 
    private static  String[] nombres = { "Jose", "Mike", "Damian " , "Martin ", "Carlos","Lautaro","Giuliana","Milo","Javier ", "Rita"};
      private static  String [] apellidos = { "Pensotti ", "Peres","Fernandez","Bañuelos","Alvarez","Monzon","Ojededa","Pizza","Giordano","Groosman"};
        
     
     public Simulador(){
         this.scan = new Scanner(System.in);
         this.alumnos = new HashMap();
         
     }
     public String crearNombre(){
      Random r1 = new Random();
      Random r2 = new Random();
      int n = r1.nextInt();
      String nombreCompleto = nombres[r1.nextInt(10)] + " " + apellidos [r2.nextInt(10)];
      return nombreCompleto;
     }
     
     public Integer crearDni(){
         Random r = new Random();
         int n;
             n = r.nextInt(45000000) + 1000000;
         return n;
     
         }
    public Alumnos crearAlumno(){
        Alumnos a = new Alumnos();
        a.setNombreCompleto(crearNombre());
        a.setDni(crearDni());
        
         return a;
      
    }
    
    public void Simulador(HashMap<Integer,Alumnos > alumnos){
        Random r = new Random();
        //HashMap<Integer, String > copiaAlu = new HashMap();
        ArrayList <Integer> copiaA = new ArrayList();
       
        for (Integer alu : alumnos.keySet()) {
            copiaA.add(alu);
        }
        int indice = r.nextInt(copiaA.size());
        copiaA.remove(indice);
        int votador = r.nextInt(copiaA.size());
            
        for (Map.Entry<Integer, Alumnos> entry : alumnos.entrySet()) {
            Integer key = entry.getKey();
            Alumnos value = entry.getValue();
            if(key.equals(copiaA.get(votador))){
             entry.getValue();
        }
        }
        
    }
    
     }
     

