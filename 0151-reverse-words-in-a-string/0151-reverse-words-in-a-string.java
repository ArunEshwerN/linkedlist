class Solution {
    public String reverseWords(String s) {
        
        if (s.length() == 0){
            return s;
        }

        char[] str = s.toCharArray();

        int start = 0;
        int end = str.length - 1;

        while(start<= end && str[start] == ' '){
            start++;
        }

        while(start<= end && str[end] == ' '){
            end--;
        }
        
        reverse(str, start, end);

        int i = start;
        int j = start;
        int mark = start;

        while(j <= end){

            if (str[j] != ' '){
                str[mark] = str[j];
                mark++;
            }

            if(j == end || str[j] == ' '){
                
                reverse(str, i, mark-1);

                if (j == end){
                    break;
                }

                str[mark++] = ' ';
                i = mark;

                while (str[j] == ' '){
                    j++;
                }

                j--;
            }

            j++;
        }

        return new String(str, start, mark - start);


    }

    public static void reverse(char[] str, int i, int j){
        while(i<j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }
}