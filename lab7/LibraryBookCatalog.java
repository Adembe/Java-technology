package lab7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LibraryBookCatalog {
    HashMap<String, Integer> libraryBooksCatalog = new HashMap<>();
    int searchValue,searchPageNumber;
    Scanner scanner = new Scanner(System.in);
    String searchBookName;

    public LibraryBookCatalog() {
        libraryBooksCatalog.put("ТөгсТоо", 250);
        libraryBooksCatalog.put("Цагаанбороо", 600);
        libraryBooksCatalog.put("ВангийнНулимс", 400);
        libraryBooksCatalog.put("ХарьХэлээрЯригсад", 510);
        libraryBooksCatalog.put("ХаанШирээнийТоглоом", 800);
        System.out.println("Номыг Нэрээр хайх бол 1 хуудсаар хайх бол 2-ыг сонгоно уу?");
        searchValue = scanner.nextInt();
        if(searchValue == 1){
            System.out.println("Хайх номын нэрийг оруулна уу?");
            searchBookName = scanner.next();
            searchByBookName(libraryBooksCatalog,searchBookName);
        }
        else {
            System.out.println("Хайх номын хуудсыг оруулна уу?");
            searchPageNumber = scanner.nextInt();
            searchByPages(libraryBooksCatalog,searchPageNumber);
        }
    }


    public static void searchByBookName(HashMap<String, Integer> bookCatalog, String bookName) {
        if (bookCatalog.containsKey(bookName)) {
            System.out.println("Book: " + bookName + ", Pages: " + bookCatalog.get(bookName));
        } else {
            System.out.println(bookName + "Ийм ном олдсонгүй");
        }
    }

    // Function to search for books by the number of pages
    public static void searchByPages(HashMap<String, Integer> bookCatalog, int bookPages) {
        ArrayList<String> foundPageBooks = new ArrayList<>();
        for (String book : bookCatalog.keySet()) {
            if (bookCatalog.get(book) == bookPages) {
                foundPageBooks.add("Book: " + book + ", Pages: " + bookPages);
            }
        }

        if (!foundPageBooks.isEmpty()) {
            for (String bookInfo : foundPageBooks) {
                System.out.println(bookInfo);
            }
        } else {
            System.out.println("Хуудсийн тоо таарсангүй.");
        }
    }

    public static void main(String[] args) {
        new LibraryBookCatalog();
    }

}
