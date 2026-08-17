import java.util.Scanner;

public class NiceSet {
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        //Initialisierung des Arrays auf Basis des User Inputs
        System.out.println("Array Size:");
        int n = 0;
        if(sc.hasNextInt()){
            n = sc.nextInt();}

           int[] arr = new int [n];
        
           System.out.println("Enter integers in the array");
           for (int i = 0; i < n; i++){
            if (sc.hasNext()) {
                arr[i] = sc.nextInt();
            }   
           }

           //Array Elemente
           //for (int i = 0; i < n; i++);


        int s = 0;
        if(sc.hasNext()){
            n = sc.nextInt();
        }

        //index out of bounds check machen

        //for(){

        //}

        sc.close();
    }
}
