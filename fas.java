import java.util.Scanner;

public class fas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


      int n = sc.nextInt();
      boolean c = print(n);
        System.out.println(n+" is even :"+c);
    }
    static boolean print (int n){
        return n%2==0;
    }
}
