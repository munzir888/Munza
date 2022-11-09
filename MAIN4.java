import java.util.Scanner;

public class MAIN4 {
    public static void main(String[] args) {
        Reader person = new Reader();
        Scanner sc = new Scanner(System.in);
        System.out.println(" kak vashe imia ?");
        person.fio=sc.next();
        System.out.println(" na kogo vu uchites ?");
        person.faculty=sc.next();
        System.out.println(" vashe data roshdenia ?");
        person.dateBirthday = sc.next();
        System.out.println("vash phone number ?");
        person.phone=sc.next();
        person.ticket= 1234 ;
        System.out.println();
        System.out.println(" vash bilet:  "+person.ticket);

        person.takeBook();
        System.out.println(" vi ushe prochitali ?");
        System.out.println( " vernete knigi ? ");
        System.out.println("1-daa");
        System.out.println("2- ia eshe ne prochital ");
        int vopros = sc.nextInt();
        if(vopros==1){
            person.returnBook();
        }else if (vopros==2){
            System.out.println(" ok , no ne zabudte vernut");
        }else{
            System.out.println(" oshibka");
            System.out.println(" vibrite 1 ili 2 ");
        }
    }
}
// я не понял задачу на все 100% ,  и так сделал .
// но когда пойму отправлю вам
