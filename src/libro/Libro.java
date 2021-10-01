/*
Crear el método  para mostrar la información relativa al libro con el siguiente formato:
“El libro con ISBN creado por el autor tiene páginas”.
En el fichero main, crear 5 objetos Libro (los valores que se quieran), validando que el campo ISBN de valor numerico y solo permita 10 digitos
listarlos sin que pueda haber dos libros con el mismo ISBN  y mostrarlos por pantalla.
Por último, indicar cuál de los 2 tiene más páginas.
 */
package libro;

import genero.GeneroClass;
import java.util.Comparator;
import java.util.UUID;

public class Libro {

   
    private String isbn;
    private String titulo;
    private String autor;
    private Integer numPaginas;
    private boolean habilitado;
    private GeneroClass genClass;
    
    public Libro() {
        
    }

    public Libro(String titulo, String autor, Integer numPaginas,GeneroClass genClass) {
        this(crearIsbn(), titulo, autor, numPaginas,genClass);
    }

    public Libro(String isbn, String titulo, String autor, Integer numPaginas,GeneroClass genClass) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.habilitado=true;
        this.genClass=genClass;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    //  Mostrar => El libro con ISBN creado por el autor tiene páginas
    @Override
    public String toString() {
        return "El libro " + titulo + " con ISBN " + isbn + " creado por " + autor
                + " tiene " + numPaginas + " páginas."+" Genero "+ genClass.getGenEnum()+" Subgenero "+genClass.getSubEnum();
    }

    public static Comparator<Libro> compararCantidadPaginasDesc = new Comparator<Libro>() {

        @Override
        public int compare(Libro l1, Libro l2) {
            return l1.getNumPaginas().compareTo(l2.getNumPaginas());
        }

    };
    public static Comparator<Libro> compararCantidadPaginasAsc = new Comparator<Libro>() {

        @Override
        public int compare(Libro l1, Libro l2) {
            return l2.getNumPaginas().compareTo(l1.getNumPaginas());
        }

    };

    public static String crearIsbn() {
        return (UUID.randomUUID().toString()
                .replaceAll("[^0-9]", "")
                .substring(0, 10));
    }
    
        public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean estado) {
        this.habilitado = estado;
    }

    public GeneroClass getGenClass() {
        return genClass;
    }

    public void setGenClass(GeneroClass genClass) {
        this.genClass = genClass;
    }
    
}
