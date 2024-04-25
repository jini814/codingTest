class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        
        for(int i = 0; i <= t.length() - len; i++) {
            String str = t.substring(i, i+len);
            //p의 범위가 18까지라서
            if(Long.parseLong(str) <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }
}