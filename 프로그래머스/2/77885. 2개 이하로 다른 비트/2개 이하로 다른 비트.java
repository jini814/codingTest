class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            long num = numbers[i];
            
            if (num % 2 == 0) { //짝수
                answer[i] = num + 1;
            } else { //홀수
                long lowestZeroBit = (num + 1) & ~num; 
                answer[i] = num + lowestZeroBit / 2;
            }
        }
        
        return answer;
    }
}