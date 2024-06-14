class Solution {
    public boolean isPalindrome(String s) {
        int length = s.length();
        char[] arr = new char[length];
        int index = 0;

        for (int i = 0; i < length; i++) {

            if (index >= length) {
                break;
            }

            else if ((s.charAt(index) >= 'A' && s.charAt(index) <= 'Z')) {
                arr[i] = (char)(s.charAt(index) + 32);
                index++;
            }

            else if ((s.charAt(index) >= 'a' && s.charAt(index) <= 'z')) {
                arr[i] = s.charAt(index);
                index++;
            }

            else if ((s.charAt(index) >= '0' && s.charAt(index) <= '9')) {
                // Digits are valid as they are
                arr[i] = s.charAt(index);
                index++;
            }

            else {
                index++;
                i--;
            }

        }

        int lp = 0;
        int rp = arr.length - 1;

        while (lp < rp && arr[rp] == 0) {
            rp--;
        }

        while (lp < rp) {
            if (arr[lp] != arr[rp]) {
                return false;
            }
            lp++;
            rp--;
        }

        return true;
    }

}