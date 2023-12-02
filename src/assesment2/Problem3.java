package assesment2;

import java.util.Scanner;

public class Problem3 {
	public void getInput()
	{
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String output=findFrequency(input);
		System.out.println(output);
	}
	private String findFrequency(String input) 
	{
		String[] inputArray=input.split(" ");
		String output="";
		for(int i=0;i<inputArray.length;i++)
		{
			String temp=inputArray[i];
			if(!output.contains(temp))
			{
				int freq=0;
				for(int j=0;j<inputArray.length;j++)
				{
					if(temp.equals(inputArray[j]))
					{
						freq++;
					}
				}
				if(output=="")
				{
					output+=temp+"-"+String.valueOf(freq);
				}else
				{
					output+=","+temp+"-"+String.valueOf(freq);
				}
			}
		}
		return output;
	}
	public static void main(String[] args) 
	{
		Problem3 start=new Problem3();
		start.getInput();
	}
}
