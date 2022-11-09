public class Bread {
    String mass  ;
    String price ;

    public Bread(String mass, String price) {
        this.mass = mass;
        this.price = price;
    }
public  void  izpech (){
    System.out.println(" Bread gogtov");
}
public  void  upakovat (){
    System.out.println("Upakovka");
}
    @Override
    public String toString() {
        return "Bread{" +
                "mass='" + mass + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
