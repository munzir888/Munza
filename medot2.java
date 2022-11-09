import java.util.Scanner;

public class medot2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q= sc.nextInt();
        int t= sc.nextInt();
        int r= sc.nextInt();
        System.out.println( findSum(q,r,t));
    }

    static int findSum(int a, int b) {
       return a + b;
    }
    static int findSum(int a , int b ,int c){
        return a+b+c;
    }
}
