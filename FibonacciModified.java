import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger n1 = new BigInteger(Integer.toString(s.nextInt()));
        BigInteger n2 = new BigInteger(Integer.toString(s.nextInt()));
        BigInteger output = new BigInteger("0");
        
        int t = s.nextInt();
        
        if(t == 1){System.out.println(n1);}
        if(t == 1){System.out.println(n2);}
        
        for(int i = 2; i < t; i++)
        {
            output = n2.multiply(n2);
            output = output.add(n1);
            
            n1 = new BigInteger(n2.toString());
            
            n2 = new BigInteger(output.toString());
            
        }
        System.out.println(output);
    }
}
