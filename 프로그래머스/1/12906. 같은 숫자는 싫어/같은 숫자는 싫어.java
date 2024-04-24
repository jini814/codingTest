import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int tmp = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (tmp != arr[i]) {
                list.add(tmp);
                tmp = arr[i];
            }
            if (i == arr.length - 1 ) {
                list.add(tmp);
                break;
            }
        }
        int[] answer = new int[list.size()];
        for(int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }
}