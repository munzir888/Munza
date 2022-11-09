public class Auto {
    String name ;
    Engine engine ;
    Wheels wheels ;
    music music ;

    public Auto(String name, Engine engine, Wheels wheels, music music) {
        this.name = name;
        this.engine = engine;
        this.wheels = wheels;
        this.music = music;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public void setMusic(music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public music getMusic() {
        return music;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                ", wheels=" + wheels +
                ", music=" + music +
                '}';
    }
}
