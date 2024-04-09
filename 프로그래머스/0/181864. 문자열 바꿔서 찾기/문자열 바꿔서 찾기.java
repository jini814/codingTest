class Solution {
    public int solution(String myString, String pat) {
        
        String answer = myString.replaceAll("A", "b").replaceAll("B", "a");
        
        return answer.contains(pat.toLowerCase()) ? 1 : 0;
    }
}