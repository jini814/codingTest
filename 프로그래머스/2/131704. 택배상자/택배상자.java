import java.util.*;

class Solution {
    public int solution(int[] order) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;  // order 배열에서 현재 실어야 하는 상자의 위치
        int boxNumber = 1;  // 현재 컨테이너 벨트에서 처리해야 하는 상자의 번호
        int loadedBoxes = 0;  // 트럭에 실은 상자의 수
        
        while (boxNumber <= order.length) {
            if (boxNumber == order[index]) {
                // 현재 컨테이너 벨트의 상자를 바로 트럭에 실을 수 있는 경우
                loadedBoxes++;
                index++;
                boxNumber++;
            } else if (!stack.isEmpty() && stack.peek() == order[index]) {
                // 보조 컨테이너 벨트에서 실어야 하는 상자가 있는 경우
                stack.pop();
                loadedBoxes++;
                index++;
            } else {
                // 현재 상자를 보조 컨테이너 벨트에 보관
                stack.push(boxNumber);
                boxNumber++;
            }
        }
        
        // 컨테이너 벨트에서 모든 상자를 처리한 후에도, 스택에 남은 상자를 처리
        while (!stack.isEmpty()) {
            if (stack.peek() == order[index]) {
                stack.pop();
                loadedBoxes++;
                index++;
            } else {
                break;  // 더 이상 실을 수 없으면 중단
            }
        }

        return loadedBoxes;
    }
}