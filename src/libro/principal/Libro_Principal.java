package libro.principal;

import java.util.UUID;
import libro.Libro;
import libro.servicio.Libro_Servicio;

public class Libro_Principal {
 //hola mundo 
    public static void main(String[] args) throws Exception {

        Libro_Servicio libroS = new Libro_Servicio();

        //Control de duplicidad de isbn
        Libro libro = new Libro("7455518643", "Rayuela2", "Julio Cortazar", 360);
        Libro libro2 = new Libro("7455518643", "Rayuela3", "Julio Cortazar", 360);
        libroS.agregarLibros(libro);
        libroS.agregarLibros(libro2);

        libroS.crearLibro("Relato de un naufrago", "Gabriel G. Marquez", 120);
        libroS.crearLibro("Dagon", "Lovecraft", 240);
        libroS.crearLibro("Candido", "Voltaire", 100);
        libroS.crearLibro("Ubik", "Philip K . Dick", 360);
        libroS.crearLibro("Dagon II", "Lovecraft", 500);
        libroS.crearLibro("Rayuela", "Julio Cortazar", 360);

        libroS.mostrarLibros();
        libroS.mostrarListaOrdenada();
        libroS.libroConMasPaginas();
        //hola mundo 
    }

}
