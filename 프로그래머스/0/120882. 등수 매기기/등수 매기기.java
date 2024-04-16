class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] list = new double[score.length];
        
        for ( int i = 0; i < score.length; i++) {
            list[i] = (double)(score[i][0] + score[i][1]) / 2;
        }
        
        for ( int i = 0; i < list.length; i++) {
            int rank = 1;
            for ( int j = 0; j <list.length; j++) {
                if(list[i] < list[j]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        
        return answer;
    }
}