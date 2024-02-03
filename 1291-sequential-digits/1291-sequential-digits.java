class Solution {
    public List<Integer> sequentialDigits(int l, int h) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<=9; i++){
            int num = i;
            int nextdig = i+1;
            while(num <= h && nextdig <= 9){
                num = num * 10 + nextdig;
                if(num>=l && num<=h){
                    list.add(num);
                }
                nextdig++;
            }
        }
        Collections.sort(list);
        return list;
    }
    
}