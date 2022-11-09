public class Zhd {
    private double razmer ;
    private double skorost ;

    public Zhd (double razmer,double skorost){
        this.razmer= razmer;
        this.skorost=skorost;
    }

    public void setRazmer(double razmer) {
        this.razmer = razmer;
    }
    public void setSkorost(double skorost) {
        this.skorost = skorost;

    }
    @Override
    public String toString() {
        return "vidioKarta{" +
                "razmer=" + razmer +
                ", skorost=" + skorost +
                '}';
    }



}
