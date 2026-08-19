import java.util.Scanner;
    public class Mean {
        public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();  //n ist anzahl Zahlen

            long[][] arr = new long[n][n];

            //Math.floor();

            for (int i = 0; i < n; i++) {
                   arr[i][i] = sc.nextInt();
                }


            for(int len= 2; len <= n; len++){
            for(int i= 0;i <= n - len; i++){
                int j = i + len - 1;
                arr[i][j] = 0;
                 for(int k = i; k <= j-1 ;k++){
                     long links= arr[i][k];
                     long rechts = arr[k+1][j];
                     long kombi= (links + rechts)/2;

                     arr[i][j]=Math.max(arr[i][j], kombi);
                     } } }
        System.out.println(arr[0][n-1]);
        }}
