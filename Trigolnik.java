public class Trigolnik extends Shape{
    @Override
    public void draw(String symbol) {
        for (int i = 0; i <10 ; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print(symbol);
            }
            System.out.println();

        }
    }
}
