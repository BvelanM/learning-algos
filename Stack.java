import java.util.*;
public class Main
{
     static int pointer=4;
	 static Scanner sc=new Scanner(System.in);
    static int[] push(int[] arr){
        System.out.println("Enter element to push :");
        int tempinp=sc.nextInt();
        arr[pointer]=tempinp;
        // System.out.println(tempinp);
        pointer--;
        return arr;
    }
    static int[] pop(int[] arr){
        if (pointer==4){
            System.out.println("Empty Stack");
        }
        else{
        System.out.println("Element popped : "+arr[++pointer]);
        arr[pointer]=-1;
        }
        return arr;
    }
        static void peek(int arr[]){
        if (pointer==4){
            System.out.println("Empty Stack");
        }
        else{
        System.out.println("Top Element : "+ arr[pointer+1]);
        }
    }
    static void printarr(int[] arr){
        for (int i=pointer+1;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
	public static void main(String[] args) {
		int arr[]=new int[5];
		arr=push(arr);
		printarr(arr);
		arr=push(arr);
		printarr(arr);
		arr=pop(arr);
		peek(arr);
		arr=push(arr);
		printarr(arr);
	}
}