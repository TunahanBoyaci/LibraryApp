package LibraryApp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library implements ILibraryOperation {
    private List<Book> books = new ArrayList();

    public Library() {
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public Book searchBookByTitle(String title) {
        Iterator var2 = this.books.iterator();

        Book b;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            b = (Book)var2.next();
        } while(!title.equals(b.getTitle()));

        return b;
    }

    public List<Book> searchBookByAuthor(String author) {
        ArrayList<Book> foundBooks = new ArrayList();
        Iterator var3 = this.books.iterator();

        while(var3.hasNext()) {
            Book b = (Book)var3.next();
            if (author.equals(b.getAuthor())) {
                foundBooks.add(b);
            }
        }

        return foundBooks;
    }

    public List<Book> listBooks() {
        return this.books;
    }
}
