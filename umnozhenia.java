import java.util.Scanner;

public class umnozhenia {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i < 10; i++) {
//            System.out.println(n+" * "+i+"="+(n*i));
//
//
//
//        }
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i <= m; i++) {

            for (int j = 0; j <=10; j++) {
                System.out.printf(" %d* %d = %d\n",i,j,j*i);
            }
            System.out.println();
        }


        }
}
