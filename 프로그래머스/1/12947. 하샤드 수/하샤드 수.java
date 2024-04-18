import java.util.*;

class Solution {
    public boolean solution(int x) {
        int num = 0;
        
        String str = Integer.toString(x);
        for(char ch : str.toCharArray()){
            num += ch - '0';
        }
        return x % num == 0 ? true : false;
    }
}