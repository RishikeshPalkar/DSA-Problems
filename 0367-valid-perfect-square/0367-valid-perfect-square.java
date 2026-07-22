class Solution {
    public boolean isPerfectSquare(int num) {
      long low = 1; 
      long high = num;
      while(low<=high){
        long mid = low + (high -low)/2;
        long prod = mid* mid;
        if( prod == num)return true;
        else if(prod>num)high = mid-1;
        else low = mid+1;
      }
        return false;
    }
}