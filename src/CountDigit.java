import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer to count its digit");
        int a = sc.nextInt();
        System.out.println("Number of Digits is " +solution2(a));

    }
    // solution1 have TC= O(n), n= no. of digits and SC=O(1)
    static int solution1(int a){
        int count=0;
        while(a!=0){
            a=a/10;
            count =count+1;
        }
        return  count;
    }
    // solution2 have TC=O(1) and SC=O(1)
    static int solution2(int a){
        String s = Integer.toString(a);
        return s.length();
    }
}
