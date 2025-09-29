/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mina
 */
public class Main {
    public static void main(String[] args) {
        // Creo el deck y pruebo todos los métodos para ver cómo funciona.
        Deck deck = new Deck();

        // Primero mezclo el deck.
        deck.shuffle();

        // Saco la primera carta.
        deck.head();

        // Saco una carta random.
        deck.pick();

        // Pido una mano de 5 cartas.
        deck.hand();
    }
}

    

