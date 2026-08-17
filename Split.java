import java.util.Scanner;
public class Split{
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number (digits must be even!)");
        String s = sc.nextLine();
        
            int length = s.length();
            int half = length / 2;
        
        String part1 = s.substring(0,half);
        String part2 = s.substring(half);
        
        System.out.println(part1 + "\n"+ part2);

        sc.close();

    }
}import java.util.Scanner;
public class Split{
    public static void main(String[] args) {
        
        //Idee: Arraylänge und dann in 2 teilen und erst das erste dann das zweite array ausgeben

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number (digits must be even!)");
        String s = sc.nextLine();
        int half = 0;
        if(sc.hasNextLine()){
            int length = s.length();
            half = length / 2;
        } else {System.out.println("Digits are not even");}
        
        System.out.println(half);


    }
}import java.util.Scanner;
public class Split{
    public static void main(String[] args) {
        
        //Idee: Arraylänge und dann in 2 teilen und erst das erste dann das zweite array ausgeben

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number (digits must be even!)");
        String s = sc.nextLine();
        int half = 0;
        if(sc.hasNextLine()){
            int length = s.length();
            half = length / 2;
        } else {System.out.println("Digits are not even");}
        
        System.out.println(half);


    }
}import java.util.Scanner;
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
