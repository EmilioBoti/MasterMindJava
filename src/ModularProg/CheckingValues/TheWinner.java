/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModularProg.CheckingValues;

/**
 *
 * @author emili
 */
public class TheWinner {
    public int winner(int[] checkedValues, int[] numRandom, int option){
        
        if(numRandom[0] == checkedValues[0] && numRandom[1] == checkedValues[1]
            && numRandom[2] == checkedValues[2]&& numRandom[3] == checkedValues[3]
            && numRandom[4] == checkedValues[4]){
            option = 0;
            congradulation();
        }
        return option;
    }
    public static void congradulation(){
        System.out.println("Congradulation, you have WON!! :)");
    }
}
