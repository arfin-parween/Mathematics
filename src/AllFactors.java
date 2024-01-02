import java.util.Scanner;

public class AllFactors {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to print all its Factor");
        int a =sc.nextInt();
        optimalSolution(a);
    }
    // for solution, TC=O(n), SC=O(1)
    static void solution(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0) System.out.print(i +", ");
        }
    }
    // for optimalSolution, TC=O(sqrt(n)), SC=O(1)
    static void optimalSolution(int n){
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(i==n/i) System.out.print(i+", ");
                else System.out.print(i + ", "+ n/i +", ");
            }
        }
    }
}
