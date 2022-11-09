package Ls12;

public class Samalet extends  VozdushniTransport{
    protected String nameTransport ;

    public Samalet(String nameTransport) {
        this.nameTransport = nameTransport;
    }

    public Samalet() {
    }

    public String getNameTransport() {
        return nameTransport;
    }

    public void setNameTransport(String nameTransport) {
        this.nameTransport = nameTransport;
    }

    @Override
    public String toString() {
        return "Samalet{" +
                "nameTransport='" + nameTransport + '\'' +
                ", nameType='" + nameType + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

