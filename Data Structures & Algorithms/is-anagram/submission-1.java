class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.equals(t)) return true;
        if(s.length() != t.length()) return false;
        Map<Character, Integer> charCount1 = count(s);
        Map<Character, Integer> charCount2 = count(t);
        return charCount1.equals(charCount2);

    }
    private Map<Character, Integer> count(String s){
        Map<Character, Integer> charCount = new HashMap();
        for(char c : s.toCharArray()){
            if(charCount.containsKey(c)){
                int count = charCount.get(c);
                charCount.put(c, (count + 1));
            }else{
                charCount.put(c, 1);
            }
        }
        return charCount;
    }
}
