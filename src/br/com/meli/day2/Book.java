package br.com.meli.day2;

public class Book {

    private String Author;
    private boolean isAvailable;
    private String isbn;
    private String title;

    public Book(String author, boolean isAvailable, String isbn, String title) {
        Author = author;
        this.isAvailable = isAvailable;
        this.isbn = isbn;
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void lending(){
        this.isAvailable = false;
    }

    public void devolution(){
        this.isAvailable = true;
    }

    @Override
    public String toString() {
        return  title + '\'' +
                "Author='" + Author + '\'' +
                ", isAvailable=" + isAvailable +
                ", isbn='" + isbn + '\'';
    }

}
