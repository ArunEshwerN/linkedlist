class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> li2 = new ArrayList<>();

        List<Integer> li3 = new ArrayList<>();

        // int length = nums.length;
        // double power = Math.pow(2, length);

        // for (int i = 0; i<power; i++){
        //     List<Integer> li = new ArrayList<>();
        //     for (int j = 0; j<length; j++){
        //         if ((i&(1<<j))!=0){
        //             li.add(nums[j]);
        //         }
        //     }
        //     li2.add(li);

        // }

        // return li2;

        rec(0, nums, li2, li3);

        return li2;

    }

    public static void rec(int n, int[] nums, List<List<Integer>> li2, List<Integer> li3){

        if (n>=nums.length){
            List<Integer> li4 = new ArrayList<>(li3);
            li2.add(li4);
            return;
        }

        li3.add(nums[n]);

        rec(n+1, nums, li2, li3);

        li3.remove((li3.size()-1));

        rec(n+1, nums, li2, li3);



    }
}