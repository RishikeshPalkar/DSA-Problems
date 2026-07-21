class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
          int mid = low + (high - low) / 2;
          int key = nums[mid];
          if(target == key){
            return mid;
          }
          else if(key > target){
             high = mid - 1;
          }
          else {
           low = mid + 1;
          }
          }
           return low;
        }
       
    }
