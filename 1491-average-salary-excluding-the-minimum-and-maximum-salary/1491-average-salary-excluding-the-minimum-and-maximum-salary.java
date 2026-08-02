class Solution {
    public double average(int[] salary) {
       int min  = salary[0];
       int max = salary[0];
       int len = salary.length;
       int sum =0 ;
       for(int sal :salary){
        if(min > sal){
            min = sal;

        }
        else if(max < sal){
            max = sal;
        }
        sum+= sal;
       }
       return (double) (sum-(min+max))/(len-2);
    }
}