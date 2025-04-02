package LibrayManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

// Book class
class Book {
    private String title;
    private boolean isBorrowed;

    public Book(String title) {
        this.title = title;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }
}

// Library class
class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title) {
        books.add(new Book(title));
        System.out.println("'" + title + "' has been added to the library.");
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }
        System.out.println("\nBooks in the Library:");
        for (Book book : books) {
            System.out.println("- " + book.getTitle() + (book.isBorrowed() ? " (Borrowed)" : ""));
        }
    }

    public void searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("'" + book.getTitle() + "' is available in the library.");
                return;
            }
        }
        System.out.println("'" + title + "' is not found in the library.");
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isBorrowed()) {
                    System.out.println("'" + title + "' is already borrowed.");
                } else {
                    book.setBorrowed(true);
                    System.out.println("'" + title + "' has been borrowed.");
                }
                return;
            }
        }
        System.out.println("'" + title + "' is not found in the library.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isBorrowed()) {
                    book.setBorrowed(false);
                    System.out.println("'" + title + "' has been returned.");
                } else {
                    System.out.println("'" + title + "' was not borrowed.");
                }
                return;
            }
        }
        System.out.println("'" + title + "' is not found in the library.");
    }
}
public class LibraryApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer
            switch (choice) {
                case 1:
                    System.out.print("Enter the title of the book to add: ");
                    String titleToAdd = scanner.nextLine();
                    library.addBook(titleToAdd);
                    break;
                case 2:
                    library.listBooks();
                    break;
                case 3:
                    System.out.print("Enter the title of the book to search: ");
                    String titleToSearch = scanner.nextLine();
                    library.searchBook(titleToSearch);
                    break;
                case 4:
                    System.out.print("Enter the title of the book to borrow: ");
                    String titleToBorrow = scanner.nextLine();
                    library.borrowBook(titleToBorrow);
                    break;
                case 5:
                    System.out.print("Enter the title of the book to return: ");
                    String titleToReturn = scanner.nextLine();
                    library.returnBook(titleToReturn);
                    break;
                case 6:
                    System.out.println("Exiting the program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n=== Library Management System ===");
        System.out.println("1. Add Book");
        System.out.println("2. List Books");
        System.out.println("3. Search Book");
        System.out.println("4. Borrow Book");
        System.out.println("5. Return Book");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }
}



