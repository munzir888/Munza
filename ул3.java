import java.util.Scanner;

public class ул3 {
    public static void main(String[] args) {


        chisla();


    }
    static void chisla (){
        Scanner sc = new Scanner(System.in);
        int chislo = sc.nextInt();
        String w = Integer.toString(chislo);
        char [] ar = w.toCharArray();
        for (int i = 0; i < ar.length; i++) {
            // это чтобы было точь в точь как на напримеры
            if(i==0){
                System.out.println(ar[i]+"  ");
            }else {
                System.out.println(" "+ar[i] + "  ");
            }
        }



    }
    }

