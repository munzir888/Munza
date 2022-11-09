import java.util.Random;
import java.util.Scanner;

public class homeWork5 {
    public static void main(String[] args) {
    // следующие три строки для того ,  чтобы если мы хотели брать цифры от юзера )
//  Scanner sc = new Scanner(System.in);
//    int a1 = sc.nextInt();
//  int b1 = sc.nextInt();
Random ra = new Random();



        int a = 6;
        int b = 7;
        int maxe = 0;


        int[][] array = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = ra.nextInt(9)+1 ;
            }
        }
        for (int i = 0; i < a; i++) {

            for (int j = 0; j < b; j++) {
                if (array[i][j] > maxe){
                    maxe = array[i][j];


                }
                }

        }
        for (int i = 0; i < a; i++) {

            System.out.print("naebolshyi element etoy stroki :" + maxe + "      ");

            for (int j = 0; j < b; j++) {

                System.out.print(array[i][j] + " ");


            }

            System.out.println();
        }





    }
}
