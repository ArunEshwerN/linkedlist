class Solution {
    public boolean isValid(String s) {

        Stack <Character> st = new Stack <>();

        for (int i = 0; i< s.length(); i++){
            //Start
            if (s.charAt(i) == '('){
                st.push(')');
            }
            else if (s.charAt(i) == '{'){
                st.push('}');
            }
            else if (s.charAt(i) == '['){
                st.push(']');
            }

            else if (st.isEmpty() || st.pop() != s.charAt(i)){
                return false;
            }

            
            
        }

        if (st.isEmpty()){
            return true;
        }

        return false;

    }
}