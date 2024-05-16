import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        Stack<Integer> burger = new Stack<Integer>();
        
        for(int ing : ingredient) {
            burger.push(ing);
            
            if(burger.size() >= 4) {
                
                if(burger.get(burger.size() - 4) == 1 
                   && burger.get(burger.size() - 3) == 2 
                   && burger.get(burger.size() - 2) == 3 
                   && burger.get(burger.size() - 1) == 1) {
                    answer++;
                    for(int i = 0; i < 4; i++) {
                        burger.pop();
                    }
                }
            }
        }
        return answer;
    }
}