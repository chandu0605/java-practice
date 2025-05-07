import java.util.Scanner;

public class Marks{
    public static void main(String[] args) {
        //Area of the Rectangle
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length of the Rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Bredth of the rectangle: ");
        double breadth = scanner.nextDouble();
        double area = length*breadth;
        System.out.println("Area of the Rectangle: " + area);
        
------------------------

        //Area and Perimeter of the circle
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter Radius of te Circle: ");
        int r = scanner1.nextInt();
        double circleArea = Math.PI*Math.pow(r, 2);
        double circlePerimeter = 2*Math.PI*r;

        System.out.println("Area of the Circle: " +circleArea);
        System.out.println("Perimeter  of the Circle: " +circlePerimeter);

--------------------------------        

        // Input principal, rate, and time
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Annual Interest Rate (in %): ");
        double rate = scanner.nextDouble(); 

        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();

        System.out.print("Enter Number of Times Interest Compounded Per Year: ");
        int n = scanner.nextInt();

        // Convert rate to decimal
        double d = rate/100;


---------------------


        // Calculate Simple Interest
        double simpleInterest = principal * r * time;
        double simpleTotal = principal + simpleInterest;


---------------------


        // Calculate Compound Interest
        double compoundTotal = principal * Math.pow((1 + (r / n)), (n * time));
        double compoundInterest = compoundTotal - principal;

       
        System.out.println("\nSimple Interest: " + simpleInterest);
        System.out.println("Total Amount with Simple Interest: " + simpleTotal);
        System.out.println("Compound Interest: " + compoundInterest);
        System.out.println("Total Amount with Compound Interest: " + compoundTotal);


--------------------


       Scanner scanner3 = new Scanner(System.in);
       System.err.println("Marks: ");
       int marks = scanner3.nextInt();
       if(marks>=90){
             System.out.println("Grade A+");
       }
       else {
           if(marks>=80){
                 System.out.println("Grade A");
               }
            else{
                if(marks>=70){
                    System.out.println("Grade B");
                   }else{
                       if(marks>=60){
                        System.out.println("Grade B+");
                            }
                            else{
                                if(marks>=50){
                                    System.out.println("Grade C");
                                }
                                else{
                                    if(marks>=40){
                                        System.out.println("Grade D");
                                    }
                                     else{
                                        System.out.println("Fail");
                                     }
                                }
                            }
                        }
                }
           }

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Enter bill amount: ");
        int bill = scanner.nextInt();
        if (bill>=5000) {
            double b = bill*0.05;
            System.out.println("Discount: " +b);
        }else{
            System.out.println("No Discount");
        }


    }
}