public class ls4 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.d= 10;
        rec.sh=12;

        Rectangle rec2 = new Rectangle(13,14);
        System.out.println(rec.d+"/"+rec.sh);
        System.out.println(rec2.d+"/"+rec2.sh);

    }
}
