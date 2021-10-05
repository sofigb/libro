package book.principal;

import LibroEnum.Criterio;
import LibroEnum.GenClass;
import LibroEnum.GenEnum;
import LibroEnum.OrdenEnum;
import LibroEnum.SubGenderEnum;

import java.util.Scanner;
import libro.manager.BookManager;

public class BookPrincipal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        BookManager bookManager = BookManager.bookManagerCreate();

        bookManager.addBook("Relato de un naufrago", "Gabriel G. Marquez", 120, new GenClass(GenEnum.LIRICO, SubGenderEnum.EGOGLA));
        bookManager.addBook("Dagon", "Lovecraft", 240, new GenClass(GenEnum.NARRATIVO, SubGenderEnum.CUENTO));
        bookManager.addBook("Candido", "Voltaire", 100, new GenClass(GenEnum.NARRATIVO, SubGenderEnum.NOVELA));
        bookManager.addBook("Ubik", "Philip K . Dick", 550, new GenClass(GenEnum.NARRATIVO, SubGenderEnum.NOVELA_CORTA));
        bookManager.addBook("Dagon II", "Lovecraft", 500, new GenClass(GenEnum.NARRATIVO, SubGenderEnum.CUENTO));
        bookManager.addBook("Rayuela", "Julio Cortazar", 360, new GenClass(GenEnum.DRAMATICO, SubGenderEnum.DRAMA));

        /*bookManager.showBooks();
        bookManager.orderByPages(Criterio.ASCENDENTE);
        bookManager.bookMayorPages();

        System.out.println("---------------------------------------");
        System.out.println("Ingrese ISBN del libro que desea borrar");
        bookManager.unnableBook(scanner.nextLine());
        bookManager.orderByPages(Criterio.DESCENDENTE);
        System.out.println("---------------------------------------");

        System.out.println("---------------------------------------");
        System.out.println("Ingrese ISBN del libro que desea borrar");
        bookManager.unnableBook(scanner.nextLine());
        bookManager.orderByPages(Criterio.ASCENDENTE);
        System.out.println("---------------------------------------");

        System.out.println("---------------------------------------");
        System.out.println("Ingrese ISBN del libro que desea habilitar");
        bookManager.enableBook(scanner.nextLine());
        bookManager.orderByPages(Criterio.ASCENDENTE);
        System.out.println("---------------------------------------");

        System.out.println("---------------------------------------");
        System.out.println("Ingrese ISBN del libro que desea buscar");

        bookManager.findBookISBN(scanner.nextLine());
        System.out.println("---------------------------------------");
         */
        System.out.println("Ordenado por AUTOR");
        bookManager.sorted(Criterio.AUTOR, OrdenEnum.ASCENDENTE);
        bookManager.sorted(Criterio.AUTOR, OrdenEnum.DESCENDENTE);
        System.out.println("---------------------------------------");

        System.out.println("Ordenado por ISBN");
        bookManager.sorted(Criterio.ISBN, OrdenEnum.ASCENDENTE);
        bookManager.sorted(Criterio.ISBN, OrdenEnum.DESCENDENTE);
        System.out.println("---------------------------------------");

    }
}
