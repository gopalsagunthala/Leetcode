//{ Driver Code Starts
import java.util.*;
import java.util.Scanner;
import java.util.Stack;

class SortedStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Stack<Integer> s = new Stack<>();
            int n = sc.nextInt();
            while (n-- > 0) s.push(sc.nextInt());
            GfG g = new GfG();
            Stack<Integer> a = g.sort(s);
            while (!a.empty()) {
                System.out.print(a.peek() + " ");
                a.pop();
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/
class GfG {
    static List<Integer> list = new ArrayList<>();
    // static Stack<Integer> res = new Stack<>();
    public Stack<Integer> sort(Stack<Integer> s) {
        if(s.isEmpty()){
            
            return s;
        }
        int val = s.pop();
        sort(s);
        if(s.isEmpty()){
            s.push(val);
        }
        else{
            while(!s.isEmpty() && val < s.peek()){
                list.add(s.pop());
            }
            s.push(val);
            if(!(list.isEmpty())){
                
                int n = list.size()-1;
                while(n != -1){
                    s.push(list.get(n));
                    list.remove(n--);
                }
            }
        }
        return s;
        // System.out.print(s.pop());
       // return s;
    }
}