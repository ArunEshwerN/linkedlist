class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int maxlen = 0;
        int zeroes = 0;

        while (r<nums.length){
            if (nums[r] == 0){
                zeroes++;
            }
            // while (zeroes>k){
            //     if (nums[l] == 0){
            //         zeroes--;
            //     }
            //     l++;
            // }
            if (zeroes > k){
                
                if (nums[l] == 0){
                    zeroes--;
                }
                r++;
                l++;
            }
            else{
            maxlen = Math.max(maxlen, (r - l + 1));
            r++;
            }
        }

        return maxlen;
    }
}