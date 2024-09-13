class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        int num = 0;

        while (numbers.length() < t * m) {
            numbers.append(Integer.toString(num, n).toUpperCase());
            num++;
        }

        for (int i = p - 1; i < t * m; i += m) {
            answer.append(numbers.charAt(i));
        }

        return answer.toString();
    }
}