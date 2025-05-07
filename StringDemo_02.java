//StringDemo_02.java
// Taking String as user input

import java.util.Scanner;

public class StringDemo_02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the string: ");
		String name = input.nextLine();

		System.out.print("Enter the index value: ");
		int n = input.nextInt();
		char a =name.charAt(n);
		System.out.println(name);
		System.out.println(a);
		System.out.println("End of the program!!! ");


	}
}