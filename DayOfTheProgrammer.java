import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int Year){
        String Date = "";
        if(Year < 1918) {                                                
            Date += (Year % 4 == 0) ? "12.09." + Year : "13.09." + Year;
        } else if(Year == 1918) {                                          
            Date += "26.09." + Year;
        } else {                                                                                          Date += ((Year % 400 == 0) ||              
            (Year % 4 == 0 && Year % 100 != 0)) ? "12.09." + Year : "13.09." + Year;
        }
        return Date;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Year = s.nextInt();
        String Result = solve(Year);
        System.out.println(Result);
    }
}
