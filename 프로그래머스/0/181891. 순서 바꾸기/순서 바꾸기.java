class Solution {
    public int[] solution(int[] num_list, int n) {     
        int[] last = new int[num_list.length - n];
        int[] first = new int[n];
        
        for (int i = 0; i < num_list.length; i++) {
            if (i < n) {
                first[i] = num_list[i];
            } else {
                last[i - n] = num_list[i];
            }
        }
        
        int[] answer = new int[num_list.length];
        
        for (int i = 0; i < last.length; i++) {
            answer[i] = last[i];
        }

        for (int i = 0; i < first.length; i++) {
            answer[i + last.length] = first[i];
        }
        
        return answer;
    }
}
