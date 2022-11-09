import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println( "napishite 3 chisla ");
        double  a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();

        System.out.printf(" %f + %f + %f = %f\n" ,a ,b, c,(a+b+c));
        System.out.printf(" %f * %f * %f = %f\n" ,a ,b, c,(a*b*c));
        System.out.printf(" (%f + %f + %f)/3 = %f\n" ,a ,b, c,((a + b + c)/3));
        // вы наверное будете задавать вопрос ( почему не сделал с intтом  )
        // ответ : тогда он округляет результат

        //  и вопрос : как убрать лишние нули в консоль ?
    }}
