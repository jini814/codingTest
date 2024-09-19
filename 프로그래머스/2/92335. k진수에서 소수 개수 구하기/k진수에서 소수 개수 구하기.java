class Solution {
    public int solution(int n, int k) {
        String converted = Integer.toString(n, k);
        String[] numbers = converted.split("0");
        int count = 0;

        for (String num : numbers) {
            if (!num.isEmpty()) {
                long parsedNum = Long.parseLong(num);
                if (parsedNum > 1) {
                    boolean isPrime = true;
                    for (long i = 2; i * i <= parsedNum; i++) {
                        if (parsedNum % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}