class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        StringBuilder allNumbers = new StringBuilder();
        int num = 0;

        while (allNumbers.length() < t * m) {
            allNumbers.append(Integer.toString(num, n).toUpperCase());
            num++;
        }

        for (int i = p - 1; i < t * m; i += m) {
            answer.append(allNumbers.charAt(i));
        }

        return answer.toString();
    }
}