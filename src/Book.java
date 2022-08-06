public class Book {

    private final  String bookTitle;
    private int dateOfPublication;
    private final Author author;

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
