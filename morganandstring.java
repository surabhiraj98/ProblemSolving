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
        int t = s.nextInt();
        for(int a0 = 0; a0 < t; a0++)
        {
            StringBuilder s1 = new StringBuilder(s.next()); s1.append("z");//Denote end
            StringBuilder s2 = new StringBuilder(s.next()); s2.append("z");//Denote end
            StringBuilder output = new StringBuilder("");
            
            int i = 0, j = 0;//Index into each string
            while(i < s1.length() && j < s2.length())
            {
                if(s1.charAt(i) < s2.charAt(j))
                {
                    output.append(s1.charAt(i));
                    i++;
                }
                else if(s1.charAt(i) > s2.charAt(j))
                {
                    output.append(s2.charAt(j));
                    j++;
                }
                else 
                {
                    if(s1.charAt(i) == 'z'){i++; j++; continue;}//End has been reached
                    int startingI = i;
                    int startingJ = j;
                    //Find the point at which their equality diverge
                    while(s1.charAt(i) == s2.charAt(j))
                    {
                        i++;
                        j++;
                        if(i >= s1.length() && j >= s2.length()) 
                        {
                            i = startingI;
                            j = startingJ;
                            break;  
                        }
                        else if(i >= s1.length()) //String 1 is shorter than string 2
                        {
                            char prev = s2.charAt(startingJ);
                            while(s2.charAt(startingJ) <= prev)
                            {
                                output.append(s2.charAt(startingJ));
                                prev = s2.charAt(startingJ);
                                startingI++;
                            }
                            i = startingI;
                            j = startingJ;
                        }
                        else if(j >= s2.length()) //String 2 is shorter than string 1
                        {
                            char prev = s1.charAt(startingI);
                            while(s1.charAt(startingI) <= prev)
                            {
                                output.append(s1.charAt(startingI));
                                prev = s1.charAt(startingI);
                                startingI++;
                            }
                            i = startingI;
                            j = startingJ;
                        }
                    }
                    if(s1.charAt(i) <= s2.charAt(j))
                    {
                        char prev = s1.charAt(startingI);
                        while(s1.charAt(startingI) <= prev)
                        {
                            output.append(s1.charAt(startingI));
                            prev = s1.charAt(startingI);
                            startingI++;
                        }
                        i = startingI;
                        j = startingJ;
                    }
                    if(s1.charAt(i) > s2.charAt(j))
                    {
                        char prev = s2.charAt(startingJ);
                        while(s2.charAt(startingJ) <= prev)
                        {
                            output.append(s2.charAt(startingJ));
                            prev = s2.charAt(startingJ);
                            startingJ++;
                        }
                        i = startingI;
                        j = startingJ;
                    }
                }
            }
            while(i < s1.length())
            {
                output.append(s1.charAt(i));
                i++;
            } 
            while(j < s2.length())
            {
                output.append(s2.charAt(j));
                j++;
            }
            //Print the output
            System.out.println(output);
        }
    }
}
