import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] failure = new double[N]; //실패율
        int[] reachedUser = new int[N]; //도달한 사람
        
        for(int i = 0; i < stages.length; i++) {
            if (stages[i] <= N) {
               reachedUser[stages[i] - 1]++; 
            }
        }
        
        int totalUser = stages.length;
        for(int i = 0; i < N; i++) {
            if (totalUser == 0) {
                failure[i] = 0;
            } else {
                failure[i] = (double) reachedUser[i] / totalUser;
                totalUser -= reachedUser[i];
            }
        }
        
        Map<Integer, Double> failureMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            failureMap.put(i + 1, failure[i]);
        }

        List<Integer> sortedStages = new ArrayList<>(failureMap.keySet());
        sortedStages.sort((a, b) -> Double.compare(failureMap.get(b), failureMap.get(a)));

        for (int i = 0; i < N; i++) {
            answer[i] = sortedStages.get(i);
        }
        
        return answer;
    }
}