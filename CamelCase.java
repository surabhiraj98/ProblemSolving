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
        String n = s.next();
        
        if(n.isEmpty())
        {
            System.out.println("0");
            System.exit(0);
        }
        
        int words = 1;
        
        for(char letter : s.toCharArray())
        {
            if(letter < 91 && letter > 64 )
            {
                words++;
            }
        }
        System.out.println(words);
    }
}
