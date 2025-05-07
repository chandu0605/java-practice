//NumberSeries_05.java
//To display the various entries uaing for loop
//To display the sum of even entrys using break and continue statements

import java.util.Scanner;

public class NumberSeries_05{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter no.of Entities : ");
		int num = input.nextInt();
		int sum = 0;
		for (int c=1;c<=num;c++){
			System.out.print("Entry :");
			int entry = input.nextInt();
			if(entry == 0){
				break;
			}
			if(entry < 0){
				continue;
			}
			sum += entry;
		}
		System.out.println("The Sum of Even Entry is : "+sum);
		System.out.println("Program Executed !!!");
	}
}