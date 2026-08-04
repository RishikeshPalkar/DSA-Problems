class Solution {
    public String reverseVowels(String s) {
        String vowels ="AEIOUaeiou";
        char ch [] = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            while(i<j && !vowels.contains(String.valueOf(ch[i]))){
                i++;
            }
            while(i<j && !vowels.contains(String.valueOf(ch[j]))){
                j--;
            }
            if(vowels.contains(String.valueOf(ch[i])) && vowels.contains(String.valueOf(ch[j])) ){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }
        return new String(ch);
    }
}