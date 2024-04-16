class Solution {
    public int solution(int n, String control) {
        int length = control.length();
        
        for (int i = 0; i < length; i++) {
            char c = control.charAt(i);
            
            if (c == 'w') {
                n += 1;
            } else if (c == 'a') {
                n -= 10;
            } else if (c == 's') {
                n -= 1;
            } else if (c == 'd') {
                n += 10;
            } else {
                n += 0;
            }
        }
        return n;
    }
}
