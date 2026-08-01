class Solution {
    public String reverseWords(String s) {
       StringBuilder sc = new StringBuilder();
       int i = s.length()-1;
       while(i>=0){
        while(i>=0 && s.charAt(i) == ' '){
            i--;
        }
        if(i<0) break;
        int j = i;
        while(i>=0 && s.charAt(i) != ' '){
            i--;
        }
        if (sc.length() > 0) {
                sc.append(" ");
            }
        sc.append(s.substring(i+1 , j+1));
        
       }

       return sc.toString();
    }
}