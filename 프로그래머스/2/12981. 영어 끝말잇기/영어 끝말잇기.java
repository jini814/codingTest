import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        int person = 1;
        boolean gameEnd = false;
        int[] answer = {0, 0};

        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            
            // 현재 말하는 사람의 번호
            person = (i % n) + 1;
            
            if (list.contains(word) || list.get(list.size() - 1).charAt(list.get(list.size() - 1).length() - 1) != word.charAt(0)) {
                answer[0] = person;
                answer[1] = i / n + 1;
                gameEnd = true;
                break;
            }
            list.add(word);
        }
        return answer;
    }
}
