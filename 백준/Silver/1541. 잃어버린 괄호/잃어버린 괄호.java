import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        String[] parts = input.split("-");

        int result = 0;

        result += sumOfPart(parts[0]);

        for (int i = 1; i < parts.length; i++) {
            result -= sumOfPart(parts[i]);
        }

        System.out.println(result);
    }

    private static int sumOfPart(String part) {
        String[] numbers = part.split("\\+");
        int sum = 0;
        for (String num : numbers) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}