import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);  
        int K = Integer.parseInt(s[1]);  

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int start = 0, end = 0, current = 0, sum = Integer.MIN_VALUE;

        while (end < N) {
            current += arr[end++];

            if (end - start == K) {
                sum = Math.max(sum, current);
                current -= arr[start++];
            }
        }

        System.out.println(sum);  
    }
}