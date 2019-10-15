import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x1 = s.nextInt();
        int v1 = s.nextInt();
        int x2 = s.nextInt();
        int v2 = s.nextInt();
        
            
        while(x1 <= x2)
        {              
            if(x1 == x2)
            {
                System.out.println("YES");
                System.exit(0);}
            x1 += v1;
            x2 += v2;
        }
        System.out.println("NO");
    }
}
