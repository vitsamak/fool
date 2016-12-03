/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fool.cards;

/**
 *
 * @author Auth
 */
class Card{
    private Rang card;
    private Suit suit;
    private boolean trump = false;

    public void setTrump() {
        this.trump = true;
    }
    public Card(Rang card, Suit suit) {
        this.card = card;
        this.suit = suit;
    }

    public Rang getRang() {
        return card;
    }

    public void setRang(Rang card) {
        this.card = card;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" + "card=" + card + ", suit=" + suit + '}';
    }
}