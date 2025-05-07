//Stringdemo_01.java

import java.util.Scanner;

public class StringDemo_01{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		String name="Chandu";

		System.out.print("Enter the index: ");
		int n=input.nextInt();
		char a=name.charAt(n);
		System.out.println(name);
		System.out.println(a);
	}
}