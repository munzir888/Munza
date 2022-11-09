public class Transport {
   protected String name ;

    public Transport() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "name='" + name + '\'' +
                '}';
    }
}
