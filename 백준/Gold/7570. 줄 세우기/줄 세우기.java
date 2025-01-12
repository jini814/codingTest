import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String[] input = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int[] pos = new int[N + 1];
        for (int i = 0; i < N; i++) {
            pos[arr[i]] = i;
        }

        int maxSeqLen = 1;
        int currentSeqLen = 1;
        for (int i = 2; i <= N; i++) {
            if (pos[i] > pos[i - 1]) {
                currentSeqLen++;
                maxSeqLen = Math.max(maxSeqLen, currentSeqLen);
            } else {
                currentSeqLen = 1;
            }
        }

        System.out.println(N - maxSeqLen);
    }
}