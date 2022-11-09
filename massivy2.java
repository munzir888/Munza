import java.util.Arrays;
import java.util.Random;



public class massivy2 {
    public static void main(String[] args) {

        Random r = new Random();
        int [] n = new int[20] ;
        for (int i = 0; i < 20; i++) {
            n[i] = r.nextInt(100)+0;
        }
     double res = 0;
        System.out.println( Arrays.toString(n));
        for (int i = 0; i < 20; i++) {
           if (n[i] >50){
               res += n [i];
           }





            res +=n [i];

        }
        System.out.println( res /100);


//         int x,y;
//         int z = r.nextInt( 10)+10;
////         x = r.nextInt();
////        y = r.nextInt();
////        System.out.println(x);
////        System.out.println(y);
//        System.out.println(z);
    }}
