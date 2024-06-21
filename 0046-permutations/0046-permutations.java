class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> li = new ArrayList<>();

        List<Integer> li2 = new ArrayList<>();

        rec(li, li2, nums);

        return li;

    }

    public static void rec(List<List<Integer>> li, List<Integer> li2, int[] nums){

        if (li2.size() == nums.length){
            li.add(new ArrayList<>(li2));
            return;
        }
        
        for (int i = 0; i< nums.length; i++){
            
            if (li2.contains(nums[i])){
                continue;
            }
            
            li2.add(nums[i]);

            rec(li, li2, nums);

            li2.remove(li2.size()-1);


        }
    }
}