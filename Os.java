public class Os {
    private String name ;
    private int ver ;

    public Os(String name, int ver) {
        this.name = name;
        this.ver = ver;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVer(int ver) {
        this.ver = ver;
    }

    @Override
    public String toString() {
        return "Operativnaia pamiat{" +
                "imia='" + name + '\'' +
                ", versia=" + ver +
                '}';
    }
}
