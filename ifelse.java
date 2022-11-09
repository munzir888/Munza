import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        System.out.println("dobro pozhalovat : seichas uzneam mozhno li tebe poluchit prava ");
        System.out.println("skolka tebe let ?");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age<0){
            System.out.println("ne pravilni format vozrasta ");
            return;
                  }

        if (age>100) {
            System.out.println("otpravte svoego vnuka");

        } else if (age>=17) {
            System.out.println( "prihodi za provami ");

        }  else {
            int jdat = 17-age ;
            String agestring ="let";
            if (jdat==1) {
                agestring = "god";
            }          else if (jdat==2){
                agestring = "god";
            }else if (jdat==3){
                agestring = "god";
            }else if (jdat==4){
                agestring = "god";
            }else {
                agestring= "let";
            }
            System.out.println("vam nuzhno jdat " +jdat+" "+agestring);





    }







    }}