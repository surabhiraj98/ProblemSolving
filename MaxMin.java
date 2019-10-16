import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class Solution {
    
   public static void main(String[] args) throws NumberFormatException, IOException {
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(in.readLine());
       int K = Integer.parseInt(in.readLine());
       int[] list = new int[N];

       for(int i = 0; i < N; i ++)
           list[i] = Integer.parseInt(in.readLine());
      
       int unfairnes = Integer.MAX_VALUE;
       
       Arrays.sort(list);
       for(int i = 0; i < N-K+1; i++)
           unfairnes = Math.min(list[i+K-1] - list[i], unfairnes);
      
       System.out.println(unfairnes);
   }
}
