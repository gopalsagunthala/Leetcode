//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution
{
    //Function to check if the number is sparse or not.
    public static boolean isSparse(int n)
    {
        
        List<Integer> list = new ArrayList<>();
        while(n != 0){
            int digit = n % 2;
            n = n/2;
            list.add(digit);
            
        }
        int c = 0;
        int max = 0;
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i) == 1 && list.get(i+1) == 1){
                c = c +2;
            }
            max = Math.max(max, c);
            if(list.get(i) == 0 && list.get(i+1) == 1){
                c = 0;
            }
            max = Math.max(max, c);
            if(list.get(i) == 1 && list.get(i+1) == 0){
                c = 0;
            }
            max = Math.max(max, c);
        }
        if(max > 1){
            return false;
        }
        else{
            return true;
        }
        // return false;
    }
    
}


//{ Driver Code Starts.

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//testcases
		int t = sc.nextInt();
		
		while(t-->0){
		    
		    		     
            //initializing n
		    int n = sc.nextInt();
		    
		    Solution obj = new Solution();
		    
		    //printing 1 if isSparse returns true
            //else 0
		    if(obj.isSparse(n)){
		        System.out.println("1");
		    } else {
                System.out.println("0");
		    }
		}
	}
}
// } Driver Code Ends