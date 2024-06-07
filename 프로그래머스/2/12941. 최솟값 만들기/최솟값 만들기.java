import java.util.*;

class Solution {
    public int solution(int []A, int []B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        int index = A.length - 1;
        
        //정렬한 후 제일 작은 값과 제일 큰 값 곱해서 더하기
        for(int i = 0; i < A.length; i++) {
            answer += A[i] * B[index];
            index--;
        }
        return answer;
    }
}