package TASK1;

public class Product {
   private String name ;
   private double sena ;
   private String srok ;

    public Product(String name, double sena, String srok) {
        this.name = name;
        this.sena = sena;
        this.srok = srok;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSena() {
        return sena;
    }

    public void setSena(double sena) {
        this.sena = sena;
    }

    public String getSrok() {
        return srok;
    }

    public void setSrok(String srok) {
        this.srok = srok;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", sena=" + sena +
                ", srok='" + srok + '\'' +
                '}';
    }
}
