import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int s = x.nextInt();
        int t = x.nextInt();
        int a = x.nextInt();
        int b = x.nextInt();
        int m = x.nextInt();
        int n = x.nextInt();
        int apple = 0;
        int orange = 0;
        
        for(int i = 0; i < m; i++)
        {
            int landSpot = x.nextInt() + a;
            if(landSpot >= s && landSpot <= t)
            {
                apple++;
            }
            
        }
        
        for(int i = 0; i < n; i++)
        {
            int landSpot = x.nextInt() + b;
            if(landSpot >= s && landSpot <= t)
            {
                orange++;
            }
        }
        System.out.println(apple);
        System.out.println(orange);
    }
}
