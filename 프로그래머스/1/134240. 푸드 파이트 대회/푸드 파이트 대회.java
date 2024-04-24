class Solution {
    public String solution(int[] food) {
        StringBuilder str = new StringBuilder();
        
        for(int i = 0; i < food.length; i++) {
            for (int j = 0; j < food[i]/2; j++) {
                str.append(i);
            }
        }
        StringBuilder reversed = new StringBuilder(str).reverse();
        str.append("0");
        str.append(reversed);
        
        return str.toString();
    }
}
