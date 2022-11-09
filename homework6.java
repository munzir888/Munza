import java.util.Random;

public class homework6 {
    public static void main(String[] args) {
main1();


        }
    static void main1() {

        Random r = new Random();
        int size = 10;
        int c =0 ;
        int[] w = new int[size];
        for (int i = 0; i < w.length; i++) {
            w[i] = r.nextInt(50);
        }

        for (int i = 0; i < w.length; i++) {
            System.out.print(w[i] + " ");
        }
        System.out.println();
        //System.out.println(" u etih chisel est pohozhie :");
        for (int i = 0; i < w.length; i++) {
            for (int j = i + 1; j < w.length; j++) {
                if (w[i] == w[j]) {
                    c++;
                    System.out.print(w[j] + " ");

                }
            }

        }
         if(c>0){
             System.out.println( " u etih chisel est pohozhie ");
         }else {
             System.out.println(" netu pohozhie chisla ");
         }

    }}