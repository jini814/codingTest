import java.util.Arrays;

class Solution {
    public int solution(String[] babbling) {
        String[] str = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for (String baby : babbling) {
            for (String s : str) {
                baby = baby.replace(s, "1");
            }
            baby = baby.replaceAll("1", "");
            if (baby.isEmpty()) {
                answer++;
            }
        }
        
        return answer;
    }
}