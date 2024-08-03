//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String s){
        if(s.length() <2){
            return s;
        }
        int low = 0;
        int high = 0;
        String str = "";
        for(int i=1; i<s.length(); i++){
            low = i;
            high = i;
            
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                
                if(low < 0 || high >= s.length()){
                    break;
                }
            }
            String len = s.substring(low+1,high);
            if(len.length() > str.length()){
                str = len;
            }
            
            low = i-1;
            high = i;
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;
                
                if(low < 0 || high >= s.length()){
                    break;
                }
            }
            len = s.substring(low+1, high);
            if(len.length() > str.length()){
                str = len;
            }
            
        }
        if(str.length() == 1){
            String st = s.charAt(0)+"";
            return st;
        }
        return str;
        
    }
}