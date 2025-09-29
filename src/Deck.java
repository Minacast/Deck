/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mina
 */
import java.util.*;

public class Deck {
    // Aquí voy a guardar todas las cartas.
    // Uso un ArrayList porque necesito poder barajar y sacar cartas fácilmente.
    private final List<Card> cards;

    // Aquí guardo las cartas que ya se sacaron (solo para tener control extra).
    private final Deque<Card> descartadas;

    // Constructor: apenas se cree el Deck, se llenan las 52 cartas.
    public Deck() {
        this.cards = new ArrayList<>();
        this.descartadas = new ArrayDeque<>();
        inicializarBaraja();
    }

    // Método para crear las 52 cartas.
    private void inicializarBaraja() {
        String[] palos  = {"tréboles", "corazones", "picas", "diamantes"};
        String[] valores = {"2","3","4","5","6","7","8","9","10","A","J","Q","K"};

        for (String palo : palos) {
            // Reglas del poker: tréboles y picas son negras; corazones y diamantes rojas.
            String color = (palo.equals("tréboles") || palo.equals("picas")) ? "negro" : "rojo";
            for (String valor : valores) {
                cards.add(new Card(palo, color, valor));
            }
        }
        // Listo: 52 cartas dentro del ArrayList.
    }

    // Mezclar las cartas. Aquí solo llamo a Collections.shuffle.
    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }

    // head: muestra la primera carta y la saca del mazo.
    public void head() {
        if (cards.isEmpty()) {
            System.out.println("No hay cartas en deck");
            return;
        }
        Card c = cards.remove(0); // la primera siempre es índice 0
        descartadas.push(c);
        System.out.println(c);
        System.out.println("Quedan " + cards.size() + " cartas en deck");
    }

    // pick: como head, pero ahora saco una carta al azar.
    public void pick() {
        if (cards.isEmpty()) {
            System.out.println("No hay cartas en deck");
            return;
        }
        int idx = new Random().nextInt(cards.size());
        Card c = cards.remove(idx);
        descartadas.push(c);
        System.out.println(c);
        System.out.println("Quedan " + cards.size() + " cartas en deck");
    }

    // hand: dame 5 cartas, imprímelas y sácalas del mazo.
    public Card[] hand() {
        if (cards.size() < 5) {
            System.out.println("No hay suficientes cartas en deck");
            return new Card[0];
        }
        Card[] mano = new Card[5];
        for (int i = 0; i < 5; i++) {
            mano[i] = cards.remove(0);
            descartadas.push(mano[i]);
            System.out.println(mano[i]); // imprimo cada carta
        }
        System.out.println("Quedan " + cards.size() + " cartas en deck");
        return mano;
    }

    // Por si quiero ver cuántas cartas quedan en el deck actual.
    public int size() { return cards.size(); }
}

    
}
