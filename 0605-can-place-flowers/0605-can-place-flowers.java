class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       int len = flowerbed.length-1;
       for(int i = 0 ; i<=len ; i++){
        Boolean left = i==0 || flowerbed[i-1]==0;
        Boolean right = i==len || flowerbed[i+1] ==0;
        if(left && right && flowerbed[i] ==0){
            flowerbed[i] =1;
            n--;
        }
       }
       return n<=0;
    }

}