//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            // int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[0]);

            String line = br.readLine();
            String[] tokens = line.split(" ");
            int[] arr = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                arr[i] = Integer.parseInt(tokens[i]);
            }

            boolean ans = new Solution().hasArrayTwoCandidates(arr, x);
            System.out.println(ans ? "true" : "false");
            // System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    boolean hasArrayTwoCandidates(int arr[], int x) {
        ArrayList<Integer> list = new ArrayList<>();
        // for(int i: arr){
        //     list.add(i);
        // }
        
        for(int i: arr){
            int num = x-i;
            if(list.contains(num)){
                return true;
            }
            list.add(i);
            
        }
        return false;
    }
}