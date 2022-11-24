package PackageBook;

public class Book {
    protected String title;
    protected String author;
    protected String category;
    protected String publicDate;

    public Book(String t, String a, String c, String p){
        title = t;
        author = a;
        category = c;
        publicDate = p;
    }
    public void showBookdetail(){
        System.out.println(" Book title = " + title);
        System.out.println(" Book author = " + author);
        System.out.println(" Book category = " + category);
        System.out.println(" Book publicDate = " + publicDate);
    }
}
