/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.manager;


import LibroEnum.Criterion;
import LibroEnum.GenClass;
import LibroEnum.GenEnum;
import LibroEnum.OrdenEnum;
import LibroEnum.SubGenderEnum;
import book.Book;
import java.util.stream.Stream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lucho
 */
public class BookManagerTest {
    
    public BookManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of bookManagerCreate method, of class BookManager.
     */
    @Test
    public void testBookManagerCreate() {
        System.out.println("bookManagerCreate");
        BookManager expResult = null;
        BookManager result = BookManager.bookManagerCreate();
        
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addBook method, of class BookManager.
     */
    @Test
    public void testAddBook() throws Exception {
        System.out.println("addBook");
        String tittle = "";
        String author = "";
        Integer pages = null;
        GenClass genClass = null;
        BookManager instance = BookManager.bookManagerCreate();
        instance.addBook(tittle, author, pages, genClass);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of duplicatedIsbn method, of class BookManager.
     * @throws java.lang.Exception
     */
    @Test
    public void testDuplicatedIsbn() throws Exception {
        System.out.println("duplicatedIsbn");
        BookManager instance = BookManager.bookManagerCreate();
        instance.addBook("nombre","autor",200,new GenClass(GenEnum.DIDACTICO,SubGenderEnum.COMEDIA));
        String isbn = instance.mapBook.values().stream().findFirst().get().getIsbn();
        Boolean expResult = true;
        Boolean result = instance.duplicatedIsbn(isbn);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of showBooks method, of class BookManager.
     */
    @Test
    public void testShowBooks() {
        System.out.println("showBooks");
        BookManager instance = null;
        instance.showBooks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sorted method, of class BookManager.
     */
    @Test
    public void testSorted() {
        System.out.println("sorted");
        Criterion criterion = null;
        OrdenEnum orden = null;
        BookManager instance = null;
        instance.sorted(criterion, orden);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bookMayorPages method, of class BookManager.
     */
    @Test
    public void testBookMayorPages() {
        System.out.println("bookMayorPages");
        BookManager instance = null;
        instance.bookMayorPages();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unnableBook method, of class BookManager.
     */
    @Test
    public void testUnnableBook() throws Exception {
        System.out.println("unnableBook");
        String isbn = "";
        BookManager instance = null;
        instance.unnableBook(isbn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listBookEnable method, of class BookManager.
     */
    @Test
    public void testListBookEnable() {
        System.out.println("listBookEnable");
        BookManager instance = null;
        Stream<Book> expResult = null;
        Stream<Book> result = instance.listBookEnable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of enableBook method, of class BookManager.
     */
    @Test
    public void testEnableBook() throws Exception {
        System.out.println("enableBook");
        String isbn = "";
        BookManager instance = null;
        instance.enableBook(isbn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findBookISBN method, of class BookManager.
     */
    @Test
    public void testFindBookISBN() {
        System.out.println("findBookISBN");
        String isbn = "";
        BookManager instance = null;
        instance.findBookISBN(isbn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
