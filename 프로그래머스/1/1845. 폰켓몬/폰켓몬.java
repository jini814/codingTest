import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = nums.length / 2;
        int species = set.size();
        return Math.min(species, max);
    }
}
