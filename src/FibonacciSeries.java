import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to print fibonacci series");
        int a= sc.nextInt();
        solution(a);
    }
    static void solution(int n){
        int n1=0;
        int n2=1;
        System.out.print("Fibonacci Series Upto " + n + " terms: ");
        for(int i=1;i<=n;i++){
            System.out.print(n1+ ", ");
            int nextTerm= n1+n2;
            n1=n2;
            n2=nextTerm;
        }
    }
}
