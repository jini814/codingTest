class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int start = 0, end = 0, sum = sequence[0];
        int minLength = Integer.MAX_VALUE;

        while (start < sequence.length && end < sequence.length) {
            if (sum == k) {
                if (end - start < minLength) {
                    minLength = end - start;
                    answer[0] = start;
                    answer[1] = end;
                }
                sum -= sequence[start++];
            } else if (sum < k) {
                if (++end < sequence.length) sum += sequence[end];
            } else {
                sum -= sequence[start++];
            }
        }

        return answer;
    }
}