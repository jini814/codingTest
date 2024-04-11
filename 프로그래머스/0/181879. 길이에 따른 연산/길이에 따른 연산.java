class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 1;
        
        for ( int i = 0; i < num_list.length; i++) {
            if (num_list.length >= 11) {
                answer += num_list[i];
            } else {
                sum = sum * num_list[i];
            }
        }
        return num_list.length >= 11 ? answer : sum;
    }
}