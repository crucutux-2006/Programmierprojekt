import java.util.Scanner;

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

            //Eingabewerte Array
           int[] arr = new int [n];  
           //System.out.println("Enter integers in the array");
           for (int i = 0; i < n; i++){
            if (sc.hasNext()) {
                arr[i] = sc.nextInt();
            }   
           }

        //Berechnung 
        int j = 0;
        for(j = 0;j < s;j++){
            if(arr[i] < s)
            math.abs(arr[i] < s);
        }

        sc.close();
    }
}
