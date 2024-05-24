public class Author {
    private String authorFirstName;
    private String authorSecondName;
    private String authorFullName;

    public Author(String authorFirstName, String authorSecondName, String authorFullName) {
        this.authorFirstName = authorFirstName;
        this.authorSecondName = authorSecondName;
        this.authorFullName = authorFirstName + authorSecondName;                   //Изначально вместо FullName было два параметра - firstName и secondName, но перемудрил в попытке сделать так, чтобы при вызове две перменные сливались, поэтому упростил.
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
}
//