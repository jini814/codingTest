import java.util.*;

class Solution {
    public long solution(long n) {
        String nString = Long.toString(n);
        
        char[] charArray = nString.toCharArray();
        int[] newArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            newArray[i] = Character.getNumericValue(charArray[i]);
        }
        
        Arrays.sort(newArray);
        
        for(int i = 0; i < newArray.length /2; i++){
            int a = newArray[i];
            newArray[i]  = newArray[newArray.length -1-i];
            newArray[newArray.length -1-i] = a;
        }//내림차순으로 바꾸기
        
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < newArray.length; j++){
            stringBuilder.append(newArray[j]);
        }
        long newN = Long.parseLong(stringBuilder.toString());
        return newN; 
    }
}