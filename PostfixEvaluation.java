import java.util.*;
public class Main
{   
    static boolean checkOperator(String c){
        if (c=="+"  || c=="-" || c=="*" || c=="/" || c=="^"){
            return true;
        }
        return false;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		Stack<Integer> stk=new Stack<>();
		String inp1=sc.nextLine();
		String inp[]=inp1.split(" ");
		int a=0;
		int b=0;
		int temp=0;
		for (int i=0;i<inp.length;i++){
		    if (checkOperator(inp[i])) {
		        b=stk.pop();
		        a=stk.pop();
		        if (inp[i]=="+"){
		            temp=a+b;
		        }
		        else if (inp[i]=="-"){
		            temp=a-b;
		        }
		        else if (inp[i]=="*"){
		            temp=a*b;
		        }
		        else if (inp[i]=="/"){
		            temp=a/b;
		        }
		        else if (inp[i]=="^"){
		            temp=(int) Math.pow(a,b);
		        }
		        stk.push(temp);
		    }
		    else{
		        stk.push(Integer.parseInt(inp[i]));
		    }
		}
		System.out.println(stk.pop());
	}
}