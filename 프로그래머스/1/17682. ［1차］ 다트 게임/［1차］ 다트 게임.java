class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] dart = new int[3];

        int idx = 0;
        int num = 0;
        
        for(int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            
            if(c >= '0' && c <= '9') {       
                 num = num * 10 + (c - '0');    
            } else if( c == 'S' || c == 'D' || c == 'T' ) {
               if ( c == 'S' ) {
                   dart[idx++] = (int)Math.pow(num, 1);
                 }
                else if(c == 'D'){
                    dart[idx++] = (int)Math.pow(num, 2);
                }
                else{
                    dart[idx++] = (int)Math.pow(num, 3);
                } 
                num = 0;
            } else {
                if(c == '*'){
                    dart[idx - 1] *= 2;
                    if (idx -2 >= 0) {
                        dart[idx-2] *= 2; 
                    }
                } else {
                    dart[idx -1 ] *= (-1);
                }
            }
        }
        answer = dart[0] + dart[1] + dart[2];
        return answer;
    }
}
