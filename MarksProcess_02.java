//MarksProcess_02.java
//ProcessMArks using array
//2. Update the program to use user given elements into the array

import java.util.Scanner;
public class MarksProcess_02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int []marks = new int[5];
		System.out.println("Enter marks below :");
		for(int c=0;c<5;c++){
			marks[c] = input.nextInt();
		}
		System.out.println("Marks :");
		for(int c=0;c<5;c++){
			System.out.println(marks[c]);
		}
		System.out.println("End of the Program!!!");
	}
}