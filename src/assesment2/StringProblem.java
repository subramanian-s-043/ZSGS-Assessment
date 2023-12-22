package assesment2;

import java.util.Scanner;

public class StringProblem {
	public static void main(String[] args) {
		StringProblem start=new StringProblem();
		start.getInput();
	}
	private void getInput() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input=scanner.next();
		print(input);
	}
	private void print(String input) {
		String[] split=new String[2];
		int j=0;
		String temp="";
		for(int i=0;i<input.length();i++) {
			if(Character.isUpperCase(input.charAt(i)) && temp!="" || i==input.length()) {
				split[j]=temp;
				temp="";
				j++;
				i=i-1;
			}else {
				temp+=String.valueOf(input.charAt(i));
			}
		}
		split[j]=temp;
		split[0]=split[0].toUpperCase();
		split[1]=split[1].toUpperCase();
		j=0;
		String a="";
		String b="";
		while(j<split[0].length() || j<split[1].length()) {
			if(j<split[0].length())
				a+=String.valueOf(split[0].charAt(j));
			if(j<split[1].length()) {
				b+=String.valueOf(split[1].charAt(j));
			}
			System.out.println(a+b);
			j++;
		}
		
	}
}
