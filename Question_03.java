//Question_03.java
// to display the days in a month for every month using switch case 

import java.util.Scanner;

public class Question_03{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Month no: ");
        int num = input.nextInt();
        switch(num){
            case 1 :{
                System.out.println("January : 31Days");
            }break;
            case 2 :{
                System.out.println("Feburuary : 28Days");
            }break;
            case 3 :{
                System.out.println("March : 31Days");
            }break;
            case 4 :{
                System.out.println("Aprial : 30Days");
            }break;
            case 5 :{
                System.out.println("May : 31Days");
            }break;
            case 6 :{
                System.out.println("June : 30Days");
            }break;
            case 7 :{
                System.out.println("July : 31Days");
            }break;
            case 8 :{
                System.out.println("August : 31Days");
            }break;
            case 9 :{
                System.out.println("September : 30Days");
            }break;
            case 10 :{
                System.out.println("October : 31Days");
            }break;
            case 11 :{
                System.out.println("November : 30Days");
            }break;
            case 12 :{
                System.out.println("December : 31Days");
            }break;
            default : {
                   System.out.println("Zero Days");
            }
        }
        System.out.println("End of the Program!!!");
	}
} 