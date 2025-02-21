import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // Variables
        int projectNumber;
        String projectName;
        String buildingType;
        String address;
        String erfNumber;
        double totalFee;
        double amountPaid;
        String deadline;

        String personType = "Contractor";

            System.out.println("Welcome to the Poised Menu. You will now be prompted to create a New Project.");

            // Project Number
            System.out.println("\nPlease enter the Project Number: ");
            projectNumber = keyboard.nextInt();
            keyboard.nextLine();

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
            totalFee = keyboard.nextDouble();
            keyboard.nextLine();

            // Amount paid to date by the customer
            System.out.println("Please enter the Total Amount paid to date: ");
            amountPaid = keyboard.nextDouble();
            keyboard.nextLine();

            // Project deadline
            System.out.println("Please enter the Project Deadline: ");
            deadline = keyboard.nextLine();

            // A new project object is created
            Project createProject = new Project(projectNumber, projectName, buildingType, address,
                    erfNumber, totalFee, amountPaid, deadline);
            System.out.println("Your Project was successfully created.");

            // Calling the DisplayProject() method in the Project.
            System.out.println(createProject.DisplayProject());


            //Short menu with options to edit, update, finalise or exit.
            System.out.println("\nPlease choose a number option from the menu below: \n"
                    + "\n1. Edit existing projects" + "\n2. Add New contractor details"
                    + "\n3. Edit Contractor Details" + "\n4. Finalise the project" + "\n5. Exit program");

            // Storing their choice in 'userChoice' variable.
            int userChoice = keyboard.nextInt();

            // if condition to run if the user chooses option 1, to edit existing projects.
            if (userChoice == 1) {
                // They are then given a choice of either editing the due date or the amount paid to date.
                System.out.println("Would you like to:" +
                        "\n1. Edit the Project due date or" +
                        "\n2. Edit the Total Amount paid of the fee to date?" +
                        "\nChoose either 1 or 2");

                // Choice is stored in the 'editChoice' variable.
                int editChoice = keyboard.nextInt();
                keyboard.nextLine();

                if (editChoice == 1) {
                    // Prompted to enter a new due date.
                    System.out.println("\nPlease enter a new due date for the Project: ");

                    // Deadline variable updated to store the new due date.
                    deadline = keyboard.nextLine();

                    // New Project Object created to include the new due date value.
                    Project projectEdit = new Project(projectNumber, projectName, buildingType, address,
                            erfNumber, totalFee, amountPaid, deadline);
                    System.out.println(projectEdit.DisplayProject());

                } else if (editChoice == 2)

                    // The user is prompted to enter a new amount paid to date.
                    System.out.println("\nPlease enter a new total amount of the fee paid to date: ");


                // amountPaid variable is updated to store the new value.
                amountPaid = keyboard.nextDouble();

                // New Project Object created to include the updated amount paid value.
                Project projectEdit2 = new Project(projectNumber, projectName, buildingType, address,
                        erfNumber, totalFee, amountPaid, deadline);
                System.out.println(projectEdit2.DisplayProject());

            }else if (userChoice==2) { // If they choose option 2 from the menu.

                // User is prompted to enter the contractors details to create a new contractor.
                keyboard.nextLine();
                System.out.println("\nPlease enter the Contractors name: ");
                String name = keyboard.nextLine();

                System.out.println("\nPlease enter the Contractors contact number: ");
                String number = keyboard.nextLine();

                System.out.println("\nPlease enter the contractor's  Email Address: ");
                String email = keyboard.nextLine();

                System.out.println("\nPlease enter the contractor's Physical Address: ");
                address = keyboard.nextLine();

                // New person object created with the updated details for the contractor.
                Person contractorEdit = new Person(personType, name, number, email, address);

                // Successful message printed out, as well as the details for the contractor.
                System.out.println("Your contractor details have been added successfully. \n");
                System.out.println(contractorEdit.DisplayPerson());

            }else if (userChoice==3){ // If they choose option 3 from the menu.

                // User is prompted to enter the contractors details to update the information.
                keyboard.nextLine();
                System.out.println("\nPlease enter the Contractors new contact name: ");
                String name = keyboard.nextLine();

                System.out.println("\nPlease enter the Contractors new contact number: ");
                String number = keyboard.nextLine();

                System.out.println("\nPlease enter the contractor's new Email Address: ");
                String email = keyboard.nextLine();

                System.out.println("\nPlease enter the contractor's new Physical Address: ");
                address = keyboard.nextLine();

                // New person object created with the updated details for the contractor.
                Person contractorEdit = new Person(personType, name, number, email, address);

                // Successful message printed out, as well as the details for the updated contractor.
                System.out.println("Your contractor details have been update successfully. \n");
                System.out.println(contractorEdit.DisplayPerson());

            } else if (userChoice == 4)  // If they choose option 4 from the menu.
            {
                if (totalFee == amountPaid)  // If they have already paid the project fee in full.
                {
                    // No invoice is generated, they are prompted to enter a completion date.
                    System.out.println("The project has been paid in full. No invoice generated.");
                    System.out.println("Please add a completion date for this project: ");

                    String completion = keyboard.nextLine();  // Completion date stored in string variable.
                    String finalise = "Finalised";

                    // The project object is then displayed with all details including the completion date,
                    // as well as the 'finalised' state of the project.
                    System.out.println(createProject.DisplayProject() + "\nCompletion Date: " + completion);
                    System.out.println("\nProject status: " + finalise);


                } else if (totalFee != amountPaid)  // If the customer has not yet paid in full.
                {

                    keyboard.nextLine();
                    System.out.println("Your invoice will be generated with the following details: ");
                    System.out.println("\nPlease enter the customer's full name: ");
                    String name = keyboard.nextLine();

                    System.out.println("\nPlease enter the customer's contact number: ");
                    String number = keyboard.nextLine();

                    System.out.println("\nPlease enter the customer's email address: ");
                    String email = keyboard.nextLine();

                    System.out.println("\nPlease enter the customer's physical address: ");
                    address = keyboard.nextLine();

                    // The user is also prompted to add a completion date for the project.
                    System.out.println("Please add a completion date for this project: ");

                    String completion2 = keyboard.nextLine();  // Completion date stored in string variable.
                    String finalise2 = "finalised";


                    // The project object is then displayed with all details including the completion date,
                    // as well as the finalised status of the project.
                    System.out.println(createProject.DisplayProject() + "\nCompletion Date: " + completion2);
                    System.out.println("Project status: " + finalise2);

                }
            }

            if (userChoice == 5)  // If the user chooses 5 from the menu.
            {
                // Successful logout message.
                System.out.println("You are successfully logged out.");
            }
        }

    }

