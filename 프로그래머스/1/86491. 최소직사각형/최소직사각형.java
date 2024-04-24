import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;
        
        // 가로와 세로의 최대값을 찾기
        for (int[] size : sizes) {
            maxW = Math.max(maxW, Math.max(size[0], size[1]));
            maxH = Math.max(maxH, Math.min(size[0], size[1]));
        }
        
        int answer = maxW * maxH;
        
        return answer;
    }
}
