class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        int n = str.length;
        String[] temp = new String[n];
        int j = 0;
        for(int i = n-1; i>=0; i--){
            temp[j] = str[i];
            j++;
            
        }
        String result;
        result = String.join(" ",temp);
        // for(String a: temp){
        //     System.out.print(a+" ");
        // }
        return result.replaceAll("\\s+"," ").trim();
    }
}