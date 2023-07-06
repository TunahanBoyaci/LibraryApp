package LibraryApp;

import java.util.List;

public interface ILibraryOperation {
    void addBook(Book var1);

    void removeBook(Book var1);

    Book searchBookByTitle(String var1);

    List<Book> searchBookByAuthor(String var1);

    List<Book> listBooks();
}
