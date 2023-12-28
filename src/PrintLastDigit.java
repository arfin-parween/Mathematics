import java.util.Scanner;

public class PrintLastDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an Integer to print its last digit");
        int a =sc.nextInt();
        System.out.println("Last Digit Of Number is " + solution(a));

    }
    static int solution(int a){
        int result;
        result= a%10;
        return result;
    }
}
