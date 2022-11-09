public class Keyboard {
    private double array ;
    private boolean podsvedka ;
   private boolean nds ;

    public Keyboard(double array, boolean podsvedka, boolean nds) {
        this.array = array;
        this.podsvedka = podsvedka;
        this.nds = nds;
    }

    public void setArray(double array) {
        this.array = array;
    }

    public void setPodsvedka(boolean podsvedka) {
        this.podsvedka = podsvedka;
    }

    public void setNds(boolean nds) {
        this.nds = nds;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "array=" + array +
                ", podsvedka=" + podsvedka +
                ", nds=" + nds +
                '}';
    }
}
