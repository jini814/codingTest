import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]); 
        int k = Integer.parseInt(input[1]); 

        String[] numbersInput = br.readLine().split(" ");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(numbersInput[i]);
        }

        int start = 0, end = 0, len = 0;
        int[] frequency = new int[100001];

        while (end < n) {
            frequency[numbers[end]]++; 

            while (frequency[numbers[end]] > k) {
                frequency[numbers[start]]--;
                start++;
            }

            len = Math.max(len, end - start + 1);
            end++;
        }

        System.out.println(len); 
    }
}