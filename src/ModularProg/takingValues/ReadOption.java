/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModularProg.takingValues;

/**
 *
 * @author Alumno
 */
import java.util.Scanner;
import ModularProg.AppMasterMind;

public class ReadOption {
    public int option(){
        Scanner input = new Scanner(System.in);
        AppMasterMind menu = new AppMasterMind();
        menu.printMenu();
                
        System.out.println("introduce option");
        int opt = input.nextInt();
        
        switch(opt){
            case 1:
                opt = 1;
                break;
            case 2:
                opt = 2;
                break;
            case 0:
                opt = 0;
                break;
        }
        return opt;
    }
}
