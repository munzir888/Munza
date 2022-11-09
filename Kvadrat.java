public class Kvadrat extends  Shape{
    @Override
    public void draw(String symbol) {

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                if(i==0 || i==10-1){
                    System.out.print(symbol );
                }else{
                    if(j==0 || j==10-1){
                        System.out.print(symbol );
                    }else{
                        System.out.print( " ");
                    }
                }

            }
            System.out.print("\n");
        }
    }
}
