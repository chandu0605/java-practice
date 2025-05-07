//NumberSeries_02.java
// To display sequence of numbers in decrement order using NumberSeries_02
import java.util.Scanner;

public class NumberSeries_02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = input.nextInt();
		for (int c=num;c>=1;c--){
			System.out.println("The decrement value of c is :"+c);
		}
		System.out.println("Program Executed!!!");
	}
}