import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;  
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for (int s : scoville) {
            queue.add(s);
        }
        
        while (queue.peek() < K) {
            if (queue.size() < 2) {
                return -1;
            }
            
            int num1 = queue.poll();  
            int num2 = queue.poll(); 
            
            int newScoville = num1 + (num2 * 2);
            queue.add(newScoville);  
            
            answer++;
        }
        return answer;
    }
}