package week1.day2;

public class LibraryManagement {
	public static void main(String[] args) {
        // Create an object of Library class
        Library myLibrary = new Library();

        // Call the addBook method and store the returned book title
        String bookTitle = myLibrary.addBook("Java Programming");

        // Print the book title returned by addBook method
        System.out.println("The book added: " + bookTitle);

        // Call the issueBook method
        myLibrary.issueBook();
    }

}
