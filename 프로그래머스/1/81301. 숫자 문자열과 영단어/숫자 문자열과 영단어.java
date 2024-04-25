class Solution {
    public int solution(String s) {
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        StringBuilder answer = new StringBuilder();
        
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                answer.append(c);
                i++;
            } else {
                StringBuilder num = new StringBuilder();
                while (i < s.length() && !Character.isDigit(s.charAt(i))) {
                    num.append(s.charAt(i));
                    String word = num.toString();
                    for (int j = 0; j < numbers.length; j++) {
                        if (word.equals(numbers[j])) {
                            answer.append(j);
                            num.setLength(0);
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        return Integer.parseInt(answer.toString());
    }
}
