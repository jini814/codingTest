class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            long num = numbers[i];
            
            if (num % 2 == 0) {
                answer[i] = num + 1;
            } else {
                long lowestZeroBit = (num + 1) & ~num; 
                answer[i] = num + lowestZeroBit / 2;
            }
        }
        
        return answer;
    }
}