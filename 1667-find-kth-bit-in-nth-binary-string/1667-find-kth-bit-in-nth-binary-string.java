import java.util.ArrayList;
import java.util.List;

class Solution {
    public char findKthBit(int n, int k) {
        List<String> li1 = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                li1.add("0");
                continue;
            }

            String s1 = li1.get(i - 1) + "1" + reverse(invert(li1.get(i - 1)));
            li1.add(s1);
        }

        String s4 = li1.get(n - 1);
        return s4.charAt(k - 1);
    }

    public static String invert(String s2) {
        char[] chars = s2.toCharArray();
        int length = chars.length;

        for (int i = 0; i < length; i++) {
            if (chars[i] == '0') {
                chars[i] = '1';
            } else {
                chars[i] = '0';
            }
        }

        return new String(chars);
    }

    public static String reverse(String s3) {
        char[] chars = s3.toCharArray();
        int length2 = chars.length;
        int lp = 0;
        int rp = length2 - 1;

        while (lp < rp) {
            char temp = chars[lp];
            chars[lp] = chars[rp];
            chars[rp] = temp;
            lp++;
            rp--;
        }

        return new String(chars);
    }
}
