class Solution {
    public String firstPalindrome(String[] words) {
        for(int i =0; i<words.length;i++){
            int f =0;
            String str = words[i];
            int j = 0, k = str.length()-1;
            while(j<k){
                if(str.charAt(j) != str.charAt(k)){
                    f = 1;
                    break;
                }
                else{
                    j++;
                    k--;
                }
            }
            if(f == 0){
                return str;
            }
        }
        return "";
    }
}