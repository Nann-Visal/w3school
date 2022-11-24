package PBook;

public class Book1 extends PackageBook.Book {
    private String publisher;
    public Book1(String pu,String t, String a, String c, String p){
        super(t,a,c,p);
        publisher=pu;
    }
    public void showBookDetail(){
        super.showBookdetail();
        System.out.println("Book publisher = " + publisher);
    }
    public String getPublisher(){
        return publisher;
    }public void setPublisher(String ps){
        publisher=ps;
    }
    public String getTitle(){
        return title;
    }public void setTitle(String t){
        title=t;
    }
    public String getAuthor(){
        return author;
    }public void setAuthor(String a){
        author=a;
    }
    public String getCategory(){
        return category;
    }public void setCategory(String c){
        category=c;
    }
    public String getPublicDate(){
        return publicDate;
    }public void setPublicDate(String p){
        publicDate=p;
    }
}

