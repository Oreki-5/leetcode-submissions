import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {

        if (k == nums.length) {
            return nums.length;
        }

        if (nums.length == 2) {
            if (k == 1 && nums[0] == nums[1])
                return 1;
            else
                return 2;
        }

        Map<Integer, Integer> map = new HashMap<>();
        int L = 0;
        int R = 1;
        map.put(nums[L], 1);
        int maxLen = 0;

        while (R < nums.length) {
            if (map.getOrDefault(nums[R], 0) < k) {
                map.put(nums[R], map.getOrDefault(nums[R], 0) + 1);
                R++;
                continue;
            }

            maxLen = (R - L) > maxLen ? (R - L) : maxLen;
            map.put(nums[R], map.getOrDefault(nums[R], 0) + 1);
            R++;
            while (map.get(nums[R - 1]) > k) {
                map.put(nums[L], map.get(nums[L]) - 1);
                if ((L + 1) < R) {
                    L++;
                }

            }

        }
        maxLen = (R - L) > maxLen ? (R - L) : maxLen;

        return maxLen;
    }
}