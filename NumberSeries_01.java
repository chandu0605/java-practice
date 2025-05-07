// NumberSeries_o1.java
//To display the sequence of numbers in increment order using NumberSeries_01
import java.util.Scanner;

public class NumberSeries_01{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = input.nextInt();

		for (int c=0;c<=num;c++){
			System.out.println("The value of c is : "+c);
		}
		System.out.println("Program Executed !!!");
	}
}