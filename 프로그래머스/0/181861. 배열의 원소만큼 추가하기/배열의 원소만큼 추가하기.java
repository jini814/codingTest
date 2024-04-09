import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answerList = new ArrayList<>();
        
        for ( int i = 0; i < arr.length; i++) {
            for ( int j = 1; j <= arr[i]; j++) {
                answerList.add(arr[i]);
            }
        }
        
        int[] answer = new int[answerList.size()];
        
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}