import java.util.*;
public class Main
{
  static int[] quicksort (int[]arr, int start, int end)
  {
	int left = start;
	int right = end;
	int pivot = left;
	int temp = 0;
	if (start < end)
	  {
		while (left != right)
		  {

			if (arr[pivot] > arr[right])
			  {
				temp = arr[right];
				arr[right] = arr[pivot];
				arr[pivot] = temp;
				pivot = right;
			  }
			else if (arr[pivot] < arr[left])
			  {
				temp = arr[left];
				arr[left] = arr[pivot];
				arr[pivot] = temp;
				pivot = left;
			  }
			else if (arr[pivot] >= arr[left] && pivot != left)
			  {
				left++;
			  }
			else if (arr[pivot] <= arr[right] && pivot != right)
			  {
				right--;
			  }
		  }
		if (pivot - 1 > 0)
		  arr = quicksort (arr, 0, pivot - 1);
		if (pivot + 1 < arr.length)
		  arr = quicksort (arr, pivot + 1, end);
	  }
	return arr;
  }
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	int n = sc.nextInt ();
	int arr[] = new int[n];
	for (int i = 0; i < n; i++)
	  {
		arr[i] = sc.nextInt ();
	  }
	arr = quicksort (arr, 0, n - 1);
	for (int i = 0; i < n; i++)
	  {
		System.out.print (arr[i] + " ");
	  }
  }

}