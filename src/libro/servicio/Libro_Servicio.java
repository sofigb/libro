/*
 * Crear el método  para mostrar la información relativa al libro con el siguiente formato:
“El libro con ISBN creado por el autor tiene páginas”.
En el fichero main, crear 5 objetos Libro (los valores que se quieran), validando que el campo ISBN de valor numerico y solo permita 10 digitos
listarlos sin que pueda haber dos libros con el mismo ISBN  y mostrarlos por pantalla.
Por último, indicar cuál de los 2 tiene más páginas.
 */
package libro.servicio;

import genero.GeneroClass;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Optional;
import libro.Libro;

public class Libro_Servicio {

    Libro libro;
    HashMap<String, Libro> mapLibro;

    public Libro_Servicio() {
        mapLibro = new HashMap();
    }

    public void agregarLibro(String titulo, String autor, Integer numPaginas, GeneroClass genClass) throws Exception {
        try {
            libro = new Libro(titulo, autor, numPaginas, genClass);
            if (duplicidadIsbn(libro.getIsbn())) {
                throw new Exception("El ISBN " + libro.getIsbn() + " ya existe en la lista de libros.");
            } else {
                mapLibro.put(libro.getIsbn(), libro);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Boolean duplicidadIsbn(String isbn) throws Exception {
        return (mapLibro.containsKey(isbn));
    }

    public void mostrarLibros() {
        System.out.println("");
        System.out.println("--------------Lista de libros (sin ordenar)--------------------");
        mapLibro.values()
                .stream()
                .filter(l -> l.isHabilitado())
                .forEach(System.out::println);
        System.out.println("---------------------------------------------------------------");
    }

    public void mostrarListaOrdenada() {
        System.out.println("--------------Lista de libros ordenada por numero de páginas--------------");

        mapLibro.values()
                .stream()
                .filter(l -> l.isHabilitado())
                .sorted(Comparator
                        .comparing(Libro::getNumPaginas)
                        .thenComparing(Libro::getTitulo)
                        .reversed())
                .forEach(System.out::println);
        System.out.println("---------------------------------------------------------------");
    }

    public void libroConMasPaginas() {
        System.out.println("------------------Libro con mayor numero de páginas----------------------");
        Optional<Libro> optional = mapLibro
                .values()
                .stream()
                .max(Comparator
                        .comparing(Libro::getNumPaginas));
        Libro libroMasPaginas = optional.get();
        System.out.println(libroMasPaginas);
        System.out.print("\n");
        System.out.println("---------------------------------------------------------------");
    }

    public void deshabilitarLibro(String isbn) throws Exception {
        try {
            if (!mapLibro.containsKey(isbn)) {
                throw new Exception("no se encontró isbn");
            }
            if (!mapLibro.get(isbn).isHabilitado()) {
                throw new Exception("Error: Este libro ya se encuentra borrado");
            }
            Libro lb = mapLibro.get(isbn);
            lb.setHabilitado(false);

            //mapLibro.put(isbn, lb);


            System.out.println(lb);
            System.out.println("Ha sido dado de baja");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void habilitarLibro(String isbn) throws Exception {
        try {
            if (!mapLibro.containsKey(isbn)) {
                throw new Exception("no se encontró isbn");
            }
            if (mapLibro.get(isbn).isHabilitado()) {
                throw new Exception("Error: Este libro ya esta habilitado");
            }
            Libro lb = mapLibro.get(isbn);
            lb.setHabilitado(true);
            //mapLibro.put(isbn, lb);
            System.out.println(lb);
            System.out.println("Ha sido dado de alta");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void buscarLibroPorIsbn(String isbn) {
        try {

            if (mapLibro.containsKey(isbn) && mapLibro.get(isbn).isHabilitado()) {
                System.out.println("");
                System.out.println("--------------Libro por ISBN--------------------");
                System.out.println(mapLibro.get(isbn));
                System.out.println("---------------------------------------------------------------");
            } else {
                System.out.println("El isbn ingresado no existe");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
}
