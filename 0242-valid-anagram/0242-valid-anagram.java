class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i<s.length();i++){

            if (map.containsKey(s.charAt(i))){
                int freq = map.get(s.charAt(i));
                map.put(s.charAt(i),freq+1);
            }

            else{
                map.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i<t.length();i++){

            if (map2.containsKey(t.charAt(i))){
                int freq = map2.get(t.charAt(i));
                map2.put(t.charAt(i),freq+1);
            }

            else{
                map2.put(t.charAt(i), 1);
            }
        }

        for (int i = 0; i<t.length(); i++){
            if(map.containsKey(t.charAt(i)) && map2.containsKey(t.charAt(i))){
                if (!map.get(t.charAt(i)).equals(map2.get(t.charAt(i)))){
                    return false;
                }
            }
            else{
                return false;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (!map2.containsKey(s.charAt(i))) {
                return false;
            }
        }

        return true;

    }
}