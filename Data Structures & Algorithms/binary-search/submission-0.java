class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length < 1 )
            return -1;

        int l = 0;
        int r = nums.length - 1;
        int mid = 0;

        while (l <= r){
            mid = l + (r -l) / 2;
            //System.out.println("l="+l+" mid="+mid+" r="+r);
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[mid]  > target){
                r = mid - 1;
                continue;
            }
            if(nums[mid] < target){
                l = mid + 1;
                continue;
            }
        }
        return -1;
    }
}
