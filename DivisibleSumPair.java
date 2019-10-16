import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int n = p.nextInt();
        int s = p.nextInt();
        int a[] = new int[n];
        for(int ai=0; ai < n; ai++){
            a[ai] = p.nextInt();
        }
        
        int validPair = 0;
        
        int[] modSort = new int[s];
        
        for(int num : a)
        {
            int modIndex = num % s;
            modSort[modIndex] += 1;
        }
        
        validPair += (modSort[0]*(modSort[0]-1)/2);
        
        for(int i = 1; i < s/2.0; i++)
        {
                int x = modSort[i];
                int y = modSort[s-i];
                validPair += x*y;
        }
        
        if(s % 2 == 0)
        {
            validPair += (modSort[s/2]*(modSort[s/2]-1)/2);
        }
        
        System.out.println(validPair);
    }
}

