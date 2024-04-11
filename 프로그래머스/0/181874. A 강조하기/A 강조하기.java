class Solution {
    public String solution(String myString) {
        StringBuilder result = new StringBuilder();
    
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            
            if (c == 'a' || c == 'A') {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(Character.toLowerCase(c));
            }
        }
        
        return result.toString();
    }
}
