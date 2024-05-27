class Solution {
    public int[] solution(String[] wallpaper) {
       int[] answer = new int[]{
            Integer.MAX_VALUE, // 위 x
            Integer.MAX_VALUE, // 위 y
            Integer.MIN_VALUE, // 아래 x
            Integer.MIN_VALUE  // 아래 y
        };
        
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    answer[0] = Math.min(i, answer[0]);     
                    answer[1] = Math.min(j, answer[1]);       
                    answer[2] = Math.max(i + 1, answer[2]);   
                    answer[3] = Math.max(j + 1, answer[3]);   
                }
            }
        }

        
        return answer;
    }
}