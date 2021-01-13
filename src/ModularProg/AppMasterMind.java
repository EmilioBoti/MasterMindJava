/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModularProg;

import ModularProg.CheckingValues.CheckValues;
import ModularProg.CheckingValues.TheWinner;
import ModularProg.takingValues.ReadOption;
import ModularProg.takingValues.GetNumber;

/**
 *
 * @author emili
 */
public class AppMasterMind {
    public static void main(String[] args) {
              
        int[] randomNum = new int[5];
        
        for(int i =0; i < randomNum.length; i++){
            randomNum[i] = (int)(Math.random()*9 + 1);
        }     
        
        for(int x: randomNum){
            System.out.print(x + " ");
        }
        System.out.println();
        int option = 0;
        
        do{
            
            ReadOption readOption = new ReadOption();
            option = readOption.option();
            
            if(option == 1){
                GetNumber numbers = new GetNumber();
                int[] usersValues = numbers.takeNumber();
                
                CheckValues correctValues = new CheckValues();
                String[] check = correctValues.check(usersValues, randomNum);
                
                for(String x: check){ System.out.print(x);}      
                System.out.println();
                
                TheWinner congratWinner = new TheWinner();
                option = congratWinner.winner(usersValues, randomNum, option);
                 
            }else{
                if(option == 2){
                    System.out.println("Game Over");
                    for(int x: randomNum){ System.out.print(x + " ");}
                    System.out.println();
                    option = 0;
                }
            }
        }while(option != 0);
        
    }
    public void printMenu(){
        System.out.println("1 Para introducir código");
        System.out.println("2 Para Rendirse");
        System.out.println("0 para salr");
    }
   
}
