import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        
        int[] rooms =  new int[60*24+10];
        
        for(String t[]:book_time){
            int s = stringToInt(t[0]);
            int e = stringToInt(t[1])+10; 
            
            rooms[s] += 1;
            rooms[e] -= 1;
        }
        
        for(int i=1; i<60*24+10; i++){
            rooms[i] += rooms[i-1];
            answer = Math.max(rooms[i], answer);
        }
        
        return answer;
    }
    
    static int stringToInt(String time){
        int hour = Integer.parseInt(time.substring(0, 2));
        int min = Integer.parseInt(time.substring(3, time.length()));
        
        return hour*60+min;
    }
    
    
}