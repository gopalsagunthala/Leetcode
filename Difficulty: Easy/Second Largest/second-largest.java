//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        int i;
        if(arr.length < 2){
            return -1;
        }
        int second_large = -1;
        int large = -1;
        for(i=0; i<arr.length; i++){
            if(arr[i] > large){
                second_large = large;
                large = arr[i];
            }
            else if(second_large < arr[i] && arr[i] != large){
                second_large = arr[i];
            }
            
        }
        return second_large;
    }
}