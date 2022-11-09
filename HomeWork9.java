import org.w3c.dom.ls.LSOutput;

public class HomeWork9 {
    public static void main(String[] args) {


    Display display = new Display(22.5 , "Munzir"," 13d");
    SSD ssd = new SSD(12.2 ,34);
    OpX opx = new OpX(13.4 , "Munzir");
    USB usb = new USB("XL ", 45.6);
    Keyboard keyboard = new Keyboard(100, false,false);
    LaptopX laptopX = new LaptopX(" Lenovo","Red ",ssd,opx,"MOdelK10",usb,keyboard);



    System.out.println ( laptopX );
}}
