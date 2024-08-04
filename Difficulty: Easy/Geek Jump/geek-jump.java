//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            int []arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
                
            }
            Solution obj=new Solution();
            int res=obj.minimumEnergy(arr,N);
            System.out.println(res);
            
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    public int minimumEnergy(int arr[],int n){
        int memo[] = new int[n+1];
        Arrays.fill(memo,-1);
        return fun(arr,n-1,memo);
    }
    public static int fun(int []arr, int n, int []memo){
        if(n == 0){
            return 0;
        }
        if(memo[n] != -1){
            return memo[n];
        }
        int left = fun(arr,n-1, memo)+ Math.abs(arr[n] - arr[n-1]);
        int right = Integer.MAX_VALUE;
        if(n > 1)
             right = fun(arr,n-2, memo) + Math.abs(arr[n] - arr[n-2]);
        return memo[n] = Math.min(left, right);
    }
}