package libro.principal;

import java.util.Scanner;
import libro.servicio.Libro_Servicio;

public class Libro_Principal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Libro_Servicio libroS = new Libro_Servicio();

        //Control de duplicidad de isbn
//        Libro libro = new Libro("7455518643", "Rayuela2", "Julio Cortazar", 360);
//        Libro libro2 = new Libro("7455518643", "Rayuela3", "Julio Cortazar", 360);
//        libroS.agregarLibros(libro);
//        libroS.agregarLibros(libro2);
        libroS.agregarLibro("Relato de un naufrago", "Gabriel G. Marquez", 120);
        libroS.agregarLibro("Dagon", "Lovecraft", 240);
        libroS.agregarLibro("Candido", "Voltaire", 100);
        libroS.agregarLibro("Ubik", "Philip K . Dick", 550);
        libroS.agregarLibro("Dagon II", "Lovecraft", 500);
        libroS.agregarLibro("Rayuela", "Julio Cortazar", 360);

        libroS.mostrarLibros();
        libroS.mostrarListaOrdenada();
        libroS.libroConMasPaginas();

        System.out.println("---------------------------------------");
        System.out.println("Ingrese ISBN del libro que desea borrar");
        libroS.borrarLibro(scanner.nextLine());
        libroS.mostrarListaOrdenada();
        System.out.println("---------------------------------------");

        System.out.println("---------------------------------------");
        System.out.println("Ingrese ISBN del libro que desea borrar");
        libroS.borrarLibro(scanner.nextLine());
        libroS.mostrarListaOrdenada();
        System.out.println("---------------------------------------");

        System.out.println("---------------------------------------");
        System.out.println("Ingrese ISBN del libro que desea habilitar");
        libroS.habilitarLibro(scanner.nextLine());
        libroS.mostrarListaOrdenada();
        System.out.println("---------------------------------------");
    }
}
