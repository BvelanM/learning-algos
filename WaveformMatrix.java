import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int mat[][]=new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int flag=0;
        for (int i=n-1;i>=0;i--){
            if (flag==0){
                for (int j=m-1;j>=0;j--){
                    System.out.print(mat[j][i]+" ");
                }
                flag=1;
            }
            else if (flag==1){
                for (int j=0;j<m;j++){
                    System.out.print(mat[j][i]+" ");
                }
                flag=0;
            }
        }
        
        
    }
}