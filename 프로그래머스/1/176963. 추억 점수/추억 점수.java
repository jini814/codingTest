import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for (int i = 0; i < photo.length; i++) {
            int score = 0;
            for (String person : photo[i]) {
                int index = Arrays.asList(name).indexOf(person);
                if (index != -1) {
                    score += yearning[index];
                }
            }
            answer[i] = score;
        }
        return answer;
    }
}
