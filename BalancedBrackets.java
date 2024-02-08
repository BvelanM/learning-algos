import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String inp=sc.nextLine();
	int flag=0;
	Stack<Character> stk=new Stack<>();
	for (int i=0;i<inp.length();i++){
	    if (inp.charAt(i)=='(' || inp.charAt(i)=='[' || inp.charAt(i)=='{'){
	        stk.push(inp.charAt(i));
	    }
	    else if (inp.charAt(i)==')' || inp.charAt(i)==']' || inp.charAt(i)=='}'){
	        if (inp.charAt(i)==')'){
	            if (stk.peek()=='('){
	                stk.pop();
	            }
	            else{
	                flag=1;
	                break;
	            }
	        }
	        if (inp.charAt(i)==']'){
	            if (stk.peek()=='['){
	                stk.pop();
	            }
	            else{
	                flag=1;
	                break;
	            }
	        }
	        if (inp.charAt(i)=='}'){
	            if (stk.peek()=='{'){
	                stk.pop();
	            }
	            else{
	                flag=1;
	                break;
	            }
	        }
	    }
	    else{
	        flag=1;
	        break;
	    }
	}
	if (flag==1 || !(stk.isEmpty())) System.out.println("Not balanced");
	else System.out.println("Balanced");
	}
}