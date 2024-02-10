class Solution {
    public String interpret(String c) {
        StringBuilder g = new StringBuilder();
        int i =0;
        while(i<c.length()){
            if(c.charAt(i) == 'G'){
                g.append("G");
                i = i+1;
            }
            else if(c.charAt(i) == '(' && c.charAt(i+1) == ')'){
                g.append("o");
                i = i+2;
            }
            else if(c.charAt(i) == '(' && c.charAt(i+1) == 'a'){
                g.append("al");
                i = i+4;
            }
            // i++;
            
        }
        return g.toString();
        
    }
}