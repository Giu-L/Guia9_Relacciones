/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9_ejercicio3;

/**
 *
 * @author Usuario
 */
class Carta {
    private int num;
    private String palo;
    
    public Carta(){
        
    }
    public Carta(String palo, int num){
        this.num = num;
        this.palo = palo;
    }

    Carta(int i, String aux) {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
}
