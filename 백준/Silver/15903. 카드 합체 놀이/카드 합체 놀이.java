import java.io.*;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);

        PriorityQueue<Long> pq = new PriorityQueue<>();
        String[] card = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            pq.add(Long.parseLong(card[i]));
        }

        for (int i = 0; i < m; i++) {
            long first = pq.poll();
            long second = pq.poll();

            long sum = first + second;
            pq.add(sum);
            pq.add(sum);
        }

        long answer = 0;
        while (!pq.isEmpty()) {
            answer += pq.poll();
        }

        System.out.println(answer);
    }
}
