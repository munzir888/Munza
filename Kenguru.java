public class Kenguru extends  Animal{
    String sila ;

    public Kenguru(String type, String razmer, String mass, String sila) {
        super(type, razmer, mass);
        this.sila = sila;
    }
    void  zvuk (){
        System.out.println("Zvuk :Kakoita zvuk ");
    }
    void going (){
        System.out.println("Going :jump");
    }

    @Override
    public String toString() {
        return "Kenguru{" +
                "sila='" + sila + '\'' +
                ", type='" + type + '\'' +
                ", razmer='" + razmer + '\'' +
                ", mass='" + mass + '\'' +
                '}';
    }
}
