package homework.day7.utils;

import java.util.Objects;

public class Book {
    private String name;
    private String autor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(autor, book.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, autor);
    }

    public Book(String name, String autor) {
        this.name = name;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
