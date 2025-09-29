/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mina
 */
public class Card {
    // Cada carta necesita estas 3 cosas básicas:
    // Palo (♣, ♥, ♠, ♦), Color (rojo/negro) y Valor (2–10, A, J, Q, K).
    private final String palo;
    private final String color;
    private final String valor;

    // Constructor: así nace cada carta con sus datos.
    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    // Getters por si quiero consultar sus atributos después.
    public String getPalo()   { return palo; }
    public String getColor()  { return color; }
    public String getValor()  { return valor; }

    @Override
    public String toString() {
        // Me piden que se imprima así: Palo,Color,Valor
        return String.format("%s,%s,%s", palo, color, valor);
    }
}

