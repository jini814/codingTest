import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> map = new HashMap<>(); //유저가 신고한 유저 목록
        Map<String, Integer> idxMap = new HashMap<>(); //횟수 저장
        
        //목록 돌면서 횟수 넣기
        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            map.put(name, new HashSet<>());
            idxMap.put(name, i);
        }
        
        //신고 내역 보면서 추가하기
        for (String s : report) {
            String[] str = s.split(" ");
            map.get(str[1]).add(str[0]);
        }
        
        //각 유저별로 신고 횟수를 계산하여 배열에 저장
        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> send = map.get(id_list[i]); // 해당 유저가 신고한 유저 목록
            if (send.size() >= k) { // 정지 기준 신고 횟수를 넘는 경우
                for (String name : send) {
                    answer[idxMap.get(name)]++; // 해당 유저에 대한 신고 횟수 증가
                }
            }
        }
        return answer;
    }
}
