package sprint2.inlämningsuppgift2;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class BestGymEver {
    CustomerManager customerManager = new CustomerManager(/*false*/);

   // private final Path filePath = Paths.get("customers.txt");
   // private final Path logFilePath = Paths.get("pt.txt");
    Scanner s = new Scanner(System.in);
    public void gym (){

        System.out.println("Var god ange besökarens namn eller personnummer: ");
        String visitor = s.nextLine().trim().toUpperCase();

        Customer customer = null;

        if(!customerManager.isCustomerFound(visitor)){
            customerManager.printUnauthorized();
        }
        else {
            customer = customerManager.getCustomer(visitor);
            customerManager.checkMembershipStatusAndPrint(customer);
        }

        if (customerManager.isActiveMember()){
            String logEntry = customerManager.createLogEntry(customer);
            customerManager.writeLoggedVisitToFile(logEntry, "pt.txt");
        }
    }

    public static void main(String[] args) {
        BestGymEver b = new BestGymEver();
        b.gym();
    }

}
