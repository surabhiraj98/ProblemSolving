import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int I = s.nextInt(); 
        
        int[] astronauts = new int[N];                       
        HashMap<Integer,Integer> countries = new HashMap<>();
        Arrays.fill(astronauts, -1);
        for(int q = 0; q < I; q++)
        {
            int parent = s.nextInt();
            int child = s.nextInt();
            
            
            astronauts[parent] = (astronauts[parent] == -1) ? parent : astronauts[parent];
            astronauts[child] = (astronauts[child] == -1) ? child : astronauts[child];
            int oldRep = astronauts[child];
            astronauts[child] = astronauts[parent];
            for(int qq = 0; qq < N; qq++)
            {
                if(astronauts[qq] == oldRep)
                {
                    astronauts[qq] = astronauts[parent];
                }
            }
        }
        
        for(int person : astronauts)
        {
            if(countries.get(person) == null)
            {
                countries.put(person, 1);
            }
            else
            {
                countries.put(person, countries.get(person) + 1);
            }
        }
        
        
        //Move our values into an array where we can access them easier
        int[] tmp = new int[countries.size()];
        
        long lonelyAstronauts = 0; 
        int j = 0;
        for(Map.Entry<Integer,Integer> country : countries.entrySet())
        {            
            if(country.getKey() == -1)
            {
                lonelyAstronauts = (long) country.getValue();
                continue;
            }
            
            tmp[j] = country.getValue();
            j++;
        }
        
        long combinations = 0;
        
        for(int q = 0; q < tmp.length; q++)
        {
            for(int qq = q+1; qq < tmp.length; qq++)
            {
                combinations += tmp[q] * tmp[qq];
            }
        }
        
        //Added the increased combinations as a result of our single astronaut countries
        if(lonelyAstronauts != 0)
        {
            combinations += (lonelyAstronauts * (N-lonelyAstronauts)) + (((lonelyAstronauts-1)*lonelyAstronauts)/2);
        }
        
        System.out.println(combinations);
    }
}
