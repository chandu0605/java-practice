//NumberSeries_03.java
//To display the sequence of even numbers of the number using NumberSeries_03
import java.util.Scanner;
public class NumberSeries_03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = input.nextInt();
		for (int c=1;(c<=num);c++){
			if(c%2==0){
				System.out.println("The Even Number is :"+c);
			}
		}

		// Odd Numbers
		for ( int c=1;c<=20;c++){
			if(c%2==1){
				System.out.println("The Odd Number is : "+c);
			}
		}
		System.out.println("Program Executed!!!");
	}
}


