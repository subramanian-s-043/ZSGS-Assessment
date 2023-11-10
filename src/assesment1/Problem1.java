package assesment1;
import java.util.Scanner;

public class Problem1 {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[][] pattern= new int[n][n];
	int row=n-1,initial=0,initialCol=0,lastCol=n-1,start=1;
	while(initial<row && initialCol<lastCol)
	{
		for(int i=0;i<=row;i++)
		{
			pattern[i][initialCol+i]=start++;
		}
		
		initialCol++;
		row--;
		for(int i=row;i>=initial;i--)
		{
			pattern[i][lastCol]=start++;
		}
		
		lastCol--;
		for(int i=lastCol;i>initialCol;i--)
		{
			pattern[initial][i]=start++;
		}
		
		initial++;
		row--;
	}
	for(int[] temp : pattern) 
	{
    	for(int i : temp)
    	{
    		if(i!=0)
    		{
    			if(i>=9) {
    				System.out.print(i+" ");
    			}else {
    			System.out.print(i+"  ");
    			}
    	} else{
    		System.out.print("   ");
    	}
    	}
    	System.out.println();
      }
}
}
