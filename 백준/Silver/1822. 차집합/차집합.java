import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int nA = Integer.parseInt(input[0]);
        int nB = Integer.parseInt(input[1]);

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        String[] elementsA = br.readLine().split(" ");
        for (String num : elementsA) {
            setA.add(Integer.parseInt(num));
        }

        String[] elementsB = br.readLine().split(" ");
        for (String num : elementsB) {
            setB.add(Integer.parseInt(num));
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