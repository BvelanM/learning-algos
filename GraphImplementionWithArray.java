import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[][]=new int[n][n];
	    while(true){
	        int start=sc.nextInt();
	        int end=sc.nextInt();
	        if (start ==-1 || end==-1) break;
	        arr[start-1][end-1]=1;
	        arr[end-1][start-1]=1;
	    }
	    while (true){
	        int find=sc.nextInt();
	        for (int i=0;i<n;i++){
	            if (arr[find-1][i]==1){
	                System.out.println("Node "+find+ " connected with "+(int)(i+1));
	            }
	        }
	    }
	}
}