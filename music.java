public class music {
    private String name ;
    private  String type ;

    public music(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "music{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
