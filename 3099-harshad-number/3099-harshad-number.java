class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int num = 0, temp = x;
        while(x != 0){
            num += x % 10;
            x = x/10;
        }
        return (temp % num == 0) ? num: -1;
    }
}