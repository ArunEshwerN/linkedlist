class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        List<Integer> li2 = new ArrayList<>();
        Arrays.sort(nums);
        rec(0, nums, li, li2);

        return li;
    }

    public static void rec(int ind, int[] nums, List<List<Integer>> li, List<Integer> li2){
        
        li.add(new ArrayList<>(li2));

        for (int i = ind; i<nums.length; i++){
            
            if (i > ind && nums[i] == nums[i-1] ){
                continue;
            }

            li2.add(nums[i]);
            rec(i+1, nums, li, li2);
            li2.remove(li2.size()-1);


        }
    }
}