import java.util.Scanner;
// Program for simple calculator

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st Integer");
        int a= sc.nextInt();
        System.out.println("Enter 2nd Integer");
        int b =sc.nextInt();
        System.out.println("Addition is " + (a+b));
        System.out.println("Subtraction is " +(a-b));
        System.out.println("Multiplication is " + (a*b));
        System.out.println("Division is "+ (a/b));
    }
}
