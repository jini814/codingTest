class Solution {
    public String solution(int n) {
        String str = "수박";
        
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < n / 2; i++) {
            answer.append(str);
        }
        if (n % 2 == 1) {
            answer.append("수");
        }
        
        return answer.toString();
    }
}
