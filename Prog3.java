//Prog3.java
//console input
import java.util.Scanner;

public class Prog3{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("ENter name ");
		String name = in.next();
		System.out.print("Enter sl. no. ");
		int slno = in.nextInt();
		System.out.print("Enter height ");
		double height = in.nextDouble();

		System.out.println("Enter Name "+name+" Sl. no "+slno+" height 	"+height);
	}
} 