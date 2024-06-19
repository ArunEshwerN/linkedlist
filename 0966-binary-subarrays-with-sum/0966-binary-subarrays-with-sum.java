class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        if (goal < 0) {
            return 0;
        }

        int res = count(nums, goal) - count(nums, goal - 1);
        return res;
    }

    public static int count(int[] nums, int goal) {
    int l = 0;
    int r = 0;
    int count = 0;
    int sum = 0;

    while (r < nums.length) {
        sum += nums[r];

        while (sum > goal && l <= r) {
            sum -= nums[l];
            l++;
        }

        count += (r - l + 1);
        r++;
    }

    return count;
}
}