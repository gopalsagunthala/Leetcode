//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            int k = sc.nextInt();
    		System.out.println (new Solution().substrCount (s, k));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    long substrCount (String s, int k) {
        return fun(s,k) - fun(s,k-1);
    }
    public static long fun(String s, int k){
        long count = 0;
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int right = 0; right<s.length(); right++){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right),0)+1);
            while(map.size() > k){
                char leftchar = s.charAt(left);
                map.put(leftchar, map.get(leftchar)-1);
                if(map.get(leftchar) <= 0){
                    map.remove(leftchar);
                }
                left++;
            }
            count += right - left +1;
        }
        return count;
    }
}