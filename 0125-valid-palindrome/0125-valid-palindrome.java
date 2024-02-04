class Solution {
    public boolean isPalindrome(String str) {
       int s = 0;
       int e = str.length()-1;
       while(s<=e){
           while(s<=e && !Character.isLetterOrDigit(str.charAt(s))){
               s++;
           }
           while(s<=e && !Character.isLetterOrDigit(str.charAt(e))){
               e--;

           }
           if(s<=e &&  Character.toLowerCase(str.charAt(s)) != Character.toLowerCase(str.charAt(e))){
               return false;
           }
           s++;
           e--;
       } 
       return true;
    }
}