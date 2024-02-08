import java.util.*;
class NQ
  {
	int board[][];
	  NQ (int n)
	{
	  this.board = new int[n][n];
	    System.out.println (solveNQ (board, n, 0));
	    print (n);
	}
	boolean checkSafe (int[][]board, int n, int row, int col)
	{
	  int i, j;
	  for (j = 0; j < col; j++)
		{
		  if (board[row][j] == 1)
			return false;
		}
	  for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
		{
		  if (board[i][j] == 1)
			return false;
		}
	  for (i = row, j = col; i < n && j >= 0; i++, j--)
		{
		  if (board[i][j] == 1)
			return false;
		}
	  return true;

	}
	boolean solveNQ (int[][]board, int n, int col)
	{
	  if (col >= n)
		{
		  return true;
		}
	  for (int i = 0; i < n; i++)
		{
		  if (checkSafe (board, n, i, col))
			{
			  board[i][col] = 1;
			  if (solveNQ (board, n, col + 1))
				{
				  return true;
				}
			  board[i][col] = 0;
			}
		}
	  return false;
	}
	void print (int n)
	{
	  for (int i = 0; i < n; i++)
		{
		  for (int j = 0; j < n; j++)
			{
			  System.out.print (board[i][j] + " ");
			}
		  System.out.println ();
		}
	}
  }
public class Main
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	int n = sc.nextInt ();
    NQ nq=new NQ(n);
  }
}