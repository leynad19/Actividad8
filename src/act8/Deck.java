/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act8;

import java.util.LinkedList;
import java.util.Random;

public class Deck {
    
    public void deck(){

            Card TrA = new Card("Tréboles", "negro", "A");
            Card Tr2 = new Card("Tréboles", "negro", "2");
            Card Tr3 = new Card("Tréboles", "negro", "3");
            Card Tr4 = new Card("Tréboles", "negro", "4");
            Card Tr5 = new Card("Tréboles", "negro", "5");
            Card Tr6 = new Card("Tréboles", "negro", "6");
            Card Tr7 = new Card("Tréboles", "negro", "7");
            Card Tr8 = new Card("Tréboles", "negro", "8");
            Card Tr9 = new Card("Tréboles", "negro", "9");
            Card Tr10 = new Card("Tréboles", "negro", "10");
            Card TrJ = new Card("Tréboles", "negro", "J");
            Card TrQ = new Card("Tréboles", "negro", "Q");
            Card TrK = new Card("Tréboles", "negro", "K");

            Card CzA = new Card("Corazones", "rojo", "A");
            Card Cz2 = new Card("Corazones", "rojo", "2");
            Card Cz3 = new Card("Corazones", "rojo", "3");
            Card Cz4 = new Card("Corazones", "rojo", "4");
            Card Cz5 = new Card("Corazones", "rojo", "5");
            Card Cz6 = new Card("Corazones", "rojo", "6");
            Card Cz7 = new Card("Corazones", "rojo", "7");
            Card Cz8 = new Card("Corazones", "rojo", "8");
            Card Cz9 = new Card("Corazones", "rojo", "9");
            Card Cz10 = new Card("Corazones", "rojo", "10");
            Card CzJ = new Card("Corazones", "rojo", "J");
            Card CzQ = new Card("Corazones", "rojo", "Q");
            Card CzK = new Card("Corazones", "rojo", "K");

            Card PcA = new Card("Picas", "negro", "A");
            Card Pc2 = new Card("Picas", "negro", "2");
            Card Pc3 = new Card("Picas", "negro", "3");
            Card Pc4 = new Card("Picas", "negro", "4");
            Card Pc5 = new Card("Picas", "negro", "5");
            Card Pc6 = new Card("Picas", "negro", "6");
            Card Pc7 = new Card("Picas", "negro", "7");
            Card Pc8 = new Card("Picas", "negro", "8");
            Card Pc9 = new Card("Picas", "negro", "9");
            Card Pc10 = new Card("Picas", "negro", "10");
            Card PcJ = new Card("Picas", "negro", "J");
            Card PcQ = new Card("Picas", "negro", "Q");
            Card PcK = new Card("Picas", "negro", "K");

            Card DA = new Card("Diamantes", "rojo", "A");
            Card D2 = new Card("Diamantes", "rojo", "2");
            Card D3 = new Card("Diamantes", "rojo", "3");
            Card D4 = new Card("Diamantes", "rojo", "4");
            Card D5 = new Card("Diamantes", "rojo", "5");
            Card D6 = new Card("Diamantes", "rojo", "6");
            Card D7 = new Card("Diamantes", "rojo", "7");
            Card D8 = new Card("Diamantes", "rojo", "8");
            Card D9 = new Card("Diamantes", "rojo", "9");
            Card D10 = new Card("Diamantes", "rojo", "10");
            Card DJ = new Card("Diamantes", "rojo", "J");
            Card DQ = new Card("Diamantes", "rojo", "Q");
            Card DK = new Card("Diamantes", "rojo", "K");


            LinkedList<Card> cartas = new LinkedList<Card>();

            cartas.add(TrA);
            cartas.add(Tr2);
            cartas.add(Tr3);
            cartas.add(Tr4);
            cartas.add(Tr5);
            cartas.add(Tr6);
            cartas.add(Tr7);
            cartas.add(Tr8);
            cartas.add(Tr9);
            cartas.add(Tr10);
            cartas.add(TrJ);
            cartas.add(TrQ);
            cartas.add(TrK);

            cartas.add(CzA);
            cartas.add(Cz2);
            cartas.add(Cz3);
            cartas.add(Cz4);
            cartas.add(Cz5);
            cartas.add(Cz6);
            cartas.add(Cz7);
            cartas.add(Cz8);
            cartas.add(Cz9);
            cartas.add(Cz10);
            cartas.add(CzJ);
            cartas.add(CzQ);
            cartas.add(CzK);

            cartas.add(PcA);
            cartas.add(Pc2);
            cartas.add(Pc3);
            cartas.add(Pc4);
            cartas.add(Pc5);
            cartas.add(Pc6);
            cartas.add(Pc7);
            cartas.add(Pc8);
            cartas.add(Pc9);
            cartas.add(Pc10);
            cartas.add(PcJ);
            cartas.add(PcQ);
            cartas.add(PcK);

            cartas.add(DA);
            cartas.add(D2);
            cartas.add(D3);
            cartas.add(D4);
            cartas.add(D5);
            cartas.add(D6);
            cartas.add(D7);
            cartas.add(D8);
            cartas.add(D9);
            cartas.add(D10);
            cartas.add(DJ);
            cartas.add(DQ);
            cartas.add(DK);

            System.out.println();
            System.out.println("Cantidad de cartas: " + cartas.size());

            Random numsaleatorio = new Random();
            int r = numsaleatorio.nextInt(cartas.size());

            System.out.println("Shuffle: El Deck fue mezclado");
            System.out.println("La primera carta del deck es: " + cartas.get(r));
            cartas.remove(r);
            System.out.println("Quedan: " + cartas.size());

            Random numaleatorio = new Random();
            int n = numaleatorio.nextInt(cartas.size());

            //System.out.println(n);
            System.out.println("Carta: " + cartas.get(n));

            cartas.remove(n);

            System.out.println("Quedan: " + cartas.size());

            Random numaleatorio1 = new Random();
            int j = numaleatorio1.nextInt(cartas.size());

            Random numaleatorio2 = new Random();
            int k = numaleatorio2.nextInt(cartas.size());

            Random numaleatorio3 = new Random();
            int l = numaleatorio3.nextInt(cartas.size());

            Random numaleatorio4 = new Random();
            int o = numaleatorio4.nextInt(cartas.size());

            Random numaleatorio5 = new Random();
            int p = numaleatorio5.nextInt(cartas.size());

            System.out.println("Cartas aleatorias");
            System.out.println(cartas.get(j));
            cartas.remove(j);
            System.out.println(cartas.get(k));
            cartas.remove(k);
            System.out.println(cartas.get(l));
            cartas.remove(l);
            System.out.println(cartas.get(o));
            cartas.remove(o);
            System.out.println(cartas.get(p));
            cartas.remove(p);

            System.out.println("Quenda: " + cartas.size());


        }
    
}
