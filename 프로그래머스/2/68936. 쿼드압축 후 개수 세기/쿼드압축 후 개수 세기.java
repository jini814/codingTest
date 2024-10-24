class Solution {
    public int[] solution(int[][] arr) {
        int[] answer = new int[2]; 
        compress(arr, 0, 0, arr.length, answer);
        return answer;
    }
    
    private void compress(int[][] arr, int row, int col, int size, int[] answer) {
        if (check(arr, row, col, size)) {
            answer[arr[row][col]]++;
            return;
        }
        
        int newSize = size / 2;
        compress(arr, row, col, size / 2, answer);                // 왼쪽 위
        compress(arr, row, col + size / 2, size / 2, answer);      // 오른쪽 위
        compress(arr, row + size / 2, col, size / 2, answer);      // 왼쪽 아래
        compress(arr, row + size / 2, col + size / 2, size / 2, answer);  // 오른쪽 아래
    }
    
    private boolean check(int[][] arr, int row, int col, int size) {
        int value = arr[row][col];
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (arr[i][j] != value) {
                    return false;
                }
            }
        }
        return true;
    }
}