package Ls12;

public class Auto extends LegkovuieAuto{
    protected String nameTransport ;

    public Auto(String nameTransport) {
        this.nameTransport = nameTransport;
    }

    public Auto() {
    }

    public String getNameTransport() {
        return nameTransport;
    }

    public void setNameTransport(String nameTransport) {
        this.nameTransport = nameTransport;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "nameTransport='" + nameTransport + '\'' +
                ", nameAuto='" + nameAuto + '\'' +
                ", nameType='" + nameType + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
