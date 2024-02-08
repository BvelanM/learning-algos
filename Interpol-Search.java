import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int search=sc.nextInt();
		int low=0;
		int high=n-1;
		int pos;
		int flag=0;
		int att=n;
		double temp=0;
		while (n>=0){
		    temp=(double)(high - low) / (double)(arr[high] - arr[low]);
		    pos =(int) (low + ( (temp) * (search - arr[low])));
		    System.out.println(pos);
		    if (arr[pos]==search) {
		        flag=1;
		        System.out.println("Found in "+pos+" pos ");
		        break;
		    }
		    else if (arr[pos]>search){
		        System.out.println("lowered");
		        high=pos-1;
		        n--;
		    }
		    else if (arr[pos]<search){
		        System.out.println("highered");
		        low=pos+1;
		        n--;
		    }
		}
	}
}