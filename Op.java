public class Op {
    private double razmerOp ;
    private String model ;

    public Op(double razmerOp, String model) {
        this.razmerOp = razmerOp;
        this.model = model;
    }

    public void setRazmerOp(double razmerOp) {
        this.razmerOp = razmerOp;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Operativnai sistema {" +
                "razmer Op=" + razmerOp +
                ", madel='" + model + '\'' +
                '}';
    }
}
