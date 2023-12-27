import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a= sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b =sc.nextInt();
        System.out.println("Enter 3rd Number");
        int c = sc.nextInt();
        int output =Solution(a,b,c);
        System.out.println("Maximum is " + output);

    }
    static int Solution(int num1, int num2, int num3){
        if(num1>num2 && num1>num3) return  num1;
        else if (num2> num1 && num2>num3)  return  num2;
        else return num3;


    }
}
