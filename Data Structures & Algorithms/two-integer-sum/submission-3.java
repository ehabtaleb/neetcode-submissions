class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> comp = new HashMap();
        for (int i = 0; i < nums.length; i++){
            int c = target - nums[i];
            if(comp.containsKey(Integer.valueOf(c))){
                return new int[]{comp.get(Integer.valueOf(c)), i};
            }
            comp.put(Integer.valueOf(nums[i]), Integer.valueOf(i));
        }
        return new int[]{};
    }
}
