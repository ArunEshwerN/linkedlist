class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> li2 = new ArrayList<>();

        int length = nums.length;
        double power = Math.pow(2, length);

        for (int i = 0; i<power; i++){
            List<Integer> li = new ArrayList<>();
            for (int j = 0; j<length; j++){
                if ((i&(1<<j))!=0){
                    li.add(nums[j]);
                }
            }
            li2.add(li);

        }

        return li2;



    }
}