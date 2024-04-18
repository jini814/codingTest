class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int idx = 0;
        
        for(int i = 1; i <= n; i++) {
            answer[idx++] = (long) x * i;
        }
        return answer;
    }
}