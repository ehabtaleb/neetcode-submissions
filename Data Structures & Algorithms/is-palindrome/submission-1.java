class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.isEmpty()) return true;
        int i = 0;
        int j = s.length()-1;
        final String lower = s.toLowerCase();
        while (i < j){
            char l = lower.charAt(i);
            if(!Character.isLetterOrDigit(l)){
                i++;
                continue;
            }
            char r = lower.charAt(j);
             if(!Character.isLetterOrDigit(r)){
                j--;
                continue;
            }
            if( l != r ){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
