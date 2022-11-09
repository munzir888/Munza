public class Cat  extends  Animal{
    String poroda ;

    public Cat(String type, String razmer, String mass, String poroda) {
        super(type, razmer, mass);
        this.poroda = poroda;
    }
@Override
    void zvuk (){
        System.out.println(" Zvuk :Myau");
    }
    @Override
    void  going (){
        System.out.println("Going : xodit");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "poroda='" + poroda + '\'' +
                ", type='" + type + '\'' +
                ", razmer='" + razmer + '\'' +
                ", mass='" + mass + '\'' +
                '}';
    }
}
