public class Author {
    private String firstName;
    private String patronymic;
    private String lastName;

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

