
import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Set<Integer> bro1 = new HashSet<>();
        Map<Integer, Integer> bro2 = new HashMap<>();
        
        for(int top : topping) {
            bro2.put(top, bro2.getOrDefault(top, 0) + 1);
        }

        for(int top : topping) {
            bro2.computeIfPresent(top, (key, value) -> value-1);
            bro1.add(top);

            if(bro2.get(top) == 0) {
                bro2.remove(top);
            }

            if(bro1.size() == bro2.size()) {
                answer++;
            }
        }

        return answer;
    }
}