import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        long Min = Long.MAX_VALUE;
        long Max = 0;
        long Sum = 0;
        for(int i=0; i<5; i++)
        {
            long curr = in.nextLong();  
            if(Max < curr)
            {
                Max = curr;
            }
            if(Min > curr)
            {
                Min = curr;
            }
            
            Sum += curr;
        }
        long minSum = Sum - Max;//Removes the largest of the 5 numbers to get the min sum
        long maxSum = Sum - Min;//Removes the smallest of the 5 numbers to get the max sum
        System.out.println(minSum + " " + maxSum);
    }
}
