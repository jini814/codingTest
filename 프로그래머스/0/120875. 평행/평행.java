class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        double slope1 = (double) Math.abs(dots[1][1] - dots[0][1]) / Math.abs(dots[1][0] - dots[0][0]);
        double slope2 = (double) Math.abs(dots[3][1] - dots[2][1]) / Math.abs(dots[3][0] - dots[2][0]);

        if (slope1 == slope2) {
            answer = 1;
        } else if (slope1 == 0 || slope2 == 0) {
            answer = 0;
        }

        return answer;
    }
}