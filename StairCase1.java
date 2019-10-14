import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        StringBuilder stairCase = new StringBuilder("");
        
        for(int i = 0; i < n; i++)
        {
            stairCase.append(" ");
        }//Builds the a basic stair with no hashes
        
        for(int i = 1; i< n+1; i++)
        {
            stairCase.setCharAt(n-i,'#');
            System.out.println(stairCase);
        }//Makes a longer step each iteration
    }
}
