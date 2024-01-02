import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to check it is Armstrong or not");
        int a= sc.nextInt();
        System.out.println(solution(a));

    }
    // TC =O(n), n is no. of digits and SC=O(1)
    static boolean solution(int a){
        int temp =a;
        int original=a;
        int count =0;
        while (a!=0){
            a=a/10;
            count=count+1;
        }
        int sum=0;
        while (temp!=0){
            int rem= temp%10;
            sum+= Math.pow(rem,count);
            temp =temp/10;
        }
        return original==sum;
    }
}
