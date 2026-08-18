import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class NiceSet {
    public static void main(String[]args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        //Arraygröße
       // System.out.println("Array Size");
        while (st == null || !st.hasMoreTokens()) {
            String line = br.readLine();
            if (line == null) return;
            st = new StringTokenizer(line);
        }
        int n = Integer.parseInt(st.nextToken());

        //S
       // System.out.println("S: ");
        while (!st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        int s = Integer.parseInt(st.nextToken());

        //Arrawerte
        //System.out.println("Arraywerte ");
        int[] arr = new int[n];
        int count = 0;
        while (count < n) {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            arr[count++] = Integer.parseInt(st.nextToken());
        }
       
        //Berechnung 
        Arrays.sort(arr);
        
        int max = 0;
        int left = 0;
        long totalDiff = 0;
        long windowSum = 0;
        
        for (int right = 0; right < n; right++) {
            long k = right - left;
            totalDiff += (k * arr[right]) - windowSum;
            windowSum += arr[right];
    while (totalDiff > s && left < right) {
                windowSum -= arr[left];
                long kRemaining = right - left;
                totalDiff -= (windowSum - (kRemaining * arr[left]));
                left++;
        }
        max = Math.max(max, right - left + 1);
}
System.out.println(max);
}
}
