//{ Driver Code Starts
//Initial Template for Java

import java.math.*;
import java.util.*;
import java.io.*;

class Driverclass
{
    // Driver Code
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }
    }
    
	public static void main(String args[])
	{
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
		    out.println(new Solution().findLongestConseqSubseq(a, n));
		    t--;
		}
		out.close();
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int n)
	{
	   if(n == 1){
	       return 1;
	   }
	   Arrays.sort(arr);
	   //Set<Integer> set = new HashSet<>();
	   //for(int i: arr){
	   //    set.add(i);
	   //}
	   //System.out.println(Arrays.toString(arr));
	   int res = 0;
	   int c = 1;
	   int a = 0;
	   for(int i=0; i<n-1; i++){
	       if(arr[i] == arr[i+1]){
	           continue;
	       }
	       a = arr[i+1] - arr[i];
	       if( a == 1){
	           //System.out.print(arr[i]+" "+arr[i]);
	           c++;
	       }
	       else{
	           c = 1;
	       }
	       res = Math.max(res, c);
	   }
	   return res;
	}
}