 public class ls6 {
    public static void main(String[] args) {
 Zhd zhd = new Zhd(12.2,13);
 Op op = new Op(13," Lenovo");
 Os os = new Os("modelX",12);
 Prosesor prosesor = new Prosesor(" ModelXL",14);

 Laptop laptop = new Laptop(zhd,op,os,prosesor);


//        System.out.println(zhd);
//        System.out.println(op);
//        System.out.println(os);
//        System.out.println(prosesor);
          System.out.println(laptop);

    }
}

