package sprint2.inlämningsuppgift2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CustomerManagerTest {



 /*   @Test
    public void readLinesFromFileTest(){
        CustomerManager customerManager = new CustomerManager(true);
        Path filePath = Paths.get("testfile1.txt");
        List<String> expected = Arrays.asList("Detta är ett test.", "Vi kollar om dessa rader läses in.");
        List<String> actual = customerManager.readFromFile(filePath);
        Assertions.assertEquals(expected, actual);
        Assertions.assertNotEquals(expected, Arrays.asList("Något annat", "något annat."));
    }

    @Test
    public void createCustomerObjectsTest(){
        CustomerManager customerManager = new CustomerManager(true);
    }

    @Test
    public void printUnauthorizedTest(){
        CustomerManager customerManager = new CustomerManager(true);
    }


    @Test public void isCustomerFoundTest(){
        CustomerManager customerManager = new CustomerManager(true);
    }

    @Test
    public void getCustomerTest(){
        CustomerManager customerManager = new CustomerManager(true);
    }


    @Test
    public void checkMembershipStatusAndPrintTest(){
        CustomerManager customerManager = new CustomerManager(true);
    }



    @Test
    public void createLogEntryTest(){
        CustomerManager customerManager = new CustomerManager(true);
    }


  */
    @Test
    public void writeLoggedVisitToFileTest() {
        CustomerManager customerManager = new CustomerManager();
        Path filePath = Paths.get("testfile2.txt");

        String testLine = "Vi testar om det funkar att skriva till fil.";
        String testLine2 = "8512021234, Chamade Coriola \n" +
                "2018-03-12";
        //String secondLine = "Testar testar.";

        customerManager.writeLoggedVisitToFile(testLine2, "testfile2.txt");
        //customerManager.writeLoggedVisitToFile(secondLine, filePath);

        List<String> fileContent = customerManager.readFromFile(filePath);
        System.out.println("testline2: "+testLine2);
        System.out.println("fileContent: "+fileContent);

        Assertions.assertTrue(fileContent.get(2).equals("Chamade Coriola"));
    }
}