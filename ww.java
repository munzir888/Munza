import java.util.Random;
import java.util.Scanner;

public class ww {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" a two   number ");
//        int c = 0 ;
//        int b1 = sc.nextInt();
//        int b2 = sc.nextInt();
//        int b3 = sc.nextInt();
//        int b4 = sc.nextInt();
//        int b5 = sc.nextInt();
//        int b6 = sc.nextInt();
//        int b7 = sc.nextInt();
//        int b8 = sc.nextInt();
//        int b9 = sc.nextInt();
//        int b10 = sc.nextInt();
//        for (int i = 0; i <10 ; i++) {
//
//        }



//        Random r = new Random();
//        int w = 10;
//        int c = 0 ;
//      int[]v=new int[w];
//        for (int i = 0; i < w; i++) {
//            v[i]=r.nextInt(50)+50;
//
//        }
//        for (int i = 0; i <v.length ; i++) {
//            if(v[i]%3==0){
//                System.out.println(v[i]);
//
//            }
//            c+=v[i];
//        }
//        System.out.println("summa :"+c);4


//int a = 5 ;
//int b =10;
//int c = 0 ;
//Random r = new Random();
//     int[][]v= new int[a][b];
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < b; j++) {
//                v[i][j]=r.nextInt(100);
//
//            }
//        }
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < b; j++) {
//                c+=v[i][j];
//
//            }
//        }
//        System.out.println("summa vsey matritcy"+c);
//          String s ;
//        for (int i = 0; i < a; i++) {
//            int maxEl = 0;
//            for (int j = 0; j < b; j++) {
//                if (maxEl < v[i][j]) {
//                    maxEl = v[i][j];
//                }
//            }
//            for (int k = 0; k < v[i].length; k++) {
//                if (v[i][k] == maxEl) {
//                    v[i][k] = v[i][0];
//                    v[i][0] = maxEl;
//                }
//            }
//
//        }
//        Random r = new Random();
//        int w = 10;
//        double c = 0 ;
//        int[]v=new int[w];
//        for (int i = 0; i < w; i++) {
//            v[i]=r.nextInt(50)+50;
//
//        }
//        for (int i = 0; i <v.length ; i++) {
//            if(v[i]%3==0){
//                System.out.println(v[i]);
//
//            }
//            c+=v[i];
//        }
//        System.out.println("summa :"+c);

   Scanner sc = new Scanner(System.in);
        int c = 0 ;
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();
        int b4 = sc.nextInt();
        int b5 = sc.nextInt();
        int b6 = sc.nextInt();
        int b7 = sc.nextInt();
        int b8 = sc.nextInt();
        int b9 = sc.nextInt();
        int b10 = sc.nextInt();
        for (int i = 0; i <10 ; i++) {

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 10 чисел");
        int a = scanner.nextInt();
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int a4 = scanner.nextInt();
        int a5 = scanner.nextInt();
        int a6 = scanner.nextInt();
        int a7 = scanner.nextInt();
        int a8 = scanner.nextInt();
        int a9 = scanner.nextInt();
        int[] num = {a, a1, a2, a3, a4, a5, a6, a7, a8, a9};
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if(num[i] > count) {
                count = num[i];
            }
        }
        System.out.println("Максимальный элемент: " + count);
    }


}
