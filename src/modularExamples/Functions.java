package modularExamples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Functions {
    public static void main(String[] args){
        Reader  read = new Reader();
        read.muestraContenido();
    }
    
}
class Reader{
    public void muestraContenido(){
    
        try{
            FileReader input = new FileReader("C:/Users/emili/Desktop/emilio/Programming/password.txt");
            int c = input.read();
            
            while(c!=-1){
                c = input.read();
                char letter = (char)c;
                System.out.print(letter);
            }
            
        }catch(IOException e){
            System.out.println("Not found");
        }
    }
}
 