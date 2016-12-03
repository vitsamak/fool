/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fool.cards;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author Auth
 */
public class Pack {
    
    private int k = 36;

    
    public Card getTrump() {
        return CardDeck[CardDeck.length - 1];
    }
    
    private void SetTrump(){
        CardDeck[CardDeck.length - 1].setTrump();
    }
    
    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
    
    //Колода карт
    private Card[] CardDeck;

    public Card getCard() {
        for(int i = 0; i < CardDeck.length; i++){
            if(CardDeck[i] != null){
                Card temp = new Card(CardDeck[i].getRang(), CardDeck[i].getSuit());
                CardDeck = null;
                return temp;
            }
        }
        return null;
    }
   
    
    public Pack(){
        initPack();
    }
    
    private void initPack(){
        this.CardDeck = new Card[36];
        Rang[] cards = Rang.values();
        Suit[] suits = Suit.values();

        for(int i = 0, k = 0; i < suits.length; i++){
            for(int j = 0; j < cards.length; j++, k++){
                CardDeck[k] = new Card(cards[j], suits[i]);                
            }
        }
        SetTrump();
    }
    
    public void randomSorted(){
        Random rand = new Random(new Date().getTime());
        
        for(int i = 0; i < CardDeck.length * CardDeck.length; i++){
            int card1 = rand.nextInt(CardDeck.length);
            int card2 = rand.nextInt(CardDeck.length);
            Card temp = CardDeck[card1];
            CardDeck[card1] = CardDeck[card2];
            CardDeck[card2] = temp;
            SetTrump();
        }
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("Pack{");
        for (Card CardDeck1 : CardDeck) {
            string.append("\n\t" + CardDeck1.toString());
        }
        
        string.append("\n}");
        return string.toString();
    }
}