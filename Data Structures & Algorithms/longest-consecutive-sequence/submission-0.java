class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> starter = new HashSet();
        for (int n :  nums){
            starter.add(n);
        }
        int longest = 0;
        for(int n : starter){
            if(!starter.contains(n-1)){//if the one before is a starter then this n is part of that starter
              int len = 1;
              while(starter.contains(n + len)){
                len++;
              }
              longest = Math.max(longest, len);
           }
       }
        return longest;
    }
}
