class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;
        int element = nums[n/2];
        for(int i = (n/2)-1 , j= (n/2)+1 ; i>=0 ; i--,j++){
            if(nums[i] ==element || nums[j] == element){
                return false;
            }
        }
        return true;
    }
}