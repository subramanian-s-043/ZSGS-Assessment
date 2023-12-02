package assesment1;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String"); 
		String input=sc.nextLine();
		String output="";
		for(int i=0;i<input.length();i++)
		{
			int count=1;
			char temp=input.charAt(i);
			for(int j=0;j<input.length();j++)
			{
				if(i!=j)
				{
					char temp1=input.charAt(j);
					if(temp==temp1)
					{
						count++;
					}
				}
			}
			output+=String.valueOf(temp)+String.valueOf(count);
		}
		System.out.println(output);
	}

}

//->merry [m1e1r2y1]