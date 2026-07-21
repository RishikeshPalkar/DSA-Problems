class Solution {
    public int maxArea(int[] height) {
        int l = 0; 
        int r = height.length -1;
        int maxArea = 0;
        while(l<r){
            int length = r-l;
            int height1 = Math.min(height[l] , height[r]);
            int area = length * height1;
            maxArea = Math.max(area , maxArea);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
}