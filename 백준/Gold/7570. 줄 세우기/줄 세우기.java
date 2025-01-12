import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nStr = br.readLine();

        if (nStr == null || nStr.isEmpty()) {
            System.out.println(0);
            return;
        }

        int N = Integer.parseInt(nStr);
        if (N <= 0) {
            System.out.println(0);
            return;
        }

        String[] arrStr = br.readLine().split(" ");
        if (arrStr.length != N) {
            System.out.println(0);
            return;
        }

        int[] arr = Arrays.stream(arrStr).mapToInt(Integer::parseInt).toArray();

        int[] seq = new int[N + 1];
        for (int i = 0; i < arr.length; i++) {
            seq[arr[i]] = i + 1;
        }

        int lisLen = 1;
        int currentLen = 1;
        for (int i = 1; i < N; i++) {
            if (seq[i] < seq[i + 1]) {
                currentLen++;
            } else {
                currentLen = 1;
            }
            lisLen = Math.max(lisLen, currentLen);
        }

        System.out.println(N - lisLen);
    }
}