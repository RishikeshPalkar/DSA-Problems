class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int original = x;
        int num = 0 ;
        while(x>0){
            int n = x%10;
           num = num * 10 + n;
            x= x/10;
        }
        return num==original;
    }
}