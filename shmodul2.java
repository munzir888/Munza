import java.util.Random;
import java.util.Scanner;

public class shmodul2 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите 10 чисел");
//        int a = scanner.nextInt();
//        int a1 = scanner.nextInt();
//        int a2 = scanner.nextInt();
//        int a3 = scanner.nextInt();
//        int a4 = scanner.nextInt();
//        int a5 = scanner.nextInt();
//        int a6 = scanner.nextInt();
//        int a7 = scanner.nextInt();
//        int a8 = scanner.nextInt();
//        int a9 = scanner.nextInt();
//
//        int[] num = {a, a1, a2, a3, a4, a5, a6, a7, a8, a9};
//        int count = 0;
//        for (int i = 0; i < num.length; i++) {
//            if(num[i] > count) {
//                count = num[i];
//            }
//        }
//        System.out.println("Максимальный элемент: " + count);


        // 5oe задание
//                Random r = new Random();
//        int w = 10;
//        double c = 0 ;
//        double sr = 0;
//        int[]v=new int[w];
//        for (int i = 0; i < w; i++) {
//            v[i]=r.nextInt( 50)+50;
//
//        }
//        for (int i = 0; i <v.length ; i++) {
//            if(v[i]%3==0){
//                System.out.println(v[i]);
//                c+=v[i];
//            }
//
//        }
//        sr = c/50;
//        System.out.println("summa :"+c);
//        System.out.println("sr :"+sr);
//
//
//        double []q= new double[5];
//        int sr = 0;
//        Random r = new Random();
//        int [][]w=new int[5][10];
//        for (int i = 0; i < w.length; i++) {
//            for (int j = 0; j < w.length; j++) {
//                w[i][j]=r.nextInt(100);
//                System.out.print(w[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//        for (int i = 0; i < w.length; i++) {
//            for (int j = 0; j < w.length; j++) {
//
//               sr+=w[i][j];
//            }
//        }
//        System.out.println(" srednoe "+sr/50);
//
//
//        sr=0;
//        for (int i = 0; i <5; i++) {
//            for (int j = 0; j <10; j++) {
//
//                sr+=w[i][j];
//            }
//            System.out.println(" srednoe z. k. s.:"+i+": "+(double)sr/10);
//
//        }
//

        int []w=new int[20];
        for (int i = 0; i < 20; i++) {
            if(i==0||i==1){
                w[i]=1;
            }
            if(i==2){
                w[i]=1;
            }else if(i==2){
                w[i]=w[0]+w[1];
            }else {
                w[i] = w[i-1] + w[i-2];
            }
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(w[i]+" ");
        }
        // задание 5

            Random random = new Random();
            int[] massiv = new int[10];
            for (int i = 0; i < massiv.length; i++) {
                massiv[i] = random.nextInt(100);
                System.out.print(massiv[i] + " ");
            }
            System.out.println();
            System.out.println("Числа кратные к 3:");
            for (int i = 0; i < massiv.length; i++) {
                if (massiv[i] % 3 == 0)
                    System.out.print(massiv[i] + " ");
            }
            System.out.println();
            System.out.print("Среднее арифметическое: ");
            int buffer = 0;
            for (int i = 0; i < massiv.length; i++) {
                buffer = buffer + massiv[i];
            }

            System.out.println( (double)(buffer / massiv.length));
            System.out.println( "Сумма элементов массива " + buffer);

            System.out.println("Массив: ");
            for (int i = 0; i < massiv.length; i++) {
                System.out.print(massiv[i] + " ");
            }

        // задание 7

        Random r = new Random();
        int[][] way = new int[5][10];
        double[] mass = new double[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                way[i][j] = r.nextInt(100);
                System.out.print(way[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int accum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                accum = accum + way[i][j];
            }
        }
        System.out.println("среднее арифметическое значение всей матрицы: " + accum / way.length);

        accum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                accum = accum + way[i][j];
            }
            System.out.println("среднее арифметическое значение строки номер  "
                    + " " + i + " : " + (double)accum/10);
            mass[i] = (double)accum/10;
            accum = 0;
        }

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }

//задание  9
        Random ran3 = new Random();

        int[] massiv9 = new int[20];
        for (int i = 0; i < 10; i++) {
            if (i == 0 || i == 1) {
                massiv9[i] = 1;
            } else if (i == 2) {
                massiv9[i] = massiv9[0] + massiv9[1];
            } else {
                massiv9[i] = massiv9[i - 1] + massiv9[i - 2];
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(massiv9[i] + " ");
        }

        }
    }

