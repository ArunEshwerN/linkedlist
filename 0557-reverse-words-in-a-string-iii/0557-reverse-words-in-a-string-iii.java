class Solution {
    public String reverseWords(String s) {
        
        if (s.length() == 0){
            return s;
        }

        char[] str = s.toCharArray();

        int i = 0;
        int j = 0;

        while(j <= str.length){

            if(j == str.length || str[j] == ' '){
                
                reverse(str, i, j-1);

                i = j + 1;
            }

            j++;
        }

        return new String(str);


    }

    public void reverse(char[] str, int i, int j){
        while(i<j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }
}