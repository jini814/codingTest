class Solution {
    public String solution(String new_id) {
        
        String step1 = new_id.toLowerCase();
        String step2 = step1.replaceAll("[^a-z0-9-_.]", "");
        String step3 = step2.replaceAll("[.]{2,}", ".");
        String step4 = step3.replaceAll("^[.]|[.]$", "");
        String step5 = step4.isEmpty() ? "a" : step4;
        if (step5.length() >= 16) {
            step5 = step5.substring(0, 15);
            step5 = step5.replaceAll("[.]$", "");
        }
        StringBuilder step7 = new StringBuilder(step5);
        while (step7.length() < 3) {
            step7.append(step7.charAt(step7.length() - 1));
        }
        return step7.toString();
    }
}
