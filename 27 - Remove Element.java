import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {

        if (nums.length == 0)
            return 0;

        if (nums.length == 1) {
            if (nums[0] == val)
                return 0;
            else
                return 1;
        }

        Arrays.sort(nums);
        int j = 0;
        while (j < nums.length) {
            if (nums[j] == val) {
                break;
            }
            j++;
        }
        int k = j;
        // while(k<nums.length){
        // if
        // }
        for (int i = j; i < nums.length; i++) {
            if (nums[i] != val)
                nums[k++] = nums[i];
        }
        return k;
    }
}