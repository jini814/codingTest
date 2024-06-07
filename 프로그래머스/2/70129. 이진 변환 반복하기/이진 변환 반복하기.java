import java.util.*;

public class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int count = 0;
        int zeroCut = 0;
        
        while (!s.equals("1")) {
            int zeroCnt = 0;
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    zeroCnt++;
                }
            }
            
            zeroCut += zeroCnt;
            
            int length = s.length() - zeroCnt;
            s = Integer.toBinaryString(length);
            count++;
        }
        answer[0] = count;
        answer[1] = zeroCut;
        
        return answer;
    }
}
