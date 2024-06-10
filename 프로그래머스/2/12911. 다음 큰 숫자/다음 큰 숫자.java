class Solution {
    public int solution(int n) {
        //n 이진수에서 1 갯수만 세기
        int num = Integer.bitCount(n);
        //n+1부터 시작해서 찾기
        int nextNum = n + 1;
        
        while (true) {
            //n+1 이진수 1 갯수랑 n이랑 같은지 비교
            if (Integer.bitCount(nextNum) == num) {
                return nextNum;
            }
            nextNum++;
        }
    }
}
