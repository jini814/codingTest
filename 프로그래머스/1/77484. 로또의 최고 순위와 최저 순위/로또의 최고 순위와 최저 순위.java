class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int winCnt = 0;
        int zeroCnt = 0;
        
        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCnt++;
            } else {
                for (int win_num : win_nums) {
                    if (lotto == win_num) {
                        winCnt++;
                        break;
                    }
                }
            }
        }
        
        answer[0] = (winCnt + zeroCnt) > 1 ? 7 - (winCnt + zeroCnt) : 6;
        answer[1] = winCnt > 1 ? 7 - winCnt : 6;
        
        return answer;
    }
}
