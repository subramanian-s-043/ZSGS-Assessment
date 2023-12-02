package assesment2;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size:");
		int len=sc.nextInt();
		int[] input=new int[len];
		for(int i=0;i<len;i++)
		{
			System.out.println("Enter the value of "+(i+1)+":");
			input[i]=sc.nextInt();
		}
		int max=0;
		int start=0;
		int end=0;
		for(int i=0;i<input.length;i++)
		{
			int temp=0;
			for(int j=i+1;j<input.length;j++)
			{
				temp+=input[j];
				if(Math.max(temp, max)>max)
				{
					max=Math.max(temp, max);
					start=i;
					end=j;
				}
			}
		}
		System.out.println(max);
		System.out.println(start+1);
		System.out.println(end+1);
	}
}
