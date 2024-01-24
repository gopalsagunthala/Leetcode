class Solution {
    public int maxVowels(String s, int k) {
       int n = s.length();
       int c = 0;
       int i = 0;
       for(i = 0; i<k; i++){
           if(isVowel(s.charAt(i))){
               c++;
           }
       }
       int max = c;
       System.out.print(i);
       for(int r = i; r<n; r++){
           if(isVowel(s.charAt(r))){
               c++;
                // max = Math.max(max, c);
               
           }
           if(isVowel(s.charAt(r-k))){
                   c--;
               }
                   max = Math.max(max, c);
       }
       return max;
    }
    public Boolean isVowel(char ch){
           if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'){
               return true;
           }
           return false;
       }
}