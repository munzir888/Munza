package Ls12;

public class Korabl extends  VodnuiTransport{
    protected String nameTransport ;

    public Korabl(String nameTransport) {
        this.nameTransport = nameTransport;
    }

    public Korabl() {
    }

    public String getNameTransport() {
        return nameTransport;
    }

    public void setNameTransport(String nameTransport) {
        this.nameTransport = nameTransport;
    }

    @Override
    public String toString() {
        return "Korabl{" +
                "nameTransport='" + nameTransport + '\'' +
                ", nameType='" + nameType + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
