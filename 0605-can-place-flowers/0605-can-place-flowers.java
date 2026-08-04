class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       int x = flowerbed.length;
       for(int i = 0; i<x ; i++){
            Boolean left = i==0 || flowerbed[i-1] ==0;
            Boolean right = i==x-1|| flowerbed[i+1] ==0;
            if(left && right && flowerbed[i] ==0){
                flowerbed[i] = 1;
                n--;
            }
       }
       return n<=0;
    }
}