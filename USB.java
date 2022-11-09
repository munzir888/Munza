public class USB {
    private  String type ;
    private double idP ;

    public USB(String type, double idP) {
        this.type = type;
        this.idP = idP;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIdP(double idP) {
        this.idP = idP;
    }

    @Override
    public String toString() {
        return "USB{" +
                "type='" + type + '\'' +
                ", idP=" + idP +
                '}';
    }
}
