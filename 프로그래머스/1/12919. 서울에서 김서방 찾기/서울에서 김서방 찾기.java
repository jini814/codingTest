class Solution {
    public String solution(String[] seoul) {
        String answer = "김서방은";
        String answer2 = "에 있다";
        int index = 0;
        
        for ( int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                index = i;
            }
        }
        return answer + " " + index + answer2;
    }
}