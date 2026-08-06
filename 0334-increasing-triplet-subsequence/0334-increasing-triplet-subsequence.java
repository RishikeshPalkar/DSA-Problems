class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums ==null || nums.length <3){
            return false;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MAX_VALUE;
        for (int num : nums){
            if(num <= max )
            {
                max = num;
            }
            else if(num <= min){
                min = num;
            }
            else {
                return true;
            }
        }
        return false;
    }
}