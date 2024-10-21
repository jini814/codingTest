import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int totalWeight = 0;
        int answer = 0;
        int index = 0; 

        for (int i = 0; i < bridge_length; i++) {
            bridge.add(0);
        }

        while (index < truck_weights.length || totalWeight > 0) {
            answer++; 

            int exitedTruck = bridge.poll();
            totalWeight -= exitedTruck;

            if (index < truck_weights.length && totalWeight + truck_weights[index] <= weight) {
                bridge.add(truck_weights[index]); 
                totalWeight += truck_weights[index];
                index++; 
            } else {
                bridge.add(0); 
            }
        }

        return answer;
    }
}