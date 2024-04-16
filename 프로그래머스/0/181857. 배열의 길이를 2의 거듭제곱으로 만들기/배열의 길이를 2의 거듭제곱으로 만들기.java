import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int next = 1;
        
        if ((len & (len - 1)) == 0) {
            return arr;
        }
        
        while (next < len) {
            next *= 2;
        }
        
        int[] answer = new int[next];
        System.arraycopy(arr, 0, answer, 0, len);
        
        return answer;
    }
}
