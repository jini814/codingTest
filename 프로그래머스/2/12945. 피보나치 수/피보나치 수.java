class Solution {
    public int solution(int n) {
        int[] fibo = new int[n + 1];
        
        fibo[0] = 0;
        fibo[1] = 1;
        
        // 피보나치 수 계산
        for (int i = 2; i <= n; i++) {
            fibo[i] = (fibo[i - 1] + fibo[i - 2]) % 1234567;
        }
        return fibo[n];
    }
}
