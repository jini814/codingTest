import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int nA = Integer.parseInt(st.nextToken());
        int nB = Integer.parseInt(st.nextToken());

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            setB.add(Integer.parseInt(st.nextToken()));
        }

        setA.removeAll(setB);

        if (setA.isEmpty()) {
            System.out.println(0);
        } else {
            List<Integer> result = new ArrayList<>(setA);
            Collections.sort(result);

            sb.append(result.size()).append("\n");
            for (int num : result) {
                sb.append(num).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}