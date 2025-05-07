//StarPattern.java
//to print rightangle trianle star patter

import java.util.Scanner;
public class StarPattern{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number :");
		int num = input.nextInt();
		for(int c=1;c<=num;c++){
			for(int j=1;j<=c;j++){
				System.out.println("*");
			}
			System.out.println();
		}
		input.close();

	}
}