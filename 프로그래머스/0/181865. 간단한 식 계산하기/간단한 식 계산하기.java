class Solution {
    public int solution(String binomial) {
        String[] bin = binomial.split(" ");
        int answer = 0;
        
        int a = Integer.parseInt(bin[0]);
        char op = bin[1].charAt(0);
        int b = Integer.parseInt(bin[2]);
        
        if (op == '+') {
            answer = a + b;
        } else if (op == '-') {
            answer = a - b;
        } else if (op == '*') {
            answer = a * b;
        }
        
        return answer;
    }
}
