class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        // 초기 손 위치
        int leftHand = 10;
        int rightHand = 12;
        
        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) { // 왼손 사용 후, 손 위치 변경
                answer.append("L");
                leftHand = num;
            } else if (num == 3 || num == 6 || num == 9) { // 오른손 사용 후, 손 위치 변경             
                answer.append("R");
                rightHand = num;
            } else { // 가운데 2, 5, 8일 경우
                if(num == 0 ) num = 11;
                int leftDiff = (Math.abs(num - leftHand) / 3) + (Math.abs(num - leftHand) % 3);
                int rightDiff = (Math.abs(num - rightHand) / 3) + (Math.abs(num - rightHand) % 3);
                if (leftDiff == rightDiff) {
                    if (hand.equals("right")) {
                        rightHand = num;
                        answer.append("R");
                    } else {
                        leftHand = num;
                        answer.append("L");
                    }
                } else if (leftDiff > rightDiff) {
                    rightHand = num;
                    answer.append("R");
                } else {
                    leftHand = num;
                    answer.append("L");
                }
            }
        }
        return answer.toString();
    }
}
