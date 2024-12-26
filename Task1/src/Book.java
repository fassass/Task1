public class Book {
    private String name;
    private String author;
    private int year;
    private Category category;

    // Конструктор
    public Book(String name, String author, int year, Category category) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.category = category;
    }

    // Геттер для названия книги
    public String getName() {
        return name;
    }

    // Сеттер для названия книги
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для автора
    public String getAuthor() {
        return author;
    }

    // Сеттер для автора
    public void setAuthor(String author) {
        this.author = author;
    }

    // Геттер для года издания
    public int getYear() {
        return year;
    }

    // Сеттер для года издания
    public void setYear(int year) {
        this.year = year;
    }

    // Геттер для категории
    public Category getCategory() {
        return category;
    }

    // Сеттер для категории
    public void setCategory(Category category) {
        this.category = category;
    }
}
