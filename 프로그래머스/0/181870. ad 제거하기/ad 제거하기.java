import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        int count = 0;
        
        for(int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                answer[count++] = strArr[i];
            }
        }
        return Arrays.copyOfRange(answer, 0, count);
    }
}