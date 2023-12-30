import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to find its factorial");
        int a = sc.nextInt();
        System.out.println("Factorial of number is " + recursiveSolution(a));

    }
    // for iterativeSolution, TC= O(n), SC=O(1)
    static long iterativeSolution(int n){
        long result=1;
        for(int i=1;i<=n;i++){
            result =result*i;
        }
        return result;
    }
    // for recursiveSolution, T(n)= T(n-1)+1, TC=O(n) and SC=O(1)
    static long recursiveSolution(int n){
        if(n==0) return 1;
        else return n*recursiveSolution(n-1);
    }
}
