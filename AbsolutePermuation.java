import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        tests :
        for(int a1 = 0; a1 < t; a1++){
            int n = s.nextInt();
            int m = s.nextInt();
            int[] array = new int[n];
            Set<Integer> used = new HashSet<>();

            for(int i = 0; i < n/2; i++)
            {
                int leftMost = i + 1;
                int rightMost = n - i;
                //Left most
                if(leftMost - m > 0 && !used.contains(leftMost-m))
                {
                    array[i] = leftMost-m;
                    used.add(leftMost-m);
                }
                else if(i + 1 + m <= n && !used.contains(leftMost+m))
                {
                    array[i] = leftMost+m;
                    used.add(leftMost+m);
                }
                else
                {
                    System.out.println("-1");
                    continue tests;
                }
                
                if(rightMost + m <= n && !used.contains(rightMost+k))
                {
                    array[n-1-i] = rightMost+m;
                    used.add(rightMost+m);                    
                }
                else if(rightMost - m > 0 && !used.contains(rightMost-m))
                {
                    array[n-1-i] = rightMost-m;
                    used.add(rightMost-m);
                }
                else
                {
                    System.out.println("-1");
                    continue tests;
                }
            }
           
            if(n % 2 == 1)
            {
                int middle = (n/2) + 1;
                
                if(!used.contains(middle+m) || !used.contains(middle-m))
                {
                    if(!used.contains((n/2) +1 + m) && middle + m <= n)
                    {
                        array[(n/2)] = (n/2) + 1 + m;
                    }
                    else if(!used.contains((n/2) +1 - m) && middle - m > 0)
                    {
                        array[(n/2)] = (n/2) + 1 - m;
                    }
                    else
                    {
                        System.out.println("-1");
                        continue tests;    
                    }
                }
                else
                {
                    System.out.println("-1");
                    continue tests;
                }
            }
           
            for(int num : array)
            {
                System.out.print(num+" ");
            }
            System.out.println("");
            
        }
    }
}
