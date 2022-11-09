public class Prosesor {
    private String model ;
    private int kolvoIa ;

    public Prosesor(String model, int kolvoIa) {
        this.model = model;
        this.kolvoIa = kolvoIa;
    }

    public void setKolvoIa(int kolvoIa) {
        this.kolvoIa = kolvoIa;
    }

    @Override
    public String toString() {
        return "Prosesor{" +
                "model='" + model + '\'' +
                ", kolvo Ia=" + kolvoIa +
                '}';
    }

    public void setModel(String model) {
        this.model = model;


    }
}
