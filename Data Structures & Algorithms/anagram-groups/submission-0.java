class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    
        Map<Map<Character, Integer>, List<String>> matches = new HashMap();
        for(String s : strs){
            Map<Character, Integer> cnt = count(s);
            if (matches.containsKey(cnt)){
                List<String> val = matches.get(cnt);
                val.add(s);
                matches.put(cnt, val);
            }else{
                List<String> l = new ArrayList();
                l.add(s);
                matches.put(cnt, l);
            }
        }
        return matches.values().stream().collect(Collectors.toList());
    }
    private Map<Character, Integer> count(String s){
        Map<Character, Integer> res = new HashMap();
        for(char c : s.toCharArray()){
            if(res.containsKey(c)){
                int cnt = res.get(c);
                res.put(c, Integer.valueOf(cnt + 1));
            }else{
                res.put(c, Integer.valueOf(1));
            }
        }
        return res;
    }
}
