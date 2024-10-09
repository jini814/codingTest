import java.util.*;

class Solution {
    public int solution(int[] order) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;  
        int boxNumber = 1;  
        int loadedBoxes = 0;  
        
        while (boxNumber <= order.length) {
            if (boxNumber == order[index]) {
                loadedBoxes++;
                index++;
                boxNumber++;
            } else if (!stack.isEmpty() && stack.peek() == order[index]) {
                stack.pop();
                loadedBoxes++;
                index++;
            } else {
                stack.push(boxNumber);
                boxNumber++;
            }
        }
        
        while (!stack.isEmpty()) {
            if (stack.peek() == order[index]) {
                stack.pop();
                loadedBoxes++;
                index++;
            } else {
                break; 
            }
        }

        return loadedBoxes;
    }
}