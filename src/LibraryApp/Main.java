package LibraryApp;

import java.util.Iterator;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Harry Potter and the Philosopher's Stone", "Joanne Rowling"));
        library.addBook(new Book("Harry Potter and the Prisoner of Azkaban", "Joanne Rowling"));
        library.addBook(new Book("Harry Potter and the Goblet of Fire", "Joanne Rowling"));
        library.addBook(new Book("Harry Potter and the Order of the Phoenix", "Joanne Rowling"));
        library.addBook(new Book("The Shining", "Stephen King"));
        library.addBook(new Book("Misery", "Stephen King"));
        library.addBook(new Book("David Copperfield", "Charles Dickens"));
        List<Book> books = library.listBooks();
        Iterator var3 = books.iterator();

        while(var3.hasNext()) {
            Book b = (Book)var3.next();
            System.out.println(b);
        }

        System.out.println("*****************************************************");
        Book miseryBook = library.searchBookByTitle("Misery");
        System.out.println(miseryBook);
    }
}
