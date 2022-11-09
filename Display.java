public class Display {
    private double diogonal ;
    private  String proizvoditel ;
    private  String tArray ;

    public Display(double diogonal, String proizvoditel, String tArray) {
        this.diogonal = diogonal;
        this.proizvoditel = proizvoditel;
        this.tArray = tArray;
    }

    public void setDiogonal(double diogonal) {
        this.diogonal = diogonal;
    }

    public void setProizvoditel(String proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    public void settArray(String tArray) {
        this.tArray = tArray;
    }

    @Override
    public String toString() {
        return "Display{" +
                "diogonal=" + diogonal +
                ", proizvoditel='" + proizvoditel + '\'' +
                ", tArray='" + tArray + '\'' +
                '}';
    }
}
