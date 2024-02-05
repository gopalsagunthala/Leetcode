class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer>  map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Character> list = new ArrayList<>();
        for(char c: map.keySet()){
            if(map.get(c) == 1){
                list.add(c);
            }
        }
        if(list.size() == 0){
            return -1;
        }
        int ind = Integer.MAX_VALUE;
        for(int i =0; i<list.size(); i++){
            ind = Math.min(ind, s.indexOf(list.get(i)));
        }
        System.out.print(list);
        return ind;
    }
}