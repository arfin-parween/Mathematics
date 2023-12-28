import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer to print its sum of digit");
        int a = sc.nextInt();
        System.out.println("Sum of digits of number is " + solution(a));
    }
    // solution have TC =O(n), n= no. of digits in a number and SC= O(1)
    static  int solution(int a){
        int sum=0;
        while(a!=0){
            int rem;
            rem = a%10;
            sum=sum+rem;
            a=a/10;
        }
        return  sum;
    }
}
