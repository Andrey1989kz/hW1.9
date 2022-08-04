public class Main {


    public static void main(String[] args) {

        Author dostoevkiy = new Author("Достоевский Федор Михайлович");
        Book crimeAndPunishment = new Book("Преступление и наказание", 1866);
        crimeAndPunishment.setDateOfPublication(1865);

        Author tolstoy = new Author("Толстой Лев Николаевич");
        Book warAndWorld = new Book("Война и мир", 1863);
        warAndWorld.setDateOfPublication(1862);

        Author gogol = new Author("Гоголь Николай Васильевич");
        Book viy = new Book("Вий", 1835);
        viy.setDateOfPublication(1836);

        System.out.println(dostoevkiy.getNameWriter() + " " + crimeAndPunishment.getDateOfPublication() + " " + crimeAndPunishment.getBookTitle());
        System.out.println(tolstoy.getNameWriter() + " " + warAndWorld.getDateOfPublication() + " " + warAndWorld.getBookTitle());
        System.out.println(gogol.getNameWriter() + " " + viy.getDateOfPublication() + " " + viy.getBookTitle());

    }
}