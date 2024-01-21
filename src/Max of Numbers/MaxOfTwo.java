import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a= sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b =sc.nextInt();
        int output = Solution(a,b);
        System.out.println("Maximum is "+ output);
    }
    static int Solution(int num1, int num2){
        if(num1>num2) return num1;
        else return  num2;
    }
}
