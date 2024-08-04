//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    public int minimizeCost(int arr[], int k) {
        int []memo = new int[arr.length+1];
        Arrays.fill(memo, -1);
        return fun(arr,arr.length-1, k, memo);
    }
    public static int fun(int []arr, int n, int k, int[]memo){
        if(n == 0){
            return 0;
        }
        if(memo[n] != -1){
            return memo[n];
        }
        int min = Integer.MAX_VALUE;
        for(int i=1; i<=k; i++){
            if(n-i >= 0){
                int res = fun(arr, n-i, k, memo) + Math.abs(arr[n] - arr[n-i]);
                min = Math.min(res,min);
                memo[n] = min;
            }
        }
        return min;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.minimizeCost(arr, k);

            System.out.println(res);
        }
    }
}
// } Driver Code Ends