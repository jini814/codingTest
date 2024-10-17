import java.util.*;

class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] table = new char[m][n];

        for (int i = 0; i < m; i++) {
            table[i] = board[m - i - 1].toCharArray();
        }

        //무한 반복으로 제거할 블록이 없을 때까지
        while (true) {
            boolean flag = true; 
            boolean[][] check = new boolean[m][n]; 

            // 블록 체크
            for (int i = 0; i < m - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    char current = table[i][j];
                    if (current == '-') {
                        continue;
                    }
                    if (table[i][j + 1] == current && table[i + 1][j] == current && table[i + 1][j + 1] == current) {
                        check[i][j] = true;
                        check[i][j + 1] = true;
                        check[i + 1][j] = true;
                        check[i + 1][j + 1] = true;
                        flag = false;
                    }
                }
            }

            if (flag) break;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (check[i][j]) {
                        table[i][j] = '-'; 
                        answer++;
                    }
                }
            }

            //블록 내리기
            for (int j = 0; j < n; j++) { 
                int emptyIndex = -1; 
                for (int i = 0; i < m; i++) {
                    if (table[i][j] == '-' && emptyIndex == -1) {
                        emptyIndex = i;
                    } else if (table[i][j] != '-' && emptyIndex != -1) {
                        table[emptyIndex][j] = table[i][j];
                        table[i][j] = '-';
                        emptyIndex++; 
                    }
                }
            }
        }
        return answer;
    }
}