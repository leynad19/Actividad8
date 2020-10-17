/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act8;

import java.util.Scanner;

/**
 *
 * @author danyg
 */
public class Act8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Deck Deck = new Deck();
        boolean salir = false;
        do {
            switch (showMenu()){
            case 1: 
                Deck.shuffle();
                break;
            case 2: 
                Deck.head();
                break;
            case 3: 
                Deck.pick();
                break;
            case 4: 
                Deck.hand();
                break;
            case 0: 
                salir = true;
                System.out.println("Gracias!");
                break;
            default: 
                System.out.println("Opción no válida");
        }
        } while (!salir);
        
    }
    
    public static int showMenu(){
        Scanner s = new Scanner(System.in);
        System.out.print("Opción: \033[30m");
        System.out.println("Bienvenido a Poker");
        System.out.println("Selecciona una opcion");
        System.out.println("1. Mezclar Deck");
        System.out.println("2. Sacar una carta");
        System.out.println("3. Carta al azar");
        System.out.println("4. Generar una mano de 5 cartas");
        System.out.println("0. Salir");
        System.out.println("Opcion: ");
        return s.nextInt();
    }
        
 }
