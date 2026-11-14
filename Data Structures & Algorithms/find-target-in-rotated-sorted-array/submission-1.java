class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int df;

        while (l < r) {

            int m = l + (r - l) / 2;

            if (nums[m] > nums[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        df=l;
        if (target >= nums[df] && target <= nums[nums.length - 1]) {
            l = df;
            r = nums.length - 1;
        } else {
            l = 0;
            r = df - 1;
            }
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (nums[m] == target) {
                return m;
    } else if (nums[m] < target) {
        l = m + 1;
    } else {
        r = m - 1;
    }
}
return -1;
    }
}
