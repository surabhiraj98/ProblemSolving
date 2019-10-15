import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();

            
            int newGrade = ((grade / 5) + 1) * 5;
            
            if(newGrade < 40) 
            {
                System.out.println(grade);
                continue;
            }
            
            if(newGrade - grade < 3) System.out.println(newGrade);
            else
                System.out.println(grade);
        }
    }
}
