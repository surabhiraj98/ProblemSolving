import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long[] price = new long[n];
        HashMap<Long,Integer> indice = new HashMap<>();

       
        for(int i = 0; i < n; i++){
            price[i] = s.nextLong();
            indice.put(price[i],i);
        }

        Arrays.sort(price);

        Long minimumLoss = Long.MAX_VALUE;
        for(int i = n-1; i >0; i--){
            if(price[i]-price[i-1] < minimumLoss){
               
                if(indice.get(price[i]) < indice.get(price[i-1]))
                    minimumLoss = price[i]-price[i-1];
            }
        }

        System.out.println(minimumLoss);

    }
}
