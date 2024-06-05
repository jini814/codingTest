class Solution {
    public String solution(String s) {
        String[] strNum = s.split(" ");
        
        int[] numbers = new int[strNum.length];
        for(int i = 0; i < strNum.length; i++) {
            numbers[i] = Integer.parseInt(strNum[i]);
        }
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
    
        return min + " " + max;
    }
}