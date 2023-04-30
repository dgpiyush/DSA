package A0_BASIC;

//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.reversedBits(X));
        }
    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
    static Long reversedBits(Long X) {
        // code here

        String s = String.format("%32s",Long.toBinaryString(X)).replace(' ', '0');
        
        // System.out.println(s);

        String ans = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            ans += s.charAt(i);
        }
        Boolean b=false;
        // System.out.println(ans);

        return Long.parseLong(ans, 2);

    }
};