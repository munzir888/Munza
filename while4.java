import java.util.Scanner;

public class while4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "napishi chislo ");
        int n = scanner.nextInt();
        int count=0 ;
        if (n>1000000){
            System.out.println( "vashe chislo bolshe 1 m !");
return ;
        }
        while (n>0){
            n/=10;
            count++;
        }
        System.out.println(count);
    }
}
