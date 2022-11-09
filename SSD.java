public class SSD {
    private double vp ;
    private  int kolD;

    public SSD(double vp, int kolD) {
        this.vp = vp;
        this.kolD = kolD;
    }

    public void setVp(double vp) {
        this.vp = vp;
    }

    public void setKolD(int kolD) {
        this.kolD = kolD;
    }

    @Override
    public String toString() {
        return "SSD{" +
                "vp=" + vp +
                ", kolD=" + kolD +
                '}';
    }
}
