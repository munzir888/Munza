import java.util.Random;

public class homework55 {
    public static void main(String[] args) {
        Random r = new Random();
        int a = 6;
        int b = 7;
        int[][] w = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                w[i][j] = r.nextInt(10);
                System.out.print(w[i][j] + " ");
            }
            System.out.println("  ");
        }
        System.out.println();
        for (int i = 0; i < a; i++) {
            int maxEl = 0;
            for (int j = 0; j < b; j++) {
                if (maxEl < w[i][j]) {
                    maxEl = w[i][j];
                }
            }
            for (int k = 0; k < w[i].length; k++) {
                if (w[i][k] == maxEl) {
                    w[i][k] = w[i][0];
                    w[i][0] = maxEl;
                }
            }

        }
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w[i].length; j++) {
                System.out.print(w[i][j] + " ");
            }
            System.out.println();
        }
    }
    }

