import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int jump=(int) Math.sqrt(n);
	    int low=0;
	    int high=0;
	    int arr[]=new int[n];
	    for (int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    int flag=0;
	    int search=sc.nextInt();
	    while (true){
	        if (high+jump<n){
	            high+=jump;
	            System.out.println("Jumped to "+high);
	            if (arr[high]<search){
	                low=high;
	                System.out.println("NL High");
	                continue;
	            }
	            else if (arr[high]==search) {
	                flag=1;
	                System.out.println("Found in "+high+" pos ");
	                break;
	            }
	            else{
	                System.out.println("L High");
	                break;
	            }
	        }
	        else{
	            low=high;
	            high=n-1;
	            System.out.println("Over array");
	            break;
	        }
	    }
	    if (flag==0){
	    for (int i=low;i<=high;i++){
	        if (arr[i]==search) {
	            flag=1;
	            System.out.println("Found iin "+i+ " pos ");
	        }
	    }
	    }
	    if (flag==0){
	        System.out.println("Not found");
	    }
	}
}