import java.util.*;
public class Main{
    static Stack<Integer> enqueue(Stack<Integer> stk1,int x){
        Stack<Integer> stk2=new Stack<Integer>();
        while(!(stk1.isEmpty())) stk2.push(stk1.pop());
        stk1.push(x);
        while(!(stk2.isEmpty())) stk1.push(stk2.pop());
        return stk1;
    }
    static Stack<Integer> dequeue(Stack<Integer> stk1){
        if (stk1.isEmpty()) System.out.println("Empty Stack");
        else System.out.println("Popped : " + stk1.pop());
        return stk1;
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Stack<Integer> stk1=new Stack<>();
    int n=sc.nextInt();
    for (int i=0;i<n;i++){
    int x=sc.nextInt();
    stk1=enqueue(stk1,x);
    }
    stk1=dequeue(stk1);
    }
}