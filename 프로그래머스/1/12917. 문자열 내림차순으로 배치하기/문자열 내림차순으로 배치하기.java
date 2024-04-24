import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] schar = s.toCharArray();
        Arrays.sort(schar); //정렬
        
        int tmp = 0;
        for (int i = 0; i < schar.length; i++) {
            if (schar[i] > 'Z') {
                tmp = i;
                break;
                //어디서부터 소문자인지 찾기 
            }
        }
    

        //소문자부터 먼저 넣기
        for (int i = schar.length - 1; i >= tmp; i--) {
            answer += schar[i];
        }
        //뒤에 대문자 넣기
        for (int i = tmp - 1; i >= 0; i--) {
            answer += schar[i];
        }
        
        return answer;
    }
}
