import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] str = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, (a, b) -> (b + a).compareTo(a + b));

        if (str[0].equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for (String num : str) {
            result.append(num);
        }

        return result.toString();
    }
}