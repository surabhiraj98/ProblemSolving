import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int[] score = new int[n];
        int[] rank = new int[n]; 
        for(int i=0, ranks=1; i < n; i++){
            int s = x.nextInt();
            score[i] = s;
            if(i > 0 && score[i-1] != s)
                ranks++;
            rank[i] = ranks;    
        }
        int aliceRank = rank[rank.length-1] + 1;
        int leaderboardIndex = n-1;
        int m = x.nextInt();
        
        int prevScore = -1; //Last score we saw
        
        for(int aliceScores=0; aliceScores < m; aliceScores++)
        {
            int levelScore = x.nextInt();
        
            for(int i = leaderboardIndex; i >= -1; i--)
            {
                if(i < 0 || score[i] > levelScore)
                {
                    System.out.println(aliceRank);
                    break;
                }
                else if(score[i] < levelScore)
                {
                    if(score[i] != prevScore)
                    {
                        aliceRank--;    
                    }
                    leaderboardIndex--;
                }
                else
                {
                    leaderboardIndex--;
                    aliceRank = rank[i];
                }
                prevScore = score[i];
            }
        }
    }
}
