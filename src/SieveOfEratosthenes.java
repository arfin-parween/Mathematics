import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number to print prime Numbers : ");
        int a= sc.nextInt();
        System.out.print("Prime Number till " +a + " are : ");
        sieve_of_eratosthenes(a);
    }
    //for prime function, TC=O(sqrt(n)) and SC=O(1)
    static boolean prime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    // for alternate_solution function, TC=O(n*sqrt(n)) and SC=O(1)
    static void alternate_solution(int n){

        for(int i=2;i<=n;i++){
            if(prime(i)) System.out.print(i+" ");
        }
    }
    //for sieve_of_eratosthenes, TC=O(n*loglogn) and SC=O(n)
    static void sieve_of_eratosthenes(int n){
        boolean[] isPrime= new boolean[n+1];
        for(int i=2;i<=n;i++){
            isPrime[i]=true;
        }
        for(int i=2;i*i<=n;i++){
            for(int j=i*i;j<=n;j+=i){
                isPrime[j]=false;
            }
        }
        for(int i=2;i<=n;i++){
            if(isPrime[i])
                System.out.print(i+" ");
        }
    }
}
