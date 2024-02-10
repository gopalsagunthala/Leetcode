class Solution {
    public int mostWordsFound(String[] s) {
        int max = 0;
        for(int i=0; i<s.length; i++){
            if(s[i].split(" ").length>max){
                max = s[i].split(" ").length;
            }
        }
        return max;
    }
}