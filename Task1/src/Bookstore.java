import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    private Stack shelf;

    public Bookstore() {
        shelf = new Stack("Main Shelf");
    }

    // Метод для добавления книги в магазин
    public void addBook(Book book) {
        shelf.addBook(book);
    }

    // Метод для поиска книги по категории
    public List<Book> searchBooksByCategory(String categoryName) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : shelf.getBooks()) {
            if (book.getCategory().getName().equalsIgnoreCase(categoryName)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
}
