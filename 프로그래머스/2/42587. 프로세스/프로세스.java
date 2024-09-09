import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{priorities[i], i}); //offer 데이터 추가 메소드
        }
        
        //큐가 안 비어있다면
        while (!queue.isEmpty()) {
            int[] current = queue.poll(); //큐에서 맨 앞에 꺼 가져오기
            boolean hasHigherPriority = false; //우선순위 체크
            
            for (int[] proc : queue) { //남아있는 문서 체크
                if (proc[0] > current[0]) { //만약 우선순위 높은게 있으면 true
                    hasHigherPriority = true; 
                    break;
                }
            }
            
            if (hasHigherPriority) { //있으면 현재꺼를 뒤로 보냄
                queue.offer(current);
            } else { 
                answer++;
                if (current[1] == location) { //찾는게 같으면 끗
                    break;
                }
            }
        }
        
        return answer;
    }
}