import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String s : skill_trees) {
            List<Character> list = new ArrayList<>();
            for (char c : skill.toCharArray()) {
                list.add(c);
            }

            boolean check = true;

            for (char c : s.toCharArray()) {
                if (list.contains(c)) {
                    if (c == list.get(0)) {
                        list.remove(0);
                    } else {
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                answer++;
            }
        }
        return answer;
    }
}