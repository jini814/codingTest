class Solution {
    public int solution(int n) {
        StringBuilder num = new StringBuilder();
        
        while (n > 0) {
            num.append(n % 3);
            n /= 3;
        }
        
        int answer = Integer.parseInt(num.toString(), 3);
        return answer;
    }
}
