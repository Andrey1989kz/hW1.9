public class Main {


    public static void main(String[] args) {

        Author dostoevskiy = new Author("Федор", "Михайлович", "Достоевский");
        Book crimeAndPunishment = new Book("Преступление и наказание", 1866, dostoevskiy);
        crimeAndPunishment.setDateOfPublication(1865);

        Author tolstoy = new Author("Лев", "Николаевич", "Толстой");
        Book warAndPeace = new Book("Война и мир", 1863, tolstoy);
        warAndPeace.setDateOfPublication(1862);

        Author gogol = new Author("Николай", "Васильевич", "Гоголь");
        Book deadSouls = new Book("Мертвые души", 1835, gogol);
        Book viy = new Book("Вий", 1835, gogol);
        viy.setDateOfPublication(1836);

        Author griboedov = new Author("Александр","Сергеевич", "Грибоедов");
        Book woeFromWit = new Book("Горе от ума", 1824, griboedov);
        woeFromWit.setDateOfPublication(1100);


        System.out.println(dostoevskiy+ "  " + crimeAndPunishment.getDateOfPublication() + " " + crimeAndPunishment.getBookTitle());
        System.out.println(tolstoy.getFullName() + " " + warAndPeace.getDateOfPublication() + " " + warAndPeace.getBookTitle());
        System.out.println(gogol.getFullName() + " " + viy.getDateOfPublication() + " " + viy.getBookTitle());
        System.out.println(griboedov.getFullName() + " " + woeFromWit.getDateOfPublication() + " " + woeFromWit.getBookTitle());
        System.out.println(woeFromWit);
        System.out.println(deadSouls);

    }
}