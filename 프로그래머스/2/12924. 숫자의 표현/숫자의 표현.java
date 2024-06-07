public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            int sum = 0; 
            
            for (int j = i; j <= n; j++) {
                sum += j; //계속 더하다가 
                
                if (sum == n) { //합이 n이랑 같아지면
                    answer++; // 방법 1 획득
                    break;
                } else if (sum > n) { //조합 X 다른 j로 시작하게 break
                    break;
                }
            }
        }
        return answer;
    }
}
