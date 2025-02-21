import java.util.Scanner;

public class Project {

    static Scanner keyboard = new Scanner(System.in);

    // Attributes
    private static int projectNumber;
    private static String projectName;
    private static String buildingType;
    private static String address;
    private static String erfNumber;
    private static double totalFee;
    private static double amountPaid;
    private static String deadline;

    // Constructor
    public Project(int projectNumber, String projectName, String buildingType,
                   String address, String erfNumber, double totalFee, double amountPaid, String deadline) {


        projectDetails(projectNumber, projectName, buildingType, address, erfNumber, totalFee, amountPaid, deadline);
    }

    private static void projectDetails(int projectNumber, String projectName, String buildingType,
                                       String address, String erfNumber, double totalFee, double amountPaid,
                                       String deadline) {

        Project.projectNumber = projectNumber;
        Project.projectName = projectName;
        Project.buildingType = buildingType;
        Project.address = address;
        Project.erfNumber = erfNumber;
        Project.totalFee = totalFee;
        Project.amountPaid = amountPaid;
        Project.deadline = deadline;

    }

    static void detailsProject() {

        try {
            System.out.println("\nWelcome to the Poised Menu. You will now be prompted to create a New Project.");
            // Project Number
            System.out.println("\nPlease enter the Project Number: ");
            projectNumber = Integer.parseInt(keyboard.nextLine());
            // Project Name
            System.out.println("Please enter the Project Name: ");
            projectName = keyboard.nextLine();
            // Building Type
            System.out.println("Please enter the Building Type: ");
            buildingType = keyboard.nextLine();
            // Physical Address
            System.out.println("Please enter the Physical Address for the Project: ");
            address = keyboard.nextLine();
            // ERF Number
            System.out.println("Please enter the ERF Number: ");
            erfNumber = keyboard.nextLine();
            // Total fee for the project
            System.out.println("Please enter the Total Fee charged for the Project: ");
            totalFee = Double.parseDouble(keyboard.nextLine());
            // Amount paid to date by the customer
            System.out.println("Please enter the Total Amount paid to date: ");
            amountPaid = Double.parseDouble(keyboard.nextLine());
            // Project deadline
            System.out.println("Please enter the Project Deadline: ");
            deadline = keyboard.nextLine();

        } catch(NumberFormatException e) {
            System.out.println("Invalid Entry - Please enter project details again");
            detailsProject();
        }
    }

    // projectChangeDate method for changing date

    static void projectChangeDate() {
        System.out.println("\nYou have chosen to edit the deadline date for a project");
        System.out.println("\nEnter new deadline date for Project : ");
        String newDate = keyboard.nextLine();
        Project.setProjectDeadLine(newDate);
        System.out.println("\nThe new project deadline date is  " + newDate);
    }

    // setProjectDeadline method for changing deadline date

    static void setProjectDeadLine(String ProjectDeadlineDate) {
        Project.deadline = ProjectDeadlineDate;

    }

    // Changing the Project Amount Paid to Date

    static void amountPaidNew() {

        projectAmountPaid();
    }

    // projectAmountPaid method for changing amount paid

    static void projectAmountPaid() {
        System.out.println("\nYou have chosen to change the amount paid to date");
        System.out.println("\nEnter the New Amount Paid to Date : ");
        float y = keyboard.nextFloat();
        Project.setAmountPaidToDate(y);
        keyboard.nextLine();
        System.out.println("\nThe new project amount paid is  " + y);
    }

    static void setAmountPaidToDate(float amountPaidToDate) {
        Project.amountPaid = amountPaidToDate;
    }

    // projectFinalise method for finalising a project

    static void projectFinalise() {
        System.out.println("\n--- Project Finalisation---");
        System.out.print("\nWould you like to finalise the Project ? Y / N : ");
        String choice = keyboard.nextLine();
        if (choice.equals("Y")) {
            System.out.println("Project FINALISED");
        } else {
            System.out.println("Project NOT FINALISED");
        }
    }

    // printProject method for printing / displaying the project details

    static void printProject() {
        printProjectDetails();
    }

    private static void printProjectDetails() {
        String output = "\nProject Number           : " + projectNumber;
        output += "\nProject Name             : " + projectName;
        output += "\nBuilding Type            : " + buildingType;
        output += "\nProject Physical Address : " + address;
        output += "\nERF Number               : " + erfNumber;
        output += "\nProject Total Fee        : " + totalFee;
        output += "\nAmount Paid To Date      : " + amountPaid;
        output += "\nProject Deadline Date    : " + deadline;
        System.out.println(output);

    }
}

