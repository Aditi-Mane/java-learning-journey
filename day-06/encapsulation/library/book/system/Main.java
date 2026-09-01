package library.book.system;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book(101, "The Alchemist", "Paulo Coelho");
        Book b2 = new Book(102, "Atomic Habits", "James Clear");
        Book b3 = new Book(103, "Clean Code", "Robert C. Martin");

        b1.borrowBook();
        System.out.println();

        b1.borrowBook();
        System.out.println();

        b1.returnBook();
        System.out.println();

        b1.returnBook();
        System.out.println();
    }
}
/* OUTPUT

Book borrowed successfully.

Book is not available.

Book has been returned.

Book cannot be returned.
 */
