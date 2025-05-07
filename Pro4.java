// Pro4.java
// Operators

public class Pro4 {
    public static void main(String[] args) {

        // Arithmetic operations
        int a = 10;
        int b = 5;

        System.out.println("Addition of a and b is: " + (a + b));
        System.out.println("Subtraction of a and b is: " + (a - b));
        System.out.println("Multiplication of a and b is: " + (a * b));
        System.out.println("Division of a and b is: " + (a / b));
        System.out.println("Modulus of a and b is: " + (a % b));

        //Arthematic assignment operator

        int c=5;
        int d=6;

        System.out.println("Addition assignment is: "+(d+=c));
        System.out.println("Subtraction assignment is: "+(d-=c));
        System.out.println("Multiplication assignment is: "+(d*=c));
        System.out.println("Division assignment is: "+(d/=c));
        System.out.println("modulus assignment is: "+(d%=c));

        // Relational operators

        int e=10;
        int f=11;
        

        System.out.println("realtional equal operator is (==): "+(e==f));
        System.out.println("relational not equal operator is (!=):"+(e!=f));
        System.out.println("relational greaterthan operator is (>):"+(e>f));
        System.out.println("relation lesserthan operator is (<): "+(e<f));
        System.out.println("relational greaterthan or equal to operator is (>=): "+(e>=f));
        System.out.println("relational lesserthan or equal to operator is (<=): "+(e<=f));
        


    }
}
