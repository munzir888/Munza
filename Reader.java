import java.util.Scanner;

public class Reader {
    String fio ;
    int ticket  ;
    String faculty  ;
    String  dateBirthday ;
    String phone ;


    public void takeBook (){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" kakie knigi vi berete ?");
        String  books=scanner.next();


        System.out.println(fio+" vzial eti knigi "+books);
        System.out.println();

    }
    public void returnBook(){
        System.out.println(fio+" vernul  knigi ");
        System.out.println(" sposibo bolshoe , zhdem vas eshe");
    }



}

