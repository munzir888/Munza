public class Engine2 {
     private String name ;
    private    String type ;
    private String volume ;

    public Engine2 (String name, String type, String volume) {
        this.name = name;
        this.type = type;
        this.volume = volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Engine2{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", volume='" + volume + '\'' +
                '}';
    }
}
