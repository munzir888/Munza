import java.util.Random;
import java.util.Scanner;

public class мартрицы8 {
    public static void main(String[] args) {
//        int size = 10 ;
//        int [] S = new int[size];
//        Random r = new Random() ;
//        for (int i = 0; i < size; i++) {
//            S[i] = r.nextInt(10);
//
//        }
//        for (int i = 0; i < size; i++) {
//            if(S[i]%2==0){
//                System.out.println(S[i]);
//            }
//
//        }
//
//
//       for (int i = 1; i < 10; i++) {
//
//            for (int j = 0; j < 10; j++) {
//                System.out.printf(" %d* %d = %d\n",i,j,i*i);
//            }
//            System.out.println();
//        }


        //Shift + F6 rename all occurences of a variable name// меняет название переменной массово

        //для каждого число от 2 до 1000
//        for (int num = 2; num <= 1000; num++) {
//            //возьми число
//            System.out.println("num = "+num);
//            int count=0;
//int r = 2 ;
//            //посчитать на сколько чисел меньше чем делиться num от 2х до num-1
//
//                if(num%r==0){
//                    count++;
//                }
//            r++;
//
//            if(count == 0){
//                System.out.println(num + " = простое число");
//            }
//        }
//Shift + F6 rename all occurences of a variable name// меняет название переменной массово

        //для каждого число от 2 до 10
//        for (int num = 2; num <= 10; num++) {
//            //возьми число
//            System.out.println("num = "+num);
//            int count=0;
//
//            //посчитать на сколько чисел меньше чем делиться num от 2х до num-1
//            for (int j = 2; j < num; j++) {
//                if(num%j==0){
//                    count++;
//                }
//            }
//
//            if(count == 0){
//                System.out.println(num + " = простое число");
//            }
//        }
//        for (int i = 10; i >= 1; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        Random random= new Random();
//        int[][] A = new int[3][6];
//        int sum=0;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 6; j++) {
//                A[i][j] = random.nextInt(20)+1;
//            }
//        }
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 6; j++) {
//                sum += A[i][j];
//            }
//        }
//        double average = (double)sum / 18;
//        System.out.printf("%.2f\n",average);


//        Random r = new Random();
//        System.out.println("krch pishi dva chisla :");
//
//        Scanner sc = new Scanner(System.in);
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//       int[][]a= new int[b][c];
//double res =0;
//        for (int i = 0; i < b; i++) {
//            for (int j = 0; j < c; j++) {
//                a[b][c]=r.nextInt(20)+1;
//                res +=a[b][c];
//            }
//
//
//
//            }
//
//
//        System.out.println(res);
//        Scanner sc = new Scanner(System.in);
//        Random r = new Random();
//        System.out.println("napishi dva chisla");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int[][] m = new int[a][b];
//        for (int s = 0; s < a; s++) {
//            for (int j = 0; j < b; j++) {
//                m[s][j] = r.nextInt(a) + b;
//
//            }
//
//        }
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < b; j++) {
//                System.out.print(m[i][j] + " ");
//            }
//            System.out.println();
//        }
//        int bu = 0 ;
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j <b ; j++) {
//                bu +=m[i][j];
//            }
//            System.out.println("summa "+i+"stroka"+bu);
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Размер массива");
        int a = sc.nextInt();
        int b = sc.nextInt();
// объявляем и инициализуем размер двумерный массив
        int[][] array = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] =  (int) (Math.random() * b - (a -1)) + a;
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int sumOfLine = 0;
        for(int j = 0; j < b; j++){
            for (int i = 0; i < a; i++){
                sumOfLine += array[i][j];
        }
            System.out.println( "summa " + (j +1) + " stroka: " + sumOfLine);
            sumOfLine = 0;
            }


        }
    }

//for (int i = 0; i < a; i++)
// (int j = 0; j < b; j++)
// герберт шилдт (полное руководство)
// филосовия джава