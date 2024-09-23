import java.util.*;

class Solution {
    public int[] solution(String msg) {
        // 사전 초기화
        Map<String, Integer> dictionary = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            dictionary.put(String.valueOf((char)('A' + i)), i + 1);
        }
        
        List<Integer> answer = new ArrayList<>();
        int nextCode = 27;
        
        for (int i = 0; i < msg.length(); i++) {
            String w = String.valueOf(msg.charAt(i));
            
            // 가능한 가장 긴 문자열 찾기
            while (i + 1 < msg.length() && dictionary.containsKey(w + msg.charAt(i + 1))) {
                i++;
                w += msg.charAt(i);
            }
            
            // 색인 번호 출력
            answer.add(dictionary.get(w));
            
            // 새로운 단어 사전에 추가
            if (i + 1 < msg.length()) {
                dictionary.put(w + msg.charAt(i + 1), nextCode++);
            }
        }
        
        // List<Integer>를 int[] 로 변환
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}