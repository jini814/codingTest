class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.toLowerCase().charAt(i) == 'p') {
                countP++;
            } else if (s.toLowerCase().charAt(i) == 'y') {
                countY++;
            }
        }
        
        if (countP != countY) {
            answer = false;
        }

        return answer;
    }
}