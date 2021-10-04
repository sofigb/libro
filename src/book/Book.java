package book;

import gender.GenClass;
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

    public Book(String titulo, String autor, Integer numPaginas,GenClass genClass) {
        this(createIsbn(), titulo, autor, numPaginas,genClass);
    }

    public Book(String isbn, String titulo, String autor, Integer numPaginas,GenClass genClass) {
        this.isbn = isbn;
        this.tittle = titulo;
        this.author = autor;
        this.pages = numPaginas;
        this.enable=true;
        this.genClass=genClass;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return tittle;
    }

    public void setTitulo(String titulo) {
        this.tittle = titulo;
    }

    public String getAutor() {
        return author;
    }

    public void setAutor(String autor) {
        this.author = autor;
    }

    public Integer getNumPaginas() {
        return pages;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.pages = numPaginas;
    }

    @Override
    public String toString() {
        return "El libro " + tittle + " con ISBN " + isbn + " creado por " + author
                + " tiene " + pages + " páginas."+" Genero "+ genClass.getGenEnum()+" Subgenero "+genClass.getSubEnum();
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

    public GenClass getGenClass() {
        return genClass;
    }

    public void setGenClass(GenClass genClass) {
        this.genClass = genClass;
    }
    
}

//    public static Comparator<Book> compararCantidadPaginasDesc = new Comparator<Book>() {
//
//        @Override
//        public int compare(Book l1, Book l2) {
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