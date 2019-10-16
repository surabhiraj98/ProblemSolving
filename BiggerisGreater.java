import java.io.*;
import java.util.*;
import java.lang.StringBuilder;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        
        for(int i = 0; i < n; i++)
        {    
            String word = s.nextLine();
            if(word.length()==1) {
                System.out.println("no answer");
                continue;
                }
            int maxC1 = 0; 
            int maxC2 = 0; 
            for(int j = 1; j < word.length(); j++)
            {
                boolean condition1 = word.charAt(j) > word.charAt(j-1);
                    
                if(condition1)
                {
                    maxC1 = (j > maxC1) ? j : maxC1;
                }
            }
            if(maxC1==0) {
                System.out.println("no answer");
                continue;
                }
            for(int j = maxC1; j < word.length(); j++)
            {
                boolean condition2 = word.charAt(j) > word.charAt(maxC1-1);
                    
                if(condition2)
                {
                    maxC2 = j;
                }
            }
            
            StringBuilder wordSB = new StringBuilder(word);
            char tmp = wordSB.charAt(maxC1-1);
            wordSB.setCharAt(maxC1-1, wordSB.charAt(maxC2));
            wordSB.setCharAt(maxC2, tmp);
            int left = maxC1;
            int right = wordSB.length()-1;
            while(left < right)
            {
                tmp = wordSB.charAt(left);
                wordSB.setCharAt(left, wordSB.charAt(right));
                wordSB.setCharAt(right, tmp);
                left++;
                right--;
            }
            
            
            System.out.println(wordSB);
        }
    }
}
