import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = new int [arr.length];
        int count = 0;

        for ( int i = 0; i < arr.length; i++) {
                boolean delete = false;
            for ( int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    delete = true;
                }
            }
            if (!delete) {
                answer[count++] = arr[i];
            }
        }
        return Arrays.copyOfRange(answer, 0, count);
    }
}