import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        // 철수와 동생의 토핑을 추적하는 두 개의 자료구조
        Set<Integer> leftSet = new HashSet<>();  // 철수의 토핑 종류
        Map<Integer, Integer> rightMap = new HashMap<>();  // 동생의 토핑과 그 개수

        // 동생의 초기 토핑 정보 저장
        for (int t : topping) {
            rightMap.put(t, rightMap.getOrDefault(t, 0) + 1);
        }

        // 각 자를 위치에서 철수와 동생의 토핑 종류 수 비교
        for (int i = 0; i < topping.length - 1; i++) {
            int t = topping[i];
            
            // 철수는 토핑 추가
            leftSet.add(t);
            
            // 동생은 현재 토핑을 하나 줄임
            rightMap.put(t, rightMap.get(t) - 1);
            if (rightMap.get(t) == 0) {
                rightMap.remove(t);  // 개수가 0이 되면 제거
            }
            
            // 철수와 동생의 토핑 종류 수가 같으면 공평하게 나눌 수 있음
            if (leftSet.size() == rightMap.size()) {
                answer++;
            }
        }

        return answer;
    }
}