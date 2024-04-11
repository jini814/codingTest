class Solution {
    public int solution(int[][] dots) {
        int a = Math.abs(dots[1][0] - dots[0][0]);
        int b = Math.abs(dots[2][0] - dots[0][0]);
        int width = Math.max(a, b);
        
        int c = Math.abs(dots[0][1] - dots[3][1]);
        int d = Math.abs(dots[0][1] - dots[1][1]);
        int height = Math.max(c, d);
        
        return width * height;
    }
}
