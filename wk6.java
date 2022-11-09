import java.util.Random;

public class wk6 {
    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        int c = 0;
        Random r = new Random();
        int[][] v = new int[a][b];



        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                v[i][j] = r.nextInt(10);
                System.out.print(v[i][j] + " ");
            }
            System.out.println("  ");
        }
        System.out.println();
        for (int i = 0; i < a; i++) {
            c=0;
            for (int j = 0; j < b; j++) {
                if (c < v[i][j]) {
                    c = v[i][j];
                }


            }
            for (int k = 0; k < v[i].length; k++) {
                if (v[i][k] == c) {
                    v[i][k] = v[i][0];
                    v[i][0] = c;
                }
            }


        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <b ; j++) {
                System.out.print(v[i][j]+" ");

            }
            System.out.println();
        }

    }}

