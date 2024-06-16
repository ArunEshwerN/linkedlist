class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> li = new ArrayList<>();
        List<Integer> li2 = new ArrayList<>();
        int sum = 0;
        rec(0, candidates, target, li, li2, sum);

        return li;
    }

    public static void rec(int n, int[] candidates, int target, List<List<Integer>> li, List<Integer> li2, int sum){

        if (n >= candidates.length){
            return;
        }

        if (sum == target){
                List<Integer> li3 = new ArrayList<>(li2);
                li.add(li3);
                return;
            }

        if (sum>target){
            return;
        }

        li2.add(candidates[n]);
        sum += candidates[n];
        rec(n, candidates, target, li, li2, sum);

        li2.remove(li2.size()-1);
        sum -= candidates[n];
        rec(n+1, candidates, target, li, li2, sum);


    }
}