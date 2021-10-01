package book.principal;

import gender.GenClass;
import gender.GenEnum;
import gender.SubGenderEnum;
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

        bookManager.showBooks();
        bookManager.showBooksSorted();
        bookManager.bookMayorPages();

        System.out.println("---------------------------------------");
        System.out.println("Ingrese ISBN del libro que desea borrar");
        bookManager.unnableBook(scanner.nextLine());
        bookManager.showBooksSorted();
        System.out.println("---------------------------------------");

        System.out.println("---------------------------------------");
        System.out.println("Ingrese ISBN del libro que desea borrar");
        bookManager.unnableBook(scanner.nextLine());
        bookManager.showBooksSorted();
        System.out.println("---------------------------------------");

        System.out.println("---------------------------------------");
        System.out.println("Ingrese ISBN del libro que desea habilitar");
        bookManager.enableBook(scanner.nextLine());
        bookManager.showBooksSorted();
        System.out.println("---------------------------------------");

        System.out.println("---------------------------------------");
        System.out.println("Ingrese ISBN del libro que desea buscar");

        bookManager.findBookISBN(scanner.nextLine());
        System.out.println("---------------------------------------");

    }
}
