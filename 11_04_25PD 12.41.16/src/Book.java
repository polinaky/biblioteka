import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Book {
    private int year;
    private int pages;
    private String title;
    private String author;
    private int minAge;
    private boolean status;
    private int price;


    private static ArrayList<Book> treatments = new ArrayList<>();

    // Конструктор
    public Book(String title, int pages, boolean status, int minAge,int year, int price) {
        this.pages = pages;
        this.title = title;
        this.author = author;
        this.status = status;
        this.minAge = minAge;
        this.year = year;
        this.price = price;
        treatments.add(this);
    }
    public static void addBook(Book book) {
        treatments.add(book);
    }

    // Метод для удаления питомца
    public static void removeBook(Book book) {
        treatments.remove(book);
    }

    public void unexpectedIllnessOccurred() {
        this.status = false;
    }

    // Метод для проверки состояния здоровья питомца
    public void checkHealthStatus() {
        System.out.println("Checking book status of " + status);
    }

    // Метод для исцеления питомца
    public void status(){
        this.status = true;
    }


    public String toString() {
        return "Book title: " + title + "\nBook's author: " + author + "\nBook's pages: "
                + pages + " min age:" +minAge+ "\nstatus: " + status +"\nprice: "+price+"\nyear" +year; }


    public static void writeFile() {
        try (FileWriter fw = new FileWriter("klienti.txt")) {
            for (Book book : treatments) { // Используем Pet вместо raw Object
                fw.write(book.toString() + "\n");

            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }



    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public static ArrayList<Book> getTreatments() {
        return treatments;
    }

    public static void setTreatments(ArrayList<Book> treatments) {
        Book.treatments = treatments;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}





