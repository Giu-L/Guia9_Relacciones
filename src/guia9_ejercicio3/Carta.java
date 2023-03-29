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
    private Integer num;
    private String palo;
public Carta(){
    
}

    
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

  @Override
    public String toString() {
        return "Carta{" + "num=" + num + ", palo=" + palo + '}';
    }

    
}
