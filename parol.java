import java.util.Scanner;

public class parol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int parol = 1234;
        System.out.println("vvedite parol please ");
        int parol2 = scanner.nextInt();
        if (parol ==parol2) {
            System.out.println(" dostup rasreshon ");
            return;

        } else {
            System.out.println( "dostup zapreshon !");
        }
        while (parol != parol2){
            System.out.println("vvedite parol please ");
             parol2 = scanner.nextInt();
        }
        if (parol ==parol2) {
            System.out.println(" dostup rasreshon ");
            return;
        } else {
            System.out.println("dostup zapreshon !");
        }
    }}
