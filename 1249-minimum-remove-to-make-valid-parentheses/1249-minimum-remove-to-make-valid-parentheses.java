class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] arr = s.toCharArray();
        int count = 0;

        //for open
        for(int i =0; i<arr.length; i++){
            char c = arr[i];
            if(c == '('){
                count++;
            }
            else if(c == ')'){
                if(count>0){
                    count--;
                }
                else{
                    arr[i] = '0';
                }
            }
        }
        // for close
        count = 0;
        for(int i = arr.length-1; i>=0; i--){
            char ch = arr[i];
            if(ch == ')'){
                count++;
            }
            else if(ch == '('){
                if(count>0){
                    count--;
                }
                else{
                    arr[i] = '0';
                }
            }

        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != '0'){
                sb.append(arr[i]);
            }
            
        }
        return sb.toString();
    }
}