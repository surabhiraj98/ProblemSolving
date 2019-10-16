import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for(int t = 0; t < T; t++)
        {
            int N = s.nextInt();
            int M = s.nextInt();
            HashMap<Integer,HashSet<Integer>> cityMap = new HashMap<>();
            for(int i = 0; i < M; i++)
            {
                int source = s.nextInt();
                int target = s.nextInt();
                if(cityMap.containsKey(source)) cityMap.get(source).add(target);
                else 
                {
                    HashSet<Integer> roads = new HashSet<>(); roads.add(target);
                    cityMap.put(source, roads);
                }
                if(cityMap.containsKey(target)) cityMap.get(target).add(source);
                else 
                {
                    HashSet<Integer> roads = new HashSet<>(); roads.add(source);
                    cityMap.put(target, roads);
                }
            }
            int startingPoint = input.nextInt();
            int[] distance = BFS_Distance(startingPoint, cityMap, N);
            StringBuilder output = new StringBuilder("");
            for(int i = 0; i < distance.length; i++)
            {
                if(i+1 != startingPoint)
                    output.append(distance[i]+" ");
            }
            System.out.println(output);
        }
    }
   
    static int[] BFS_Distance(int root, HashMap<Integer,HashSet<Integer>> graph, int N)
    {
        int[] distance = new int[N];
        
        HashSet<Integer> notVisited = new HashSet<>();
        HashSet<Integer> visited = new HashSet<>();
        for(int i = 1; i <= N; i++) notVisited.add(i);
        
        Queue<Integer> queue = new LinkedList<>();
        
        queue.offer(root);
        notVisited.remove(root);
        distances[0] = 0;
        
        while(!queue.isEmpty())
        {
            int curr = queue.poll();
            HashSet<Integer> neighbors = graph.get(curr);
                
            for(int nv : notVisited)
            {
                if(neighbors == null || !neighbors.contains(nv))
                {
                    queue.offer(nv);
                    distances[nv-1] = distances[curr-1]+1;
                    visited.add(nv);
                } 
            }
            notVisited.removeAll(visited);
            visited = new HashSet<>();
        }
        return distance;
    }
}
