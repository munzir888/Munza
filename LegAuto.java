public class LegAuto {
    protected String nameAuto;

    public LegAuto(String nameType) {
        this.nameAuto = nameType;
    }

    public String getNameAuto() {
        return nameAuto;
    }

    public void setNameAuto(String nameAuto) {
        this.nameAuto = nameAuto;
    }

    @Override
    public String toString() {
        return "LegAuto{" +
                "nameType='" + nameAuto + '\'' +
                '}';
    }
}
