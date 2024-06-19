class Solution {
    public int characterReplacement(String s, int k) {
        
        int l = 0;
        int r = 0;
        int maxlen = 0;
        int maxfreq = 0;
        int changes = 0;
        int[] hash = new int[26];

        while(r<s.length()){
            hash[s.charAt(r)-'A']++;
            maxfreq = Math.max(maxfreq, hash[s.charAt(r)-'A']);

            while ((r-l+1) - maxfreq > k){
                hash[s.charAt(l)-'A']--;
                maxfreq = 0;
                for (int i = 0; i<26; i++){
                maxfreq = Math.max(maxfreq, hash[i]);
                }
                l++;
            }

            maxlen = Math.max(maxlen, (r-l+1));
            r++;
            
        }

        return maxlen;

        

    }
}