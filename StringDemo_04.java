// StringDemo_04.java
//To display the concation of 2strings and to display it in the reverse order

import java.util.Scanner;

public class StringDemo_04{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the String: ");
		String name1 = input.nextLine();

		System.out.print("Enter the String: ");
		String name2 = input.nextLine();
		
		//String full_name = name1+" "+name2;
		String full_name = name1.concat(" ").concat(name2);

		
		System.out.println(full_name);


		int length = full_name.length();

		System.out.print("Reverse order of the String is: ");

		for (int a=length-1;a >= 0;a--){

			System.out.print(full_name.charAt(a));
		}
		System.out.println();
		System.out.println("End of the program....");

		// Comparition of 2 strings

		int num = name1.compareTo(name2);
		System.out.println("Comparision of 2 strings: "+num);
		System.out.println("End of the program....");
	}
}


