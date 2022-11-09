import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int sum = 0;
        double ar = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int w1 = sc.nextInt();
        int w2 = sc.nextInt();
        int w3 = sc.nextInt();
        int w4 = sc.nextInt();
        int w5 = sc.nextInt();
        int[][][][][] v = new int[w1][w2][w3][w4][w5];
// мин элемент
        for (int i = 0; i < w1; i++) {
            for (int j = 0; j < w2; j++) {
                for (int k = 0; k < w3; k++) {
                    for (int l = 0; l < w4; l++) {
                        for (int m = 0; m < w5; m++) {
                            v[i][j][k][l][m] = r.nextInt(100);

                            if (v[i][j][k][l][m] < min) {
                                min = v[i][j][k][l][m];

                            }
                        }

                    }

                }

            }

        }
        // сумма
        for (int i = 0; i < w1; i++) {
            for (int j = 0; j < w2; j++) {
                for (int k = 0; k < w3; k++) {
                    for (int l = 0; l < w4; l++) {
                        for (int m = 0; m < w5; m++) {
                            sum += v[i][j][k][l][m];
                        }

                    }

                }

            }

        }
        //макс эл
        for (int i = 0; i < w1; i++) {
            for (int j = 0; j < w2; j++) {
                for (int k = 0; k < w3; k++) {
                    for (int l = 0; l < w4; l++) {
                        for (int m = 0; m < w5; m++) {
                            if (v[i][j][k][l][m] > max) {
                                max = v[i][j][k][l][m];

                            }

                        }

                    }

                }

            }

        }
        //средное арф

        for (int i = 0; i < w1; i++) {

            for (int j = 0; j < w2; j++) {
                for (int k = 0; k < w3; k++) {
                    for (int l = 0; l < w4; l++) {
                        for (int m = 0; m < w5; m++) {
                            sum += v[i][j][k][l][m];


                        }

                    }

                }

            }

        }
        for (int i = 0; i < w1; i++) {
            for (int j = 0; j < w2; j++) {
                for (int k = 0; k < w3; k++) {
                    for (int l = 0; l < w4; l++) {
                        for (int m = 0; m < w5; m++) {



                        }

                    }

                }

            }

        }
        ar=sum/(w1*w2*w3*w4*w5) ;
        System.out.println("max element"  +max);
        System.out.println("min el   "+min);
        System.out.println("summa  " +sum);
        System.out.println("srednoe ar  "+ar);

    }

    }

