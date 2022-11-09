public class Tzemlia {
    protected String nameType ;

    public Tzemlia(String nameType) {
        this.nameType = nameType;
    }

    public Tzemlia() {
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    @Override
    public String toString() {
        return "Tzemlia{" +
                "nameType='" + nameType + '\'' +
                '}';
    }
}
