class Solution {
    public int solution(String word) {
        int answer = 0;
        int num = 781;

        char chr[] = {'A', 'E', 'I', 'O', 'U'};

        for(int i = 0; i < word.length(); i++){
            for(int j = 0; j < 5; j++){
                if(chr[j] == word.charAt(i)){
                    answer += 1 + j * num;
                }
            }
            num = (num - 1) / 5;
        }

        return answer;
    }
}