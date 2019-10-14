import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        double pos = 0;
        double neg = 0;
        double zero = 0;
        
        for(int i = 0; i<n; i++)
        {
            int value = s.nextInt();
            pos += value>0 ? 1:0;
            neg += value<0 ? 1:0;
            zero     += value==0 ? 1:0;
        }
        System.out.println(pos/n);
        System.out.println(neg/n);
        System.out.println(zero/n);
    }
}
