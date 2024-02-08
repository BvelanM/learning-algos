import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	     HashMap<Integer,HashSet<Integer>> graph = new HashMap<Integer,HashSet<Integer>>();
	     HashSet<Integer> temp=new HashSet<>();
	     int inp;
	     while(true){
	         System.out.println(" 1.Add Node and connection");
	         System.out.println(" 2.Show Connected");
	         System.out.println(" 3.Exit");
	         inp=sc.nextInt();
	         if (inp==3){
	             break;
	         }
	         else if (inp==1){
	             System.out.println("Enter Node 1:");
	             int n1=sc.nextInt();
	             System.out.println("Enter Node 2:");
	             int n2=sc.nextInt();
	             temp=graph.get(n1);
	             if (temp==null) temp=new HashSet<>();
	             temp.add(n2);
	             graph.put(n1,temp);
	             temp=graph.get(n2);
	             if (temp==null) temp=new HashSet<>();
	             temp.add(n1);
	             graph.put(n2,temp);
	         }
	         else if (inp==2){
	             System.out.println("Enter Node to Display it's possible destinations :");
	             int n1=sc.nextInt();
	             System.out.println(graph.get(n1));
	         }
	     }
	}
}