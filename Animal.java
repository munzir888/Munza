public class Animal {
    String type ;
    String razmer ;
    String mass ;

    public Animal(String type, String razmer, String mass) {
        this.type = type;
        this.razmer = razmer;
        this.mass = mass;
    }

    void zvuk (){

    }
    void going (){

    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", razmer='" + razmer + '\'' +
                ", mass='" + mass + '\'' +
                '}';
    }
}
