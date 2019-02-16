package streamslambdas.book;

import java.util.Arrays;
import java.util.List;

// method reference example
public class Book {
    private int id;
    private String title;
    private String genre;
    private String author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String title, String genre, String author) {
        this.title = title;
        this.genre = genre;
        this.author = author;
    }

    public static class BookFilter {
        public boolean isFiction(Book b) {
            return b.getGenre().equals("fiction");
        }
    }

    public void print() {
        List<Book> books = Arrays.asList(new Book("30 Days", "fiction", "K Larsen"), new Book("Fast Food Nation", "non-fiction", "Eric Schlosser"), new Book("Wired", "fiction", "D Richards"));
        // method reference musí jít z instance BookFilter
        books.stream().filter(new Book.BookFilter()::isFiction)
// aby to mohlo takhle tak by musela metoda isFiction static
//        books.stream().filter(Book.BookFilter::isFiction)
                .forEach((Book b) -> System.out.print(b.getTitle()+", "));
    }
}
