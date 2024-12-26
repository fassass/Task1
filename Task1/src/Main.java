import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаёт книжный магазин
        Bookstore bookstore = new Bookstore();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nДобро пожаловать в книжный магазин!");
            System.out.println("Выберите действие:");
            System.out.println("1 - Добавить книгу");
            System.out.println("2 - Найти книги по категории");
            System.out.println("3 - Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                // Добавление книги
                case 1:
                    addBookToStore(bookstore, scanner);
                    break;

                // Поиск книги
                case 2:
                    searchBooksInStore(bookstore, scanner);
                    break;

                case 3:
                    System.out.println("Спасибо за использование программы! До свидания!");
                    return;

                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
    }

    // Метод для добавления книги
    private static void addBookToStore(Bookstore bookstore, Scanner scanner) {
        System.out.println("\nВведите название книги:");
        String name = scanner.nextLine();

        System.out.println("Введите автора книги:");
        String author = scanner.nextLine();

        System.out.println("Введите год издания книги:");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите категорию книги:");
        String categoryName = scanner.nextLine();

        Category category = new Category(categoryName);
        Book book = new Book(name, author, year, category);

        // Добавление книги в книжный магазин
        bookstore.addBook(book);

        System.out.println("Книга успешно добавлена!");
    }

    // Метод для поиска книг
    private static void searchBooksInStore(Bookstore bookstore, Scanner scanner) {
        System.out.println("\nВведите название категории для поиска:");
        String categoryName = scanner.nextLine();

        // Выполняет поиск книг по категории
        var foundBooks = bookstore.searchBooksByCategory(categoryName);

        // Выводит результаты поиска
        if (foundBooks.isEmpty()) {
            System.out.println("Книги в категории '" + categoryName + "' не найдены.");
        } else {
            System.out.println("Найденные книги в категории '" + categoryName + "':");
            for (Book book : foundBooks) {
                System.out.println("- " + book.getName() + " (Автор: " + book.getAuthor() + ", Год: " + book.getYear() + ")");
            }
        }
    }
}