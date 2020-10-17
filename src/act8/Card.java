/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act8;

/**
 *
 * @author danyg
 */
public class Card {
    
    private String palo;
    private String color;
    private String valor;

    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return (palo + ", " + color + ", " + valor);
    }

}
