class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] == target)
                return 0;
            else
                return target > nums[0]  ? 1 : 0;
        }
        int start = 0;
        int end = nums.length;
        int mid = end / 2;

        while (start != mid) {
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid;
                mid = (start + end) / 2;
            } else {
                end = mid;
                mid = (start + end) / 2;
            }
        }
        return target > nums[mid] ? mid + 1 : (mid < 0 ? 0 : mid);

    }
}