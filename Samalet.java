public class Samalet {
   protected String nameTransport ;

    public Samalet() {
    }

    public Samalet(String nameTransport) {
        this.nameTransport = nameTransport;
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
                '}';
    }
}
