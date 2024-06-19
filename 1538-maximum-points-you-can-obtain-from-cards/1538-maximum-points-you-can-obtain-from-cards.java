class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0;
        for (int i = 0; i< k; i++){
            lsum = lsum + cardPoints[i];
        }

        int prevsum = lsum;
        int rsum = 0;

        int rind = cardPoints.length - 1;

        for (int i = k - 1; i>=0; i--){
            lsum = lsum - cardPoints[i];
            rsum = rsum + cardPoints[rind];
            rind--;

            prevsum = Math.max(prevsum, lsum+rsum);
        }

        

         return prevsum;



    }
}