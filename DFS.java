import java.io.*;
import java.util.*;

    public class Solution {
        static HashSet<Integer> visited=new HashSet<Integer>();
    static void dfs(int[][] graph,int i,int n){
      if (!visited.contains(i)){
          visited.add(i);
          System.out.print(i+" ");
        for (int j=0;j<n;j++){
            if (graph[i][j]==1){
                  dfs(graph,j,n);
                }
    }
      }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=sc.nextInt();
        int graph[][]=new int[n][n];
        for (int i=0;i<e;i++){
            int node1=sc.nextInt();
            int node2=sc.nextInt();
            graph[node1][node2]=1;
        }
        int temp=sc.nextInt();
        System.out.println("Depth First Traversal starting from vertex "+temp+":");
        dfs(graph,temp,n);
    }
        
}