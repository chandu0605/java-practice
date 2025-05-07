//Question_01.java
//To find the greatest number of 3 numbers

import java.util.Scanner;

public class Question_01{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the value of a : ");
		int a = input.nextInt();

		System.out.print("Enter the value of b : ");
		int b = input.nextInt();

		System.out.print("Enter the value of c : ");
		int c = input.nextInt();

		if(a>b){
				System.out.println("A is greater number...");
		} else {
			if(b>c){
				System.out.println("B is greater number...");
			} else {
				if(c>a){
					System.out.println("C is greater number...");
				}
				else{
					System.out.println("A is greater number...");
				}
			}
		}
		System.out.println("End of the program...");
	}

}