class Solution {
    public int[] solution(int n) {
        int[][] ary = new int[n][n]; 
        int totalElements = n * (n + 1) / 2; 
        int num = 1; 
        int x = -1, y = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i % 3 == 0) {
                    x++; 
                } else if (i % 3 == 1) {
                    y++; 
                } else if (i % 3 == 2) {
                    x--; y--; 
                }
                ary[x][y] = num++; 
            }
        }
        
        int[] answer = new int[totalElements];
        int idx = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                answer[idx++] = ary[i][j];
            }
        }
        
        return answer;
    }
}