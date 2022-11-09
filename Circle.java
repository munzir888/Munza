public class Circle {
    double r ;
    String color ;
    boolean pra ;

    public Circle(double r){
        this.r = r*12;

    }
    public Circle(String color , double r){
        this.color = color ;
        this.r = r;

    }
    public  Circle(boolean pra ,String color,double r){
        this.pra =pra ;
        this.color = color ;
        this.r=r ;
    }


    double dk ( ){
       return  2*r*3.12;
    }

    double pk(){
        return r*r*3.14;
    }
}
