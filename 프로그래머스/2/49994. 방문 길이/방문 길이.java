import java.util.*;

class Solution {
    public int solution(String dirs) {
        int x = 0, y = 0;  
        Set<String> visited = new HashSet<>();  
        
        int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        char[] commands = {'U', 'D', 'R', 'L'};
        
        for (char dir : dirs.toCharArray()) {
            int moveIndex = -1;
            for (int i = 0; i < 4; i++) {
                if (commands[i] == dir) {
                    moveIndex = i;
                    break;
                }
            }
            
            int newX = x + direction[moveIndex][0];
            int newY = y + direction[moveIndex][1];
            
            if (newX < -5 || newX > 5 || newY < -5 || newY > 5) {
                continue;
            }
            
            String path = Math.min(x, newX) + "," + Math.min(y, newY) + "," + Math.max(x, newX) + "," + Math.max(y, newY);
            
            visited.add(path);
            
            x = newX;
            y = newY;
        }
        
        return visited.size();
    }
}