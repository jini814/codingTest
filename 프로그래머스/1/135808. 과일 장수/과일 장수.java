import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0; 
        Arrays.sort(score);
        
        if(score.length % m == 0) {
            for(int i = 0; i < score.length/m; i++) {
                answer += (score[i * m]) * m * 1;
                //최저 점수 * 한 상자 사과 개수 * 상자의 개수
            }
        } else {
            for(int i = 0; i < score.length/m; i++) {
                answer += (score[score.length % m + (i * m)]) * m * 1;
                //나머지만큼 점수 젤 작은 애들빼고 ++
            }
        }
        
        return answer;
    }
}