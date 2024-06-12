class Solution {
    public int findPeakElement(int[] nums) {
        return rec(nums, 0, nums.length - 1);
    }

    public static int rec(int[] nums, int low, int high){
        
       int mid = (low + high) / 2;

        if (low > high){
            return mid;
        }

        // >= case is mentioned
        else if (mid != 0 && mid != (nums.length-1) && nums[mid] >= nums[mid-1] && nums[mid] >= nums[mid+1]){
            return mid;
        }

        else if (mid != 0 && nums[mid-1] >= nums[mid]){
            return rec(nums, low, mid - 1);
        }

        //<= is not fully handled
        return rec(nums, mid+1, high);

    }
}