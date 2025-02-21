import java.util.Scanner;

public class Person {

    static Scanner keyboard = new Scanner(System.in);

    // Attributes for person architect, customer, contractor

    private static String name;
    private static String telephoneNumber;
    private static String emailAddress;
    private static String physicalAddress;

    // Create new Person Objects - architect, customer, contractor

    public Person architect = new Person(name, telephoneNumber, emailAddress, physicalAddress);
    public Person customer = new Person(name, telephoneNumber, emailAddress, physicalAddress);
    public Person contractor = new Person(name, telephoneNumber, emailAddress, physicalAddress);

    // Constructors for Person - Contractor

    public Person ( String name,  String telephoneNumber, String emailAddress, String physicalAddress){

        Person.name = name;
        Person.telephoneNumber = telephoneNumber;
        Person.emailAddress = emailAddress;
        Person.physicalAddress = physicalAddress;
    }

    // Set Contractor New Details. Created a contractorDetails method

    static void contractorDetails(){
        // Project Contractor Details

        System.out.println("""
                           
                           You have chosen to Edit a Contractor
                           
                           --- Entry of Contractor Details ---);
                           """);

        System.out.println("Please enter the Current Contractor Name    : ");
        name = keyboard.nextLine();
        System.out.println("Please enter the Current Telephone Number   : ");
        telephoneNumber = keyboard.nextLine();
        System.out.println("Please enter the Current E-Mail Address     : ");
        emailAddress = keyboard.nextLine();
        System.out.println("Please enter the Current Physical Address   : ");
        physicalAddress = keyboard.nextLine();

        // Update Contractors Contact Details

        System.out.println("""
                           
                           You have chosen to Update a Contractor
                           
                           --- Entry of New Contractor Details - Update Details ---
                           """);

        System.out.println("Please enter the new Contractor Name    : ");
        String newName = keyboard.nextLine();
        Person.setName(newName);
        System.out.println("Enter the Contractors new Telephone Number : ");
        String newTelephoneNumber = keyboard.nextLine();
        Person.setTelephoneNumber(newTelephoneNumber);
        System.out.println("Enter the Contractors new E-Mail Address : ");
        String newEmailAddress = keyboard.nextLine();
        Person.setEmailAddress(newEmailAddress);
        System.out.println("Please enter the new Physical Address   : ");
        String newPhysicalAddress = keyboard.nextLine();
        Person.setPhysicalAddress(newPhysicalAddress);
    }

    // Setting the new contractor details

    public static void setName(String name) {
        Person.name = name;
    }

    public static void setTelephoneNumber(String telephoneNumber) {
        Person.telephoneNumber = telephoneNumber;
    }

    public static void setEmailAddress(String emailAddress) {
        Person.emailAddress = emailAddress;
    }

    public static void setPhysicalAddress(String physicalAddress) {
        Person.physicalAddress = physicalAddress;
    }

    // printPerson method - Prints out the person details

    static void printPerson(){
        String person = "\nName : " + name;
        person += "\nTelephone Number : " + telephoneNumber;
        person += "\nE-mail Address : " + emailAddress;
        person += "\nPhysical Address : " + physicalAddress;
        System.out.println(person);
    }
}