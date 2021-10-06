package libro.manager;

import book.Book;
import LibroEnum.Criterion;
import LibroEnum.GenClass;
import LibroEnum.OrdenEnum;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Optional;
import java.util.stream.Stream;

public class BookManager {

    Book book;

    HashMap<String, Book> mapBook;

    private static BookManager bookManager;

    private BookManager() {
        mapBook = new HashMap();
    }

    public static BookManager bookManagerCreate() {
        if (bookManager == null) {
            bookManager = new BookManager();
        }
        return bookManager;
    }

    public void addBook(String tittle, String author, Integer pages, GenClass genClass) throws Exception {
        try {
            book = new Book(tittle, author, pages, genClass);
            if (duplicatedIsbn(book.getIsbn())) {
                throw new Exception("El ISBN " + book.getIsbn() + " ya existe en la lista de libros.");
            } else {
                mapBook.put(book.getIsbn(), book);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Boolean duplicatedIsbn(String isbn) throws Exception {
        return (mapBook.containsKey(isbn));
    }

    public void showBooks() {
        System.out.println("");
        System.out.println("--------------Lista de libros (sin ordenar)--------------------");
        mapBook.values()
                .stream()
                .filter(l -> l.isEnable())
                .forEach(System.out::println);
        System.out.println("---------------------------------------------------------------");
    }

    public void sorted(Criterion criterion, OrdenEnum orden) {
        System.out.println("--------------Lista de libros ordenada por " + criterion + " --------------");
        Comparator comparator = null;
        switch (criterion) {
            case AUTOR: {
                comparator = Comparator.comparing(Book::getAuthor);
                break;
            }
            case ISBN: {
                comparator = Comparator.comparing(Book::getIsbn);
                break;
            }
            case TITLE: {
                comparator = Comparator.comparing(Book::getIsbn);
                break;
            }
            case PAGES: {
                comparator = Comparator.comparing(Book::getPages);
                break;
            }

            case GENDER: {
                comparator = Comparator.comparing(Book::getGender);
                break;
            }

        }
        if (orden.equals(orden.ASCENDENTE)) {
            listBookEnable().sorted(comparator).forEach(System.out::println);

        } else {
            listBookEnable().sorted(comparator.reversed()).forEach(System.out::println);

        }
    }

    public void bookMayorPages() {
        System.out.println("------------------Libro con mayor numero de páginas----------------------");

        Optional<Book> optional = mapBook
                .values()
                .stream()
                .max(Comparator
                        .comparing(Book::getPages));
        Book bookMP = optional.get();
        System.out.println(bookMP);
        System.out.print("\n");
        System.out.println("---------------------------------------------------------------");
    }

    public void unnableBook(String isbn) throws Exception {
        try {
            if (!mapBook.containsKey(isbn)) {
                throw new Exception("no se encontró isbn");
            }
            if (!mapBook.get(isbn).isEnable()) {
                throw new Exception("Error: Este libro ya se encuentra borrado");
            }
            Book lb = mapBook.get(isbn);
            lb.setEnable(false);
            System.out.println(lb);
            System.out.println("Ha sido dado de baja");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Stream<Book> listBookEnable() {

        return (mapBook.values().stream().filter(l -> l.isEnable()));
    }

    public void enableBook(String isbn) throws Exception {
        try {
            if (!mapBook.containsKey(isbn)) {
                throw new Exception("no se encontró isbn");
            }
            if (mapBook.get(isbn).isEnable()) {
                throw new Exception("Error: Este libro ya esta habilitado");
            }
            Book lb = mapBook.get(isbn);
            lb.setEnable(true);
            System.out.println(lb);
            System.out.println("Ha sido dado de alta");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void findBookISBN(String isbn) {
        try {

            if (mapBook.containsKey(isbn) && mapBook.get(isbn).isEnable()) {
                System.out.println("");
                System.out.println("--------------Libro por ISBN--------------------");
                System.out.println(mapBook.get(isbn));
                System.out.println("---------------------------------------------------------------");
            } else {
                System.out.println("El isbn ingresado no existe");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
