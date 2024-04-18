class Solution {
    public int[] solution(long n) {
        String num = Long.toString(n);
        int[] answer = new int[num.length()];
        
        for (int i = 0; i < num.length(); i++) {
            //유니코드 0 빼기 (ex. 문자 5 : 53 / 문자 0 : 48)
            answer[i] = num.charAt(num.length() - 1 - i) - '0';
        }
        
        return answer;
    }
}
