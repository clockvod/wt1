package com.handen.wt.classes_and_objects;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private String isbn;

    public Book() {

    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public int compareTo(Book o) {
        return isbn.compareTo(o.isbn);
    }

    @Override
    public boolean equals(Object other) {
        if(this == other) return true;
        if(getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return price == book.price && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return 31 * (title.hashCode() + author.hashCode() + price);
    }

    @Override
    public String toString() {
        return "Book{title=\"" + title + "\", author=\"" + author + "\", price=" + price + '}';
    }

    @Override
    protected Object clone() {
        return new Book(title, author, price);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public static int getEdition() {
        return edition;
    }

    public String getIsbn() {
        return isbn;
    }
}
