package sprint2.inlämningsuppgift2;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.*;

public class CustomerManager {
    private final Path filePath = Paths.get("customers.txt");
    private final Path logFilePath = Paths.get("pt.txt");

    private final  List<Customer> customers = new ArrayList<>();
    private boolean isTesting;
    private boolean isActiveMember;
    public CustomerManager(/*boolean isTesting*/) {
        //this.isTesting = isTesting;
        List<String> lines = readFromFile(filePath);
        List<Customer> customerList = createCustomerObjects(lines);
        if (customerList != null) {
            customers.addAll(customerList);
        }
    }

    public boolean isActiveMember() {
        return isActiveMember;
    }

    public List<String> readFromFile(Path filePath) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath.toFile()))){
            String firstLine;
            String secondLine;
            while ((firstLine = br.readLine()) != null) {
                secondLine = br.readLine();
                if (secondLine == null) {
                    System.out.println("Filen har ett felaktigt format.");
                    break;
                }
                lines.add(firstLine);
                lines.add(secondLine);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Filen hittades inte.");
        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ett IO-fel inträffade.");
        }
        return lines;
    }


    public List<Customer> createCustomerObjects(List<String> lines){
        List<Customer> customerObjectList = new ArrayList<>();
        for (int i = 0; i < lines.size(); i += 2) {
            String firstLine = lines.get(i);
            String secondLine = lines.get(i + 1);
            String[] customerData = firstLine.split(", ");
            if (customerData.length != 2){
                System.out.println("Felaktigt format på kunddata.");
                return null;
            }
            String personalNumber = customerData[0];
            String name = customerData[1];
            try {
                LocalDate lastPaymentDate = LocalDate.parse(secondLine);
                Customer customer = new Customer(personalNumber, name, lastPaymentDate);
                customerObjectList.add(customer);
            }
            catch(DateTimeParseException e){
                e.printStackTrace();
                System.out.println("Det gick inte att konvertera datumet.");
            }
        }
        return customerObjectList;
    }


    public void printUnauthorized(){
        System.out.println(MembershipStatus.UNAUTHORIZED.getMembership());
    }


    public boolean isCustomerFound(String visitor){
        for (Customer customer:customers) {
            if (customer.getPersonalNumber().equals(visitor) ||
                    customer.getName().equalsIgnoreCase(visitor)) {
                return true;
            }
        }
        return false;
    }


    public Customer getCustomer(String visitor){
        for (Customer customer : customers) {
            if (customer.getPersonalNumber().equals(visitor) || customer.getName().equalsIgnoreCase(visitor)) {
                return customer;
            }
        }
        return null;
    }


    public void checkMembershipStatusAndPrint(Customer customer) {
        if (customer.getLastPaymentDate().isAfter(LocalDate.now().minusYears(1))) {
            isActiveMember = true;
            System.out.println(MembershipStatus.CURRENT_MEMBER.getMembership());
        } else {
            System.out.println(MembershipStatus.EX_MEMBER.getMembership());
        }
    }


    public String createLogEntry(Customer customer){
        String logEntry = String.format("%s, %s, %s%n", customer.getPersonalNumber(),
                customer.getName(), LocalDate.now());
        return logEntry;
    }


    public void writeLoggedVisitToFile(String logEntry, String path){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write(logEntry);
        }
        catch (IOException e){
            System.out.println("Ett fel uppstod när besöket skulle loggas.");
        }
    }
}
