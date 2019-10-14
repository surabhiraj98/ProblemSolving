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
        int Tall = 0;
        int freq = 0;
        
        
        for(int i=0; i < n; i++){
            int Height = s.nextInt();
            
            if(Height > Tall){
                Tall = Height;
                freq = 1;
            }
            else if(Height == Tall) freq++;
        }
        System.out.println(freq);
    }
}
