class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int[] hasharr = new int[256];
        for (int i = 0; i<hasharr.length; i++){
            hasharr[i] = -1;
        }

        int l = 0;
        int r = 0;
        int maxlen = 0;
        

        while (r<s.length()){
            
            if (hasharr[s.charAt(r)] != -1){

                if (l <= hasharr[s.charAt(r)]){
                
                l = hasharr[s.charAt(r)] + 1;
                }
            }
            maxlen = Math.max(maxlen, (r - l + 1));
            hasharr[s.charAt(r)] = r;
            r++;
            
        }

        return maxlen;
    }
}