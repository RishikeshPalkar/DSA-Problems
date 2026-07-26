class Solution {
    public int trap(int[] height) {
        int l_wall = 0;
        int r_wall = 0;
        int n = height.length;
        int left_max[] = new int [n];
        int right_max[] = new int[n];

        for(int i = 0 , j=n-1 ; i<n; i++,j--){
            left_max[i] = l_wall;
            l_wall = Math.max(l_wall , height[i]);

            right_max[j] = r_wall;
            r_wall = Math.max(r_wall , height[j]);
        }
        int count = 0;
        for(int i = 0 ; i<n; i++){
            int potential = Math.min(left_max[i] , right_max[i]);
           count += Math.max(0, potential - height[i]);
        }
        return count;
    }
}