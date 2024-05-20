class Solution {
    public String solution(String new_id) {
        String filter = new_id
            .toLowerCase()
            .replaceAll("[^a-z0-9-_.]", "")
            .replaceAll("[.]{2,}", ".")
            .replaceAll("^[.]|[.]$", "");
        
        String new_filter = filter.isEmpty() ? "a" : filter;

        if (new_filter.length() >= 16) {
            new_filter = new_filter.substring(0, 15);
            new_filter = new_filter.replaceAll("[.]$", "");
        }
        StringBuilder answer = new StringBuilder(new_filter);
        while (answer.length() < 3) {
            answer.append(answer.charAt(answer.length() - 1));
        }
        return answer.toString();
    }
}
