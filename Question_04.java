//Question_04.java
//To display the FibonacciSeries 
import java.util.Scanner;

public class Question_04{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int num = input.nextInt();
		System.out.print("Enter the First_Number :");
		int first_number = input.nextInt();
		System.out.print("Enter the Second_Number :");
		int second_number = input.nextInt();

		System.out.println("To display First "+num+" of FabonaciiSeries");
		for (int i=0;i<num;i++){
			System.out.print(first_number+" ");
			int next=first_number+second_number;
			first_number = second_number;
			second_number = next;
		}
		System.out.println("Series completed!!!");


	}
}