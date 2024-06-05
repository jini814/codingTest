import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        Map<String, Integer> friendIdx = new HashMap<>();
        for (int i = 0; i < n; i++) {
            friendIdx.put(friends[i], i); //친구에게 인덱스를 부여
        }

        int[][] giftLog = new int[n][n];
        int[] giftPoint = new int[n];
        for (String gift : gifts) {
            String[] g = gift.split(" ");
            int giver = friendIdx.get(g[0]);
            int taker = friendIdx.get(g[1]);

            giftLog[giver][taker]++; //선물을 주고 받은 기록을 저장
            giftPoint[giver]++; //선물 지수를 계산
            giftPoint[taker]--;
        }

        int[] nextMonth = new int[n];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (giftLog[i][j] > giftLog[j][i]) { //i와 j의 선물을 주고 받은 개수를 확인
                    nextMonth[i]++;
                } else if (giftLog[i][j] < giftLog[j][i]) {
                    nextMonth[j]++;
                } else { //선물을 주고 받은 개수가 같으면 선물 지수를 확인
                    if (giftPoint[i] > giftPoint[j]) {
                        nextMonth[i]++;
                    } else if (giftPoint[i] < giftPoint[j]) {
                        nextMonth[j]++;
                    }
                }
            }
        }
        Arrays.sort(nextMonth);
        return nextMonth[n - 1];
    }
}