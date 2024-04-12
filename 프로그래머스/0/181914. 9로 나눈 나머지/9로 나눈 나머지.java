import java.math.BigInteger;

class Solution {
    public int solution(String number) {
        BigInteger num = new BigInteger(number);
        BigInteger remainder = num.mod(BigInteger.valueOf(9));
        return remainder.intValue();
    }
}
