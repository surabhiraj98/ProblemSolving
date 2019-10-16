import java.io.*;
import java.util.*;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] building = new int[n];
        int minEnergy = 0;

        for(int i = 0; i < n; i++)
        {
            building[i] = s.nextInt();
        }
        
       
        for(int i = building.length-1; i >= 0; i--)
        {
            int buildingHeight = building[i];
            
            if(buildingHeight > minEnergy)
            {
                minEnergy += (int) Math.ceil((buildingHeight - minEnergy) / 2.0);
            }
            else if(buildingHeight < minEnergy) 
            {
                minEnergy = (int) Math.ceil((buildingHeight + minEnergy) / 2.0);
            }
            
        
        }
        
        System.out.println(minEnergy);
    }
}
