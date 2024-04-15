class Solution {
    public int solution(int a, int d, boolean[] included) {
        int[] list = new int[included.length];
        int answer = 0;
        
        for ( int i = 0; i < included.length; i++) {
            list[i] = a + d * i ;
            
            if (included[i] == true) {
                answer = answer + list[i];
            }
        }
        
        
        return answer;
    }
}