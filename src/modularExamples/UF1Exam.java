package modularExamples;

public class UF1Exam {
    public static void main(String[] args) {
        int[][] arr = introduceValues();
        printValues(arr);
        System.out.println("    ");
        printReverse(arr);
        
    }
  
    public static void printReverse(int[][] arr){
        for(int i = arr.length -1; i >= 0; i--){
            for(int n = arr.length -1; n >= 0; n--){
                System.out.print(arr[i][n]+ "  ");
            }
            System.out.println();
        }
    } 
    public static void printValues(int[][] arr){
          for(int i = 0; i < arr.length; i++){
            for(int n =0; n < arr.length; n++){
                System.out.print(arr[i][n] + "  ");
            }
            System.out.println();
        }
    } 
    
    public static int[][] introduceValues(){
        int[][] arr = new int[4][4]; 
        int num = 10;
                
        for(int i = 0; i < arr.length; i++){
            for(int n =0; n <arr.length; n++){
                arr[i][n] = num;
                num++;
            }
        }
        return arr;
    }
}
