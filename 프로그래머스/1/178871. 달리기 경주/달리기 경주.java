import java.util.*;


class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;
        Map<String, Integer> resultMap = new HashMap<String, Integer>();

        for (int i = 0; i < players.length; i++)
            resultMap.put(players[i], i);

        for (String calling : callings) {
            int count = resultMap.get(calling);
            //swap 하기
            String previous = answer[count - 1];
            answer[count - 1] = calling;
            answer[count] = previous;
            //다시 결과 넣어주기
            resultMap.put(calling, count - 1);
            resultMap.put(previous, count);
        }
        return answer;
    }
}


