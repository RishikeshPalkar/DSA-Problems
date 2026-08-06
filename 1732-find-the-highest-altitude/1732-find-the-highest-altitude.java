class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = Integer.MIN_VALUE;
        int sum = 0;
        for(int num : gain){
            sum+=num;
           altitude =  Math.max(altitude , sum);
        }
        return (altitude <0) ? 0 : altitude;
    }
}