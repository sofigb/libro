package book;

import LibroEnum.GenClass;
import java.util.Comparator;
import java.util.UUID;

public class Book {

    private String isbn;
    private String tittle;
    private String author;
    private Integer pages;
    private boolean enable;
    private GenClass genClass;

    public Book() {

    }

    public Book(String tittle, String author, Integer pages, GenClass genClass) {
        this(createIsbn(), tittle, author, pages, genClass);
    }

    public Book(String isbn, String tittle, String author, Integer pages, GenClass genClass) {
        this.isbn = isbn;
        this.tittle = tittle;
        this.author = author;
        this.pages = pages;
        this.enable = true;
        this.genClass = genClass;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTitulo(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "El libro " + tittle + " con ISBN " + isbn + " creado por " + author
                + " tiene " + pages + " páginas." + " Genero " + genClass.getGenEnum() + " Subgenero " + genClass.getSubEnum();
    }

    public static String createIsbn() {
        return (UUID.randomUUID().toString()
                .replaceAll("[^0-9]", "")
                .substring(0, 10));
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean estado) {
        this.enable = estado;
    }

    public String getGender() {
        return genClass.getGenEnum();
    }
    public String getSubGender() {
        return genClass.getSubEnum();
    }
    
    

    public void setGenClass(GenClass genClass) {
        this.genClass = genClass;
    }

}

//    public static Comparator<T> comparardesc= new Comparator<T>() {
//
//        @Override
//        public int compare(t1, t2) {
//            return l1.getNumPaginas().compareTo(l2.getNumPaginas());
//        }
//
//    };
//    public static Comparator<Book> compararCantidadPaginasAsc = new Comparator<Book>() {
//
//        @Override
//        public int compare(Book l1, Book l2) {
//            return l2.getNumPaginas().compareTo(l1.getNumPaginas());
//        }
//
//    };
