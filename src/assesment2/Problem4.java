package assesment2;

import java.util.Scanner;

public class Problem4 {
	
	public static void main(String[] args) 
	{
		Problem4 start=new Problem4();
		start.getInput();
	}

	private void getInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1:");
		String str1=sc.next();
		System.out.println("Enter String 2:");
		String str2=sc.next();
		if(str2.length()>str1.length())
		{
			System.out.println(false);
		}
		else
		{
			boolean output=canForm(str1,str2);
			System.out.println(output);
		}
		
	}

	private boolean canForm(String str1, String str2) {
		str1=str1.toLowerCase();
		char[] input=str1.toCharArray();
		String temp="";
		for(int i=0;i<str2.length();i++)
		{
			for(int j=0;j<input.length;j++)
			{
				if(str2.charAt(i)==input[j])
				{
					input[j]=' ';
					temp+=String.valueOf(str2.charAt(i));
				}
			}
		}
		if(temp.equals(str2))
		{
			return true;
		}else
		{
			return false;
		}
	}
}
