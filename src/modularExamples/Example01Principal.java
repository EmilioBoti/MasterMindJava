/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularExamples;

import ModularProg.CheckingValues.CheckValues;
import ModularProg.takingValues.GetNumber;

/**
 *
 * @author emili
 */

public class Example01Principal {
    public static void main(String[] args) {
        
        int[] randomNum = new int[5];
        
        for(int i =0; i < randomNum.length; i++){
            randomNum[i] = (int)(Math.random()*5 + 1);
        }        
        GetNumber numbers = new GetNumber();
        boolean exit = false;
        
        for(int x: randomNum){
            System.out.print(x + " ");
        }
        
        /*do{
            int[] usersValues = numbers.takeNumber();
            CheckValues x = new CheckValues();
            boolean check = x.check(usersValues, randomNum);
            System.out.println(check);
            if(check) exit = true;
      
        }while(!exit);
        */
    }
}
