//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        int hash[] = new int[n+1];
        for(int i: arr){
            hash[i]++;
        }
        int dup = -1; 
        int mis = -1;
        // System.out.print(Arrays.toString(hash));
        for(int i=1; i<n+1; i++){
            if(hash[i] == 2){
                dup = i;
            }
            else if(hash[i] == 0){
                mis = i;
            }
            if(dup != -1 && mis != -1){
                break;
            }
        }
        int res[] = new int[2];
        res[0] = dup;
        res[1] = mis;
        return res;
    }
}