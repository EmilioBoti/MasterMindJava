/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModularProg.takingValues;

/**
 *
 * @author emili
 */
import java.util.Scanner;

public class GetNumber { 
   public int[] takeNumber(){
       
       Scanner input = new Scanner(System.in);
       int userValue[] = new int[5];
       boolean exit = false;
      
       do{
           System.out.println("Introduce a number of five digits.");
           String values = input.nextLine();
           if(values.length() == 5){
               String[] numberStr = values.split("");
               for(int i = 0; i < numberStr.length; i++){
                   userValue[i] = Integer.parseInt(numberStr[i]);
               }
               exit = true;
           }
       }while(!exit);
       return userValue;
   }
}
