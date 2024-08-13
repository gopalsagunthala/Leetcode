//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String str) {
        return isVali(str);
    }
    public static boolean isVali(String str){
        String arr[] = str.split("\\.");
        
        if(arr.length != 4){
            return false;
        }
        for(String s: arr){
            if(!valid(s)){
                return false;
            }
            
        }
        return true;
    }
    public static boolean valid(String s){
        if(s.isEmpty()){
            return false;
        }
        try{
            int a = Integer.parseInt(s);
        }
        catch(NumberFormatException e){
            return false;
        }
        return ((Integer.parseInt(s)>=0) && (Integer.parseInt(s)<=255)) &&
                 ( s.equals("0") || !s.startsWith("0"));
    }
}