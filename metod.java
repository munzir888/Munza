import java.util.Random;
import java.util.Scanner;

public class metod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][]arr= new int[a][b];
        sum(a,b,arr);
        sum1( a , b , arr);
    }
    static void sum(int a ,int b,int[][] arr){
        Random  r = new Random();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j]=r.nextInt(b)+a;

            }

        }

    }
    static void sum1(int a ,int b ,int[][] arr){
        for (int i = 0; i < a; i++) {
        for (int j = 0; j < b; j++) {
        System.out.print(arr[i][j] + " ");

        }
        System.out.println();
        }

        }
}








// генерируете


//   for (int i = 0; i < a; i++) {
//        for (int j = 0; j < b; j++) {
//        System.out.print(arr[i][j] + " ");
//
//        }
//        System.out.println();
//        }






