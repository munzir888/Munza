import java.util.Scanner;

public class homework10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        Trigolnik triangle = new Trigolnik();
        System.out.println("a symbol please (for triangle  and  square ) : ");
        String s= sc.next();
        triangle.draw(s);
        System.out.println();

        Kvadrat square = new Kvadrat();
        square.draw(s);




    }


}
