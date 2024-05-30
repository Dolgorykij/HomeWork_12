import java.util.Objects;

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

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", release=" + release +
                ", author=" + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return release == book.release && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, release, author);
    }
}