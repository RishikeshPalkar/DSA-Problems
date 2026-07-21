class Solution {
    public int trap(int[] height) {
        int l_wall =0 ;
        int r_wall = 0 ;
        int n = height.length;
        int max_left[] =new int[n];
        int max_right[] = new int[n];

        for(int i  = 0, j = n-1 ; i<height.length ; i++, j--){
            max_left[i] = l_wall;
            l_wall = Math.max(l_wall , height[i]);

            max_right[j] = r_wall;
            r_wall = Math.max(r_wall, height[j]);
        } 
        int sum = 0;
        for(int i = 0 ; i<n ; i++){
            int pot = Math.min(max_left[i] , max_right[i]);
            sum += Math.max(0 , pot - height[i]);
        }
        return sum ;
    }
}