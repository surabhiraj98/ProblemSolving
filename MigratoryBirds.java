import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] type = new int[5];
        for(int typei=0; typei < n; typei++){
            int types = s.nextInt()-1; 
            type[types] = type[types] +1;
        }
        
        int max = 0, index = 0;
        for(int i = 0; i < 5; i++)
        {
            if(type[i] > max)
            {
                max = type[i]; 
                index = i;
            }
        }
            
        
        System.out.println(index+1);
    }
}
