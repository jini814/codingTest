import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);  //접시
        int d = Integer.parseInt(input[1]);  //종류
        int k = Integer.parseInt(input[2]);  //선택
        int c = Integer.parseInt(input[3]);  //쿠폰번호

        int[] sushi = new int[N];
        for (int i = 0; i < N; i++) {
            sushi[i] = Integer.parseInt(br.readLine());
        }

        int[] count = new int[d + 1]; 
        int current = 0; 

        int start = 0, end = 0;
        int max = 0;

        while (end < k) {
            if (count[sushi[end]] == 0) current++; 
            count[sushi[end]]++;
            end++;
        }

        if (count[c] == 0) current++; 
        count[c]++;

        max = current;

        while (end < N + k) {
            if (count[sushi[start % N]] == 1) current--; 
            count[sushi[start % N]]--;
            start++;

            if (count[sushi[end % N]] == 0) current++; 
            count[sushi[end % N]]++;
            end++;

            if (count[c] == 0) current++;
            count[c]++;

            max = Math.max(max, current);
        }

        System.out.println(max); 
    }
}