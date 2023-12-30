import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check it is palindrome or not");
        int a = sc.nextInt();
        if (solution(a))
            System.out.println("The Number is Palindrome");
        else
            System.out.println("The Number is Not Palindrome");
    }
    //TC=O(n), n=no. of digits and SC=O(1)
    static boolean solution(int a){
        int rev=0;
        int temp=a;
        while(temp!=0){
            int LastDigit=temp%10;
            rev=rev*10+LastDigit;
            temp=temp/10;
        }
        return a == rev;
    }
}
