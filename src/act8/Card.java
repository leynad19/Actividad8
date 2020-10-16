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
    
    private String palos;
    private String color;
    private String valor;
    
    
    public Card(String palos, String color, String valor) {

            this.palos = palos;
            this.color = color;
            this.valor = valor;


        }

    @Override
    public String toString() {
        return "" + palos +   " " + color +  " " + valor ;
    }

}
