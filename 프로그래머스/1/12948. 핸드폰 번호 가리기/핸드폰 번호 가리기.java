class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length();
        
        String str = phone_number.substring(len-4, len);
        String star = "*";
        return star.repeat(len -4) + str;
    }
}