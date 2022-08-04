public class Book {

    private String bookTitle;
    private int dateOfPublication;
    public  Book(String bookTitle, int dateOfPublication) {
        this.bookTitle = bookTitle;
        this.dateOfPublication = dateOfPublication;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public int getDateOfPublication() {
        return this.dateOfPublication;

    }

    public void setDateOfPublication(int dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

}
