import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getWay(int[] squares, int d, int m){
        int way = 0;
        int sum = 0;
        //if there is a way to break the chocolate at all
        if(m <= squares.length) 
            for(int i = 0; i < m; i++)
                sum += squares[i];
        if(sum == d) way++;
        for(int i = 0; i < squares.length-m; i++)
        {
            sum = sum - squares[i] + squares[i+m];
            if(sum == d) way++;
        }
        return way;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = x.nextInt();
        }
        int d = x.nextInt();
        int m = x.nextInt();
        int result = getWay(s, d, m);
        System.out.println(result);
    }
}
