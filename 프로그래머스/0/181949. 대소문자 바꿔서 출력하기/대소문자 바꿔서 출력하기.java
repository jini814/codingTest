import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            
            if (ch >= 97 && ch <= 122) {
                result.append(Character.toUpperCase(ch));
            } else if (ch >= 65 && ch <= 90) {
                result.append(Character.toLowerCase(ch));
            }
        }

        System.out.println(result.toString());
    }
}
