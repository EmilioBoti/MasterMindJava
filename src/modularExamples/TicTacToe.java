package modularExamples;

import java.util.Scanner;

public class TicTacToe {
    
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int turn = 1;
        String player = "X";
        String[][] position = {
            {" "," "," "},
            {" "," "," "},
            {" "," "," "}
        };
        
        do{
            System.out.println("player: " + player + " is your turn");
            
            int userX = takeUserValue();
            String[][] play = play(userX, player, position);
            
            for(int f = 0; f < play.length; f++){
                for(int c = 0; c < play.length; c++){
                    System.out.print(play[f][c]+ "|");
                }
                System.out.println();
            }
            boolean winner = checkWinner(position);
            System.out.println(winner);
            
            turn++;
            if("X".equals(player))
                player = "O";
                else
                player = "X";
            
            
            
        }while(turn != 10);
        System.out.println("*******************");
        
    }
    public static boolean checkWinner(String[][] matrixPlay){
        boolean winner = false;
        
        if((matrixPlay[0][0].equals(matrixPlay[0][1])) && (matrixPlay[0][0].equals(matrixPlay[0][1]))){
            if("X".equals(matrixPlay[0][0])){
                winner = true;
            }else{
               winner = false;
            }
          }
          //Done line 1
          if( (matrixPlay[0][0].equals(matrixPlay[1][1])) && (matrixPlay[0][0] == matrixPlay[2][2])){
            if("X".equals(matrixPlay[0][0])){
                winner = true;
            }else{
                winner = false;
            }
          }
          //Done diagonal 1--> \
          if( (matrixPlay[1][0] == matrixPlay[1][1]) && (matrixPlay[1][1] == matrixPlay[1][2])){
            if(matrixPlay[1][0] == "X"){
                winner = true;
            }else{
                winner = false;
            }
          }
          //Done line 2
          if( (matrixPlay[2][0] == matrixPlay[2][1]) && (matrixPlay[2][1] == matrixPlay[2][2])){
            if(matrixPlay[2][0] == "X"){
                winner = true;
            }else{
                winner = false;
            }
          }
          //Done line 3
          if((matrixPlay[0][0] == matrixPlay[1][0]) && (matrixPlay[0][0] == matrixPlay[2][0])){
            if(matrixPlay[0][0] == "X"){
                winner = true;
            }else{
                winner = false;
            }
          }
          //Done colunm 1
          if( (matrixPlay[2][0] == matrixPlay[1][1]) && (matrixPlay[2][0] == matrixPlay[0][2])){
            if(matrixPlay[2][0] == "X"){
                winner = true;
            }else{
               winner = false;
            }
          }
          //Done diagonal 2--> /
          if( (matrixPlay[0][2] == matrixPlay[1][2]) && (matrixPlay[0][2] == matrixPlay[2][2])){
            if(matrixPlay[0][2] == "X"){
                winner = true;
            }else{
                winner = false;
            }
          } 
          //Done colunm 2
          if( (matrixPlay[0][1] == matrixPlay[1][1]) && (matrixPlay[0][1] == matrixPlay[2][1])){
            if(matrixPlay[0][1] == "X"){
                winner = true;
            }else{
                winner = false;
            }
        }   
        return winner;
    }
    
    public static String[][] play(int value, String player, String[][] position){
        
        switch(value){
            case 1:
                position[0][0] = player;
                break;
            case 2:
                position[0][1] = player;
                break;
            case 3:
                position[0][2] = player;
                break;
            case 4:
                position[1][0] = player;
                break;
            case 5:
                position[1][1] = player;
                break;
            case 6:
                position[1][2] = player;
                break;
            case 7:
                position[2][0] = player;
                break;
            case 8:
                position[2][1] = player;
                break;
            case 9:
                position[2][2] = player;
                break;
                
        }
        return position;
    }
    public static int takeUserValue(){
        
        boolean exit = false;
        int userX = 0;
        
        do{
            
            if(input.hasNextInt()){
                userX = input.nextInt();
                if(userX > 0 && userX <= 9){
                    exit = true;
                }
            }
            input.nextLine();
        }while(!exit);
        
        return userX;
    }
    
    
}
