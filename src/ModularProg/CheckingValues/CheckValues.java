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
public class CheckValues {
    
    String[] correctValues = new String[5];
    
    public String[] check(int[] userValues, int[] randomNum){
        for(int i = 0; i < correctValues.length; i++){
            
            if(userValues[i] == randomNum[i]){
                correctValues[i] = String.valueOf(userValues[i]);
            }else{
                if(userValues[i] > randomNum[i]){
                    correctValues[i] = "-";
                }else if(userValues[i] < randomNum[i]) {
                    correctValues[i] = "+";
                }
            }
        }
        return correctValues;
    }
}
