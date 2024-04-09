import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] arr = new int[5];
        Arrays.sort(num_list);
        
        for ( int i = 0; i < 5; i++) {
            arr[i] = num_list[i];
        }
        return arr;
    }
}