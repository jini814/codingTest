import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        
        // mbti 별 점수 저장할 해쉬맵 만들고, 안에 알파벳 넣기
        HashMap<Character, Integer> mbti = new HashMap<>();
        char[] mbti_c = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        
        for (char c : mbti_c) {
            mbti.put(c, 0);
        }
        
        for (int i = 0; i < survey.length; i++) {
            if (choices[i] < 4)
                mbti.put(survey[i].charAt(0), mbti.get(survey[i].charAt(0)) + 4 - choices[i]);
            else if (choices[i] > 4) {
                mbti.put(survey[i].charAt(1), mbti.get(survey[i].charAt(1)) + choices[i] - 4);
            }
        }
        
        answer.append(mbti.get('R') >= mbti.get('T') ? "R" : "T");
        answer.append(mbti.get('C') >= mbti.get('F') ? "C" : "F");
        answer.append(mbti.get('J') >= mbti.get('M') ? "J" : "M");
        answer.append(mbti.get('A') >= mbti.get('N') ? "A" : "N");
    
        return answer.toString();
    }
}
