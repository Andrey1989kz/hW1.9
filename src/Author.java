import java.util.Objects;

public class Author {
    private String firstName;
    private String patronymic;
    private String lastName;

    @Override
    public boolean equals(Object authorClass) {
        System.out.println("equals " + this + " : " + authorClass);
        if (this == authorClass) return true;
        if (authorClass == null || getClass() != authorClass.getClass()) return false;
        Author author = (Author) authorClass;
        return Objects.equals(firstName, author.firstName) && Objects.equals(patronymic, author.patronymic) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
//        System.out.println("hasCode: " + this);
        return Objects.hash(firstName, patronymic, lastName);
    }

    public Author(String firstName, String patronymic, String lastName) {
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() {
        return this.firstName+" " + this.patronymic+" " + this.lastName;

    }


    @Override
    public String toString() {
        return
                firstName + " "+
                 patronymic + " "+
                lastName ;
    }
}

