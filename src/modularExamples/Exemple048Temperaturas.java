/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularExamples;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Exemple048Temperaturas {
    public static final int MAX_TEMPERATURAS=20;
    public static float temperaturas[]=new float[MAX_TEMPERATURAS];
    public static int temperaturasIntroducidas=0;

    
    public static void main(String[] args) {
        boolean fi=false;
        do{
            imprimirMenú();
            fi=opciones();
        }while(!fi);   
        System.out.println("gracias por su visita.");
        
    }
    
    public static boolean opciones(){
        int opción=introducirOpción(0, 3);
        switch(opción) {
            case 1:
                entrarTemperaturas();
                break;
            case 2:
                mostrarTemperaturaMedia();
                break;
            case 3:
                mostrarTemperaturaMaxima();
                break;
            case 0:
                return true;
            }
        return false;
    }    
        
    public static void entrarTemperaturas(){
        boolean fi=false;
        temperaturasIntroducidas=0;
        Scanner teclado=new Scanner(System.in);
        do{
            System.out.println("Ponga las temperaturas, x para finalizar");
            if(teclado.hasNextFloat()){
                if(temperaturasIntroducidas<temperaturas.length){
                    temperaturas[temperaturasIntroducidas]=teclado.nextFloat();
                    temperaturasIntroducidas++;
                }else{
                    System.out.println("Memoria agotada");
                }    
            }else{      
                if(teclado.next().equals("x")){
                    System.out.println("Datos introducidos correctamente.");
                    fi=true;  
                }else{
                    System.out.println("Valor no correcto.");
                }
            }    
        }while(!fi);
    }
    
    public static int introducirOpción(int min, int max){
        boolean fi=false;
        Scanner teclado=new Scanner(System.in);
        int opció=0;
        do{
            if(teclado.hasNextInt()){
                opció=teclado.nextInt();
                if(opció>=min && opció<=max){
                    fi=true;
                }else{
                    System.out.println("El valor tiene que ser un entero entre "
                        +min+" y "+max);
                }
            }else{
                System.out.println("El valor tiene que ser un entero entre "
                    +min+" y "+max);
            } 
            teclado.nextLine();
        }while(!fi);
        return opció;
    }
    
    public static void mostrarTemperaturaMaxima(){
        
        int x = 0;
        float[] array = new float[temperaturasIntroducidas];
        
        for(int i =0; i < temperaturasIntroducidas ; i++){
            array[i] = temperaturas[i];
        } 
        for(int i = 0; i < array.length; i++){
            for(int j = i; j < array.length; j++){           
                if(array[i] > array[j]){
                   float cambio = array[i];
                   array[i]= array[j];
                   array[j]= cambio;   
                }      
            }   
            x++;
        }
        System.out.println(array[x -1]);
    }
    
    public static void mostrarTemperaturaMedia(){
        
        float media = 0;
        float tam = temperaturasIntroducidas;
        for(float elem: temperaturas){
            media += elem; 
        }
        System.out.println((media) / tam); 
 
    }

    public static void imprimirMenú(){
        System.out.println("Benvingut al registre de tempetarures.");
        System.out.println("--------------------------------------");
        System.out.println("1) Registrar temperaturas.");
        System.out.println("2) Consultar media.");
        System.out.println("3) Consultar temperatura máxima.");
        System.out.println("0) Salir.");
        System.out.println("escoja opción 0 a 3");
    }    
            
    
}
