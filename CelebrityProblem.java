import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        int famous[]=new int[n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                famous[j]+=arr[i][j];
            }
        }
        int max=0;
        for (int i=0;i<n;i++) {
            if (famous[max]<famous[i]){
                max=i;
            }
        }
        int flag=0;
        for (int i=0;i<n;i++){
            if (famous[max]==famous[i] && max!=i){
                max=-1;
                flag=1;
                break;
            }
        }
        if (flag==0){
        for (int i=0;i<n;i++){
            if (arr[max][i]!=0){
                max=-1;
                break;
            }
        }
        }
        System.out.println(max);
    }
}