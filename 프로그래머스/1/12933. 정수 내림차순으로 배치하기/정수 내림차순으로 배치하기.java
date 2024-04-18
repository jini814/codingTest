import java.util.*;

class Solution {
    public long solution(long n) {
        char[] chars = Long.toString(n).toCharArray();
        
        Arrays.sort(chars);
        
        StringBuilder str = new StringBuilder(new String(chars));
        str.reverse();
        long answer = Long.parseLong(str.toString());
        return answer;
    }
}
