public class Author {
    private String authorFullName;

    public Author (String authorFullName) {
        this.authorFullName = authorFullName;                   //Изначально вместо FullName было два параметра - firstName и secondName, но перемудрил в попытке сделать так, чтобы при вызове две перменные сливались, поэтому упростил.
    }
    public String getAuthorFullName() {
        return this.authorFullName;
    }
    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }
}
//