class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> li = new ArrayList<>();
        List<String> li2 = new ArrayList<>();
        rec(0, s, li, li2);
        return li;
    }

    public static void rec(int index, String s, List<List<String>> li, List<String> li2){

        if (index >= s.length()){
            li.add(new ArrayList <>(li2));
            return;
        }

        for (int i = index; i<s.length(); i++){

            if (isPalindrome(s, index, i)){
                li2.add(s.substring(index, i+1)); // i+1 because it wont consider the alst one
                rec(i+1, s, li, li2);
                li2.remove(li2.size()-1);
            }
        }
    }

    public static boolean isPalindrome(String s, int index, int i){
        int lp = index;
        int rp = i;

        while(lp<rp){
            if (s.charAt(lp)!=s.charAt(rp)){
                return false;
            }
            lp++;
            rp--;
        }
        return true;
    }
}