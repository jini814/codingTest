import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map    = new HashMap<>();
        for (int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }

        List<Integer> count = new ArrayList<>(map.values());
        
        count.sort(Collections.reverseOrder());

        int total = 0; 
        int types = 0; 

        for (int cnt : count) {
            total += cnt;
            types++;
            if (total >= k) {
                break;
            }
        }

        return types;
    }
}
