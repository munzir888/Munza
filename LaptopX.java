public class LaptopX {
    private String marka ;
    private  String color ;
    SSD ssd ;
    OpX opx ;
    private String videyoK;
    USB usb ;
    Keyboard keyboard;

    public LaptopX(String marka, String color, SSD ssd, OpX opx, String videyoK, USB usb, Keyboard keyboard) {
        this.marka = marka;
        this.color = color;
        this.ssd = ssd;
        this.opx = opx;
        this.videyoK = videyoK;
        this.usb = usb;
        this.keyboard = keyboard;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSsd(SSD ssd) {
        this.ssd = ssd;
    }

    public void setOpx(OpX opx) {
        this.opx = opx;
    }

    public void setVideyoK(String videyoK) {
        this.videyoK = videyoK;
    }

    public void setUsb(USB usb) {
        this.usb = usb;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "LaptopX{" +
                "marka='" + marka + '\'' +
                ", color='" + color + '\'' +
                ", ssd=" + ssd +
                ", opx=" + opx +
                ", videyoK='" + videyoK + '\'' +
                ", usb=" + usb +
                ", keyboard=" + keyboard +
                '}';
    }
}
