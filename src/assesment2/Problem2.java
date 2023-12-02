package assesment2;

import java.util.Scanner;

public class Problem2 {
	
	public void getInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Rows:");
		int row=sc.nextInt();
		System.out.println("Enter Number of column:");
		int col=sc.nextInt();
		int[][] inputMatrix=new int[row][col];
		int[][] output;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("Enter the Value of ("+(i+1)+","+(j+1)+") :");
				inputMatrix[i][j]=sc.nextInt();
			}
		}
		if(row==col)
		{
			output=squareTranspose(inputMatrix,row,col);
		}else {
			output=squareTranspose(inputMatrix,row,col);
		}
		for(int[] oneDimension: output)
		{
			for(int value:oneDimension)
			{
				System.out.print(value+" ");
			}
			System.out.println();
		}
	}
	
	public int[][] squareTranspose(int[][] inputMatrix,int row,int col)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=i+1;j<col;j++)
			{
				int temp=inputMatrix[j][i];
				inputMatrix[j][i]=inputMatrix[i][j];
				inputMatrix[i][j]=temp;
			}
		}
		return inputMatrix;
	}
	
//	public int[][] transpose(int[][] inputMatrix,int row,int col)
//	{
//		int[][] outputMatrix=new int[col][row];
//		int startRow=0;
//		int startCol=0;
//		for(int i=0;i<row;i++)
//		{
//			for(int j=0;j<col;j++)
//			{
//				outputMatrix[j][i]=inputMatrix[startRow][startCol];
//				startCol++;
//			}
//			startRow++;
//		}
//		return outputMatrix;
//	}
	public static void main(String[] args)
	{
		Problem2 start=new Problem2();
		start.getInput();
	}
}
