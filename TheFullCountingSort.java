import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(x.readLine());
        int[] frequency = new int[100];
        StringBuilder STDOUT = new StringBuilder("");
        Map<Integer,Queue<StringBuilder>> order = new HashMap<>();

        for(int i = 0; i < n; i++)
        {
            String[] tmp = x.readLine().split(" ");
            int num = Integer.parseInt(tmp[0]);
            
            StringBuilder s = new StringBuilder(tmp[1]);
            if(i < n/2) s = new StringBuilder("-");
            if(!order.containsKey(num))
            {
                Queue<StringBuilder> str = new LinkedList();
                order.put(num, str);
            }
                order.get(num).add(s);
                
            frequency[num] = frequency[num] + 1;
        }
        
        for(int i = 0; i <frequency.length; i++)
        {
            for(int j = 0; j < frequency[i]; j++)
            {
                STDOUT.append(order.get(i).poll().toString() + " ");
            }
        }
        System.out.print(STDOUT);
    }
}
