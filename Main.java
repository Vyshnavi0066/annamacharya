import java.util.*;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        do {
            library.displayMainMenu();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                // Create a new Book object
                Book book = new Book();
                book.bookMenu();
                library.addBook(book);
            } else if (choice == 2) {
                System.out.println("Enter the books serial Number that you want to find : ");
                int userChoice = sc.nextInt();
                // Search for the book in the library and get its index
                int indexUser = library.findBook(userChoice);
                System.out.println("The book with the given Serial Number is: " + "\r\n" + library.getBook(library.findBook(userChoice)));
            } else if (choice == 3) {
                System.out.println("Enter the books serial Number that you want to Update : ");
                int userChoice = sc.nextInt();
                Book book = library.getBook(library.findBook(userChoice));
                book.userUpdateDisplay();
                System.out.println("What do you want to update. ");
                int updateUserChoice = sc.nextInt();
                // Update the book's serial number
                if (updateUserChoice == 1) {
                    System.out.println("Enter the new serial number for the book:  ");
                    int newsNo = sc.nextInt();
                    book.setsNo(newsNo);
                } else if (updateUserChoice == 2) {
                    System.out.println("Enter the New Book Name: ");
                    String newBookName = sc.next();
                    book.setBookName(newBookName);
                } else if (updateUserChoice == 3) {
                    System.out.println("Enter the new Author Name: ");
                    String newAuthorName = sc.next();
                    book.setAuthorName(newAuthorName);
                }
                System.out.println("The updated Book is : " + library.getBook(userChoice));
            } else if (choice == 4) {
                // Ask the user for the serial number of the book they want to delete
                System.out.println("Enter the books serial Number that you want to Delete : ");
                int userChoice = sc.nextInt();
                // Get the Book object from the library using its serial number
                Book book = library.getBook(library.findBook(userChoice));
                // Remove the book from the library
                library.removeBook(book);
            } else if(choice == 5) {
                library.getAllBook();
            }
        } while (true);
  }
}
