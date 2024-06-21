class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> li = new ArrayList<>();
        List<Integer> li2 = new ArrayList<>();
        Arrays.sort(candidates);
        int sum = 0;
        rec(0, candidates, target, li, li2);

        return li;
    }

    public static void rec(int n, int[] candidates, int target, List<List<Integer>> li, List<Integer> li2){

        if (target == 0){
            
            li.add(new ArrayList<>(li2));
            return;

        }

        for (int i = n; i < candidates.length; i++){

            if (i > n && candidates[i] == candidates[i-1]){
                continue;
            }

            if (candidates[i]>target){
                break;
            }

            li2.add(candidates[i]);

            rec(i+1, candidates, target-candidates[i], li, li2);
            li2.remove(li2.size()-1);

        }

    }
}