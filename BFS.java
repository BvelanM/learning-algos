import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       int n=sc.nextInt();
        int e=sc.nextInt();
        int arr[][]=new int[n][n];
        for (int i=0;i<e;i++){
            int node1=sc.nextInt();
            int node2=sc.nextInt();
            arr[node1][node2]=1;
            arr[node2][node1]=1;
        }
        HashSet<Integer> visited=new HashSet<>();
        Queue<Integer> store=new LinkedList<>();
        for (int i=0;i<n;i++){
                if (!visited.contains(i)){
                    visited.add(i);
                    store.add(i);
                    for (int j=0;j<n;j++){
                        if (!(visited.contains(arr[i][j]))){
                            visited.add(arr[i][j]);
                            store.add(arr[i][j]);
                        }
                    }
            }
        }
        for (Integer i:store){
            System.out.print(i+" ");
        }
    }
}