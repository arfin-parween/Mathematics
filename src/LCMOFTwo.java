import java.util.Scanner;

public class LCMOFTwo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b= sc.nextInt();
        int output =euclidSolution2(a,b);
        System.out.println("LCM of numbers are " + (a*b)/output);
    }
    // Gcd have TC=O(min(a,b)) and SC=O(1)
    static  int gcd(int a, int b){
        int min =Math.min(a,b);
        int result=1;
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                result= i;
            }
        }
        return result;
    }
    // for euclidSolution1, TC=O(log(min(a,b))) and SC=O(1)
    static int euclidSolution1(int a,int b){
        int min =Math.min(a,b);
        int max= Math.max(a,b);
        if(a==b) return a;
        else return euclidSolution1(max-min, min);
    }
    // for euclidSolution2, TC=O(log(min(a,b))) and SC=O(1)
    static int euclidSolution2(int a, int b){
        if(b==0) return a;
        else return euclidSolution2(b, a%b);
    }
}
