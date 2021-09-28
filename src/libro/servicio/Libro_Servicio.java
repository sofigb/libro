/*
 * Crear el método  para mostrar la información relativa al libro con el siguiente formato:
“El libro con ISBN creado por el autor tiene páginas”.
En el fichero main, crear 5 objetos Libro (los valores que se quieran), validando que el campo ISBN de valor numerico y solo permita 10 digitos
listarlos sin que pueda haber dos libros con el mismo ISBN  y mostrarlos por pantalla.
Por último, indicar cuál de los 2 tiene más páginas.
 */
package libro.servicio;

import java.util.HashMap;
import java.util.Optional;
import libro.Libro;

public class Libro_Servicio {

    Libro libro;
    HashMap<String, Libro> mapLibro;

    public Libro_Servicio() {

        mapLibro = new HashMap();
    }

    public void crearLibro(String titulo, String autor, Integer numPaginas) throws Exception {
        try {

            libro = new Libro(titulo, autor, numPaginas);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        agregarLibros(libro);
    }

    public Boolean duplicidadIsbn(String isbn) throws Exception {

        return (mapLibro.containsKey(isbn));

    }

    public void agregarLibros(Libro libro) throws Exception {
        try {
            if (duplicidadIsbn(libro.getIsbn())) {
                throw new Exception("El ISBN " + libro.getIsbn() + " ya existe en la lista de libros.");

            } else {
                mapLibro.put(libro.getIsbn(), libro);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrarLibros() {
        System.out.println("");
        System.out.println("--------------Lista de libros (sin ordenar)--------------------");
        mapLibro.forEach((key, value) -> System.out.println(value));
        System.out.print("\n");
    }

    public void mostrarListaOrdenada() {
        System.out.println("--------------Lista de libros ordenada por precio--------------------");
        mapLibro.values().stream()
                .sorted(Libro.compararCantidadPaginasAsc)
                .forEach((value) -> System.out.println(value));
        System.out.print("\n");
    }

    public void libroConMasPaginas() {
        System.out.println("--------------Libro con mayor precio--------------------");
        Optional<Libro> optional = mapLibro.values().stream().max(Libro.compararCantidadPaginasDesc);
        Libro libroMasPaginas = optional.get();
        System.out.println(libroMasPaginas);
        System.out.print("\n");
    }

}

/*public void mostrarLibros() {
        mapLibro.forEach((key, value) -> System.out.println(value));
    }

    public void libroConMasPaginas() {
        System.out.println("\"--------LISTA ORDENADA DE LIBROS--------\"");
        mapLibro.values().stream()
                .sorted(Libro.compararCantidadPaginasAsc)
                .forEach((value) -> System.out.println(value));

        System.out.println("\"--------LIBRO MAX CANTIDAD PAGINAS--------\"");
        System.out.println(mapLibro.values().stream().max(Libro.compararCantidadPaginasDesc).get()); // .get te imprime el objeto, sin el formato optional

    }*/
