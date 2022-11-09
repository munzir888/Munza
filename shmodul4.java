import java.util.Scanner;

public class shmodul4 {
    public static void main(String[] args) {
        main1();




    }
    static void main1(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 1 ;
        for (int i = 0; i < b; i++) {
            c*=a;
        }
        System.out.println(c);

    }


    }

