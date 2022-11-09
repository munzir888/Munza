import java.util.Random;

public class Book {
     private String author;
    private  String title ;
    private  boolean needs ;
    private String giftedBy;
    private int pageCount ;

    //сендсиф код , дефолт   бест



    public  Book ( String author, String title,int pageCount , boolean needs ){
       this.author= author;
        this.title = title ;
        this.pageCount = pageCount;
        this.needs = needs;
    }
    public Book  (String author, String title,int pageCount , String giftedBy, boolean needs ){
        this.author= author;
        this.title = title ;
        this.pageCount = pageCount;
        this.giftedBy = giftedBy;
        this.needs = needs;
    }

    public void setAuthor(String author) {

        this.author = author;
        Random r =new Random();
        String pressmark = r.nextInt(100)+"";
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setNeeds(boolean needs) {
        this.needs = needs;
    }

    public void setGiftedBy(String giftedBy) {
        this.giftedBy = giftedBy;
    }

    public void setTitle(String title) {
        this.title = title;
    }



}
