class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()){
            return false;
        }

        String s2 = s+s;

        int res = (s2).indexOf(goal);

        if (res < 0){
            return false;
        }

        return true;
    }
}