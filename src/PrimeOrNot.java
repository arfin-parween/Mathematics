import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check it is prime or not");
        int a= sc.nextInt();
        if(solution2(a)) System.out.println("Number is Prime");
        else System.out.println("Number is not Prime");
    }
    // for solution1, TC=O(n), SC=O(1)
    static  boolean solution1(int n){
        if(n<=1) return false;
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    // for solution2. TC=O(sqrt(n)), SC=O(1)
    static  boolean solution2(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

}
