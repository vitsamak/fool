/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fool;
import fool.cards.Pack;
/**
 *
 * @author Auth
 */
public class run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pack p = new Pack();
        System.out.println(p.toString());
        System.out.println("Trump: " + p.getTrump());
        p.randomSorted();
        System.out.println("Sorted:\n" + p.toString());
        System.out.println("Trump: " + p.getTrump());
    }
    
}
