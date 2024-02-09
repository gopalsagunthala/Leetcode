class Solution {
    public String gcdOfStrings(String s1, String s2) {
        String res = "";
        int max = 0;

        for(int i=1; i<=s2.length(); i++){
            String ch = s2.substring(0,i);
            if(s1.replace(ch,"") == "" && s2.replace(ch,"") == ""){
                if(ch.length()>max){
                    max = ch.length();
                    res = ch;
                }
            }
        }
        return res;
    }
}