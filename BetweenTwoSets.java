import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int max = 0;
        int min = 101;
        
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            int tmp = s.nextInt();
            max = tmp > max ? tmp:max;
            a[a_i] = tmp;
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            int tmp = s.nextInt();
            min = tmp < min ? tmp:min;
            b[b_i] = tmp;
        }        
        
        int integerBetween = 0;
        
        intCheck: 
        for(int i = max; i <= min; i += max)
        {
            for(int num : a)
            {
                if(i%num != 0)
                {
                    continue intCheck;
                }
            }
            for(int num : b)
            {
                if(num%i != 0)
                {
                    continue intCheck;
                }
            }
            integerBetween++;
        }
        System.out.println(integerBetween);
    }
}
