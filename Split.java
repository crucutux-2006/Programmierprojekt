import java.util.Scanner;
public class Split{
    public static void main(String[] args) {
        
        //Idee: Arraylänge und dann in 2 teilen und erst das erste dann das zweite array ausgeben

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number (digits must be even!)");
        String s = sc.nextLine();
        if(sc.hasNextLine()){
            int length = s.length();
            int half = length / 2;
        } else {System.out.println("Digits are not even");}
        System.out.println(half);


    }
}
