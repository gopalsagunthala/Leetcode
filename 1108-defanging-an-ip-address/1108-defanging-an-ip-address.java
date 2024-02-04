class Solution {
    public String defangIPaddr(String add) {
        // String[] a = add.split("\\.");
        // System.out.print(Arrays.toString(a));
        // StringBuffer s = new StringBuffer();
        // for(int i =0; i<a.length; i++){
        //     s.append(a[i]);
        //     if(i == 3){
        //         break;
        //     }
        //     s.append("[.]");
        // }
        
        // return s.toString();
        return add.replace(".", "[.]");
    }
}