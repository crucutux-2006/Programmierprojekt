import java.util.Scanner;
import java.util.Arrays;

public class NiceSet {
    public static void main(String[]args){
        
       
        

        Scanner sc = new Scanner(System.in);
        
        //Initialisierung S
        int s = 0;
        if(sc.hasNext()){
            s = sc.nextInt();
        }

        //Initialisierung Arraygröße
        System.out.println("Array Size:");
        int n = 0;                  //n ist Userinput
        if(sc.hasNextInt()){
            n = sc.nextInt();}

            int i = 0;
            //Eingabewerte Array
           int[] arr = new int [n];  
           //System.out.println("Enter integers in the array");
           for (i = 0; i < n; i++){
            if (sc.hasNext()) {
                arr[i] = sc.nextInt();
            }   
           }

        //Berechnung 
        int j = 0;
        Arrays.sort(arr);
        for(j = 0;j < s;j++){
            
            Math.abs();
        }

        sc.close();
    }
}
