import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int password = 1234;
        int attempt ;
        do{
            System.out.println("Please enter password: ");
            attempt = scanner.nextInt();
            if(password == attempt) {
                System.out.println("Разблокирован =)");
                return;
            }else {
                System.out.println("Неправильный пароль =(");
            }
        }
        while(password != attempt);
    }
}
