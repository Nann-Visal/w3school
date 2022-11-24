package Package_Book;

public class Book {
    private String title;
    private String author;
    private String category;
    private String publicDate;
    //constructor
    Book(String t,String a,String c,String p){
        title = t;
        author = a;
        category = c;
        publicDate = p;
    }
    //output book detail
    public void showBookDetail(){
        System.out.println("Book title = " + title);
        System.out.println("Book author = " + author);
        System.out.println("Book category = " + category);
        System.out.println("Book Date = " + publicDate);
    }
}
