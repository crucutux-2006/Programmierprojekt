import java.util.Scanner;
import java.util.Arrays;

public class NiceSet {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        //Initialisierung Arraygröße
        System.out.println("Array Size:");
        int n = 0;                  //n ist Userinput
        if(sc.hasNextInt()){
            n = sc.nextInt();}

        //Initialisierung S
        System.out.println("Enter S: ");
        int s = sc.nextInt();

            int i = 0;
            //Eingabewerte Array
           int[] arr = new int [n];  
           System.out.println("Enter integers in the array");
           for (i = 0; i < n; i++){
            if (sc.hasNext()) {
                arr[i] = sc.nextInt();
            }   
           }

        //Berechnung 
        Arrays.sort(arr);
        
        long sum = 0;
            for (i=0;i<s;i++){
                    sum += (arr[i] - arr[n-1]);
                }   
               long sumabs = Math.abs(sum);
        // System.out.println(Arrays.toString(arr)); //Sortiertes array wird ausgegeben
        System.out.println(sumabs);
        sc.close();
    }
}
