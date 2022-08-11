import java.util.Objects;

public class Book {

    private final  String bookTitle;
    private int dateOfPublication;
    private final Author author;


    @Override
    public boolean equals(Object bookClass) {
       System.out.println("equals :" + this + " : " + bookClass );
        if (this == bookClass) return true;
        if (bookClass == null || getClass() != bookClass.getClass()) return false;
        Book book = (Book) bookClass;
        return dateOfPublication == book.dateOfPublication && bookTitle.equals(book.bookTitle) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, dateOfPublication, author);
    }

    public  Book(String bookTitle, int dateOfPublication,Author author) {
        this.bookTitle = bookTitle;
        this.dateOfPublication = dateOfPublication;
        this.author = author;
    }
    public String getBookTitle() {
        return this.bookTitle;
    }
    public int getDateOfPublication() {
        return this.dateOfPublication;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setDateOfPublication(int dateOfPublication) {
        this.dateOfPublication = dateOfPublication;

    }

    @Override
    public String toString() {
        return
                bookTitle + " " +
                       " "+ dateOfPublication +
                       " "+ author;

    }
}
