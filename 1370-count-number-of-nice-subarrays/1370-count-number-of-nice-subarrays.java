class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        if (k< 0) {
            return 0;
        }

        int res = count(nums, k) - count(nums, k - 1);
        return res;
    }

    public static int count(int[] nums, int k) {
    int l = 0;
    int r = 0;
    int count = 0;
    int sum = 0;

    while (r < nums.length) {
        sum += (nums[r]%2);

        while (sum > k && l <= r) {
            sum -= (nums[l]%2);
            l++;
        }

        count += (r - l + 1);
        r++;
    }

    return count;
    }
}