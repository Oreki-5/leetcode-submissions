class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] output = new int[nums1.length];

        int p1 = 0, p2 = 0, op = 0;

        while (p1 < m && p2 < n && op < (m + n)) {
            if (nums1[p1] < nums2[p2]) {
                output[op++] = nums1[p1++];
            } else {
                output[op++] = nums2[p2++];
            }

        }
        while (p1 < m && op < (m + n)) {
            output[op++] = nums1[p1++];
        }
        while (p2 < n && op < (m + n)) {
            output[op++] = nums2[p2++];
        }

        for (int i = 0; i < output.length; i++) {
            nums1[i] = output[i];
        }

    }
}