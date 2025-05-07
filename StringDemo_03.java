// StringDemo_03.java
//To display the string in the reverse order

import java.util.Scanner;

public class StringDemo_03{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the String: ");
		String name = input.nextLine();
		int length = name.length();
		

		for (int b=length-1;b>=0;b--){
			System.out.print(name.charAt(b));
		}
		System.out.println();
		System.out.println("End of the program....");
	}
}