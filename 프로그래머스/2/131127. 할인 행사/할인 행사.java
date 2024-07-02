import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) { 
        int answer = 0;
        
        List<String> wantList = new ArrayList<>();
        for (int i = 0; i < want.length; i++) {
            for (int count = 0; count < number[i]; count++) {
                wantList.add(want[i]);
            }
        }
        
        for (int i = 0; i < discount.length - 10 + 1; i++) {
            List<String> buyList = new ArrayList<>(wantList);
            
            for (int j = i; j < 10 + i; j++) {
                if (!buyList.contains(discount[j])) {
                    continue;
                }
                if (buyList.contains(discount[j])) {
                    buyList.remove(discount[j]);
                }
            }
            answer += buyList.size() == 0 ? 1 : 0;
        }
        return answer;
    }
}