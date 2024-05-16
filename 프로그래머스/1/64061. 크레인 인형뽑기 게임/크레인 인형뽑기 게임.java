import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> dolls = new Stack<>();
        
        for (int move : moves) {
            int idx = 0;
            
            while (idx < board.length && board[idx][move - 1] == 0) {
                idx++;
            }

            if (idx < board.length) {
                int doll = board[idx][move - 1];
                board[idx][move - 1] = 0;

                if (!dolls.isEmpty() && dolls.peek() == doll) {
                    dolls.pop();
                    answer += 2;
                } else {
                    dolls.push(doll);
                }
            }
        }
        
        return answer;
    }
}
