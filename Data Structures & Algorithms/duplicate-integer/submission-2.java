class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> sumMap = new HashSet();
        for (int n : nums){
            if (sumMap.contains(Integer.valueOf(n))){
                return true;
            }
            sumMap.add(Integer.valueOf(n));

        }
        return false;
    }
}