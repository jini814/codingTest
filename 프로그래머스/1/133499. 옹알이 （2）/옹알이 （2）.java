import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        String[] str = {"aya", "ye", "woo", "ma"};
        String[] str2 = {"ayaaya", "yeye", "woowoo", "mama"};
        int answer = 0;
        
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < str.length; j++) {
                babbling[i] = babbling[i].replaceAll(str2[j], "1").replaceAll(str[j], " ");
            }
            if (babbling[i].trim().length() == 0) {
                answer++;
            }
        }
        return answer;
    }
}