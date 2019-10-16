import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        HashMap inventary = new HashMap<Integer,Integer>();
        
        int matchingPair = 0;
        
        for(int i=0; i < n; i++)
        {
            int color = s.nextInt();
            if(inventary.containsKey(color) && inventary.get(color).equals(new Integer(1)))
            {
                inventary.put(color,0);
                matchingPair++;
                continue;
            }
            inventary.put(color,1);
        }
        System.out.println(matchingPair);
    }
}
