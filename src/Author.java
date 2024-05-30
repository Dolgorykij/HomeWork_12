import java.util.Objects;

public class Author {
    private String authorFirstName;
    private String authorSecondName;
    private String authorFullName;

    public Author(String authorFirstName, String authorSecondName, String authorFullName) {
        this.authorFirstName = authorFirstName;
        this.authorSecondName = authorSecondName;
        this.authorFullName = authorFirstName + authorSecondName;
    }

    public String getAuthorFullName() {
        return this.authorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }

    public String getAuthorFirstName() {
        return this.authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }
    public String getAuthorSecondName(String authorSecondName) {
        return this.authorSecondName;
    }

    public void setAuthorSecondName(String authorSecondName) {
        this.authorSecondName = authorSecondName;
    }

    @Override
    public String toString() {
        return "authorFullName = " + authorFullName;
        // Немного не понял, в каком плане "не дублировать" toString Автора и Книги. Имелось ввиду подобное или как?
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;
        return Objects.equals(authorFullName, author.authorFullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorFullName);
    }
}