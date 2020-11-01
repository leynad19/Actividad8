/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act8;

import java.util.*;

public class Deck {
    
    private final String[] palos = {"Tréboles", "Corazones", "Picas", "Diamantes"};
    private final String[] colores = {"Negro", "Rojo"};
    private final String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
        "J", "Q", "K", "A"};
    private final int numCartas = 52;
    private final ArrayList<Card> myDeck = new ArrayList<>();
    private final Random random = new Random();
    
    public Deck(){
        String color;
        for (int i = 0; i < numCartas; i++) {
            color = ((i>12 && i<26) || i>38)?colores[1]:colores[0];
            myDeck.add(new Card(palos[i/13], color, valores[i%13]));
        }
    }
    
    public void shuffle(){
        int aux;
        final int totalCartas = myDeck.size();
        ArrayList<Card> tempDeck = new ArrayList<>();
        if (myDeck.size()>0) {
            for (int i = 0; i < totalCartas; i++) {
            aux = random.nextInt(myDeck.size());
            tempDeck.add(myDeck.remove(aux));
            }
            for (int i = 0; i < totalCartas; i++) {
                aux = random.nextInt(tempDeck.size());
                myDeck.add(tempDeck.remove(aux));
            }
        System.out.println("Se mezcló el deck");
        } else {
            System.out.println("No hay cartas en deck");
        }
        
    }
    
    public void head()throws Exception{
        try{
        
            System.out.printf("%s\nQuedan %d cartas en deck\n", myDeck.remove(0),
                myDeck.size());
        
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Se han agotado las cartas.");
            System.out.println("Aplicación finalizada.");
            System.exit(0);
        }
        
    }
    
    public void pick() throws Exception{
        
        try{
        int ranCard; 
            ranCard = random.nextInt(myDeck.size());
            System.out.printf("%s\nQuedan %d cartas en deck\n", 
                myDeck.remove(ranCard), myDeck.size());
        
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Se han agotado las cartas.");
            System.out.println("Aplicación finalizada.");
            System.exit(0);
        }
        
    }
    
    public void hand() throws Exception{
        try{
        for (int i = 0; i < 5; i++) {
            
                System.out.println(myDeck.remove(0));
             
            
        }
        System.out.printf("Quedan %d cartas en deck\n", myDeck.size());
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Se han agotado las cartas.");
            System.out.println("Aplicación finalizada.");
            System.exit(0);
        }
    }
    
    public Card[] Hand(){
        Card[] myHand = new Card[5];
        if (myDeck.size()>0) {
            for (int i = 0; i < myHand.length; i++) {
            myHand[i] = myDeck.remove(i);
            System.out.println(myHand[i]);
            }
        } else {
            System.out.println("No hay suficientes cartas en deck");
        }
        
        System.out.printf("Quedan %d cartas en deck\n", myDeck.size());
        return myHand;
    }

    @Override
    public String toString() {
        for (int i = 0; i < myDeck.size(); i++) {
            System.out.println(myDeck.get(i).toString());
        }
        return "";
    }
    
}
