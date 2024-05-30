class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int height = park.length;
        int width = park[0].length();
        
        // 시작지점 'S' 찾기
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (park[i].charAt(j) == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }
        
        // 명령 따르기
        for (String route : routes) {
            String[] routeSplit = route.split(" ");
            char direction = routeSplit[0].charAt(0);
            int distance = Integer.parseInt(routeSplit[1]);
            
            int row = answer[0];
            int col = answer[1];
            boolean canMove = true;
            
            for (int step = 1; step <= distance; step++) {
                switch (direction) {
                    case 'N':
                        row = answer[0] - step;
                        break;
                    case 'S':
                        row = answer[0] + step;
                        break;
                    case 'W':
                        col = answer[1] - step;
                        break;
                    case 'E':
                        col = answer[1] + step;
                        break;
                }

                if (row < 0 || row >= height || col < 0 || col >= width || park[row].charAt(col) == 'X') {
                    canMove = false;
                    break;
                }
            }

            if (canMove) {
                switch (direction) {
                    case 'N':
                        answer[0] -= distance;
                        break;
                    case 'S':
                        answer[0] += distance;
                        break;
                    case 'W':
                        answer[1] -= distance;
                        break;
                    case 'E':
                        answer[1] += distance;
                        break;
                }
            }
        }
        
        return answer;
    }
}
