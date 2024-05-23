public class Book {
    private String title;
    private int release;
    private Author author;


    public Book (String title, int release, Author author) {
        this.title = title;
        this.release = release;
        this.author = author;
    }
    public String getTitle() {
        return this.title;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getRelease() {
        return this.release;
    }
    public void setTitle() {
        this.title = title;
    }
    public void setAuthor() {
        this.author = author;
    }
    public void setRelease(int release) {
        this.release = release;
    }
}
//