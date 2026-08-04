class Solution {
    public String reverseWords(String s) {
       StringBuilder sc = new StringBuilder();
       int i = s.length()-1;
       while(i>=0){
        //skip spaces
        while(i>=0 && s.charAt(i) ==' '){
            i--;
        }
        //to skip last space after reversing
        if(i<0) break;
        int j = i;
        //search spaces to complete a word
        while(i>=0 && s.charAt(i) != ' '){
            i--;
        }
        //add spaces after word
        if(sc.length() > 0){
            sc.append(' ');
        }
        //append word
        sc.append(s.substring(i+1 , j+1));
       }
       return sc.toString();
    }
}