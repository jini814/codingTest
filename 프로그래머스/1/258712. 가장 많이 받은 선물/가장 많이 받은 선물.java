import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        //친구 이름 및 인덱스
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            map.put(friends[i], i);
        }

        //각 친구가 준 선물 개수에서 받은 선물 개수를 뺀 값
        int[] giftBalance = new int[friends.length];
        //각 친구가 다른 친구에게 선물을 준 횟수
        int[][] giftRecords = new int[friends.length][friends.length];

        // 선물 주고받은 기록을 처리
        for (String gift : gifts) {
            // 선물을 준 사람과 받은 사람을 분리
            String[] parts = gift.split(" ");
            int giver = map.get(parts[0]);  // 선물을 준 사람의 인덱스
            int receiver = map.get(parts[1]);  // 선물을 받은 사람의 인덱스
            
            // 준 사람의 선물 수 증가, 받은 사람의 선물 수 감소
            giftBalance[giver]++;
            giftBalance[receiver]--;
            
            // 준 사람이 받은 사람에게 준 선물 횟수 증가
            giftRecords[giver][receiver]++;
        }

        // 친구들 간의 순위를 계산
        int maxRank = 0;
        for (int i = 0; i < friends.length; i++) {
            int rank = 0;
            for (int j = 0; j < friends.length; j++) {
                if (i == j) continue;
                if (giftRecords[i][j] > giftRecords[j][i]) {
                    rank++;
                } 
                else if (giftRecords[i][j] == giftRecords[j][i] && giftBalance[i] > giftBalance[j]) {
                    rank++;
                }
            }
            maxRank = Math.max(rank, maxRank);
        }
        return maxRank;
    }
}