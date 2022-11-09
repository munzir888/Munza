public class OpX {
    private double volume ;
    private  String  proizvoditel ;

    public OpX(double volume, String proizvoditel) {
        this.volume = volume;
        this.proizvoditel = proizvoditel;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setProizvoditel(String proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    @Override
    public String toString() {
        return "OpX{" +
                "volume=" + volume +
                ", proizvoditel='" + proizvoditel + '\'' +
                '}';
    }
}
