//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        int digit =  0;
        int temp = n;
        digit = tellme(n);
        double sum = 0;
        while(n != 0){
            int l = n% 10;
            sum = sum + Math.pow(l, digit);
            n = n/10;
        }
        // System.out.print(sum);
        if(temp == sum){
            return "Yes";
        }
        else if(sum != n){
            return "No";
        }
        return "YES";
    }
    public static int tellme(int n){
        int c = 0;
        while(n != 0){
            n = n/10;
            c++;
        }
        return c;
    }
}