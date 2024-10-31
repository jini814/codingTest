import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        Map<Integer, Long> map = new HashMap<>();

        for (int weight : weights) {
            map.put(weight, map.getOrDefault(weight, 0L) + 1);
        }

        for (int weight : map.keySet()) {
            long count = map.get(weight);
            
            if (count > 1) {
                answer += (count * (count - 1)) / 2;
            }

            if (map.containsKey(weight * 3 / 2) && (weight * 3) % 2 == 0) 
                answer += count * map.get(weight * 3 / 2);
            if (map.containsKey(weight * 4 / 2)) 
                answer += count * map.get(weight * 4 / 2);
            if (map.containsKey(weight * 4 / 3) && (weight * 4) % 3 == 0) 
                answer += count * map.get(weight * 4 / 3);
        }

        return answer;
    }
}