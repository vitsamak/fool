/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fool.cards;

/**
 *
 * @author auth
 */
public class Hand {
    private int counterCards;
    private Card []cards;
    
    public void addCard(Pack p){
        if(counterCards < 6){
            counterCards++;
            cards[counterCards - 1] = p.getCard();
        }
    }
}
