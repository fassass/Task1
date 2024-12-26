import java.util.ArrayList;
import java.util.List;

public class Stack {
    // Список книг на полке
    private List<Book> books;
    // Адрес полки
    private String address;

    public Stack(String address) {
        this.address = address;
        books = new ArrayList<>();
    }

    // Геттер для списка книг
    public List<Book> getBooks() {
        return books;
    }

    // Добавление книги в стэк
    public void addBook(Book book) {
        books.add(book);
    }

    // Геттер для адреса полки
    public String getAddress() {
        return address;
    }

    // Сеттер для адреса полки
    public void setAddress(String address) {
        this.address = address;
    }
}