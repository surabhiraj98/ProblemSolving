import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int totalCost = 0;
        int noEat = 0;
        
        for(int i = 0; i < n; i++) {
            int item = s.nextInt();
            if(i == m) noEat = item;
            totalCost += item;
        }
        
        int charge = s.nextInt();
        if(charge == totalCost/2) {
            System.out.println(noEat/2);
            System.exit(0);
        }
        System.out.println("Bon Appetit");
    }
}
