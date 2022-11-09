public class Wheels {
    private  String name ;
    private  String radios;
    private  String typeOfSeason ;

    public Wheels(String name, String radios, String typeOfSeason) {
        this.name = name;
        this.radios = radios;
        this.typeOfSeason = typeOfSeason;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRadios(String radios) {
        this.radios = radios;
    }

    public void setTypeOfSeason(String typeOfSeason) {
        this.typeOfSeason = typeOfSeason;
    }

    public String getName() {
        return name;
    }

    public String getRadios() {
        return radios;
    }

    public String getTypeOfSeason() {
        return typeOfSeason;
    }

    @Override
    public String toString() {
        return "wheels{" +
                "name='" + name + '\'' +
                ", radios='" + radios + '\'' +
                ", typeOfSeason='" + typeOfSeason + '\'' +
                '}';
    }
}
