import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> answer = new HashSet<>();

        int n = elements.length;
        
        for (int length = 1; length <= n; length++) {
            for (int start = 0; start < n; start++) {
                int sum = 0;
                for (int i = 0; i < length; i++) {
                    sum += elements[(start + i) % n];
                }
                answer.add(sum);
            }
        }
        return answer.size();
    }
}
