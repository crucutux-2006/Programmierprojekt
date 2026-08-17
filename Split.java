import java.util.Scanner;
public class Split{
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        
            int length = s.length();
            int half = length / 2;
        
        String part1 = s.substring(0,half);
        String part2 = s.substring(half);
        
        System.out.println(part1 + " " + part2);

        sc.close();

    }
}
