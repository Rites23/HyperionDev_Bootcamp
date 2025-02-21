import java.util.Scanner;

public class Menu {

    public static void menuShow(){
        System.out.println("""

                ----------  M E N U ----------

                1. ADD New Project
                2. Edit Due date for project
                3. Edit contractor details
                4. Edit Amount Paid to date
                5. Finalise a project
                6. Exit

                Please enter a menu choice :\s""");
    }
    public static void main(String[] args) {

        int menu_choice = 0;

        //Short menu with options to edit, update, finalise or exit.

        menuShow();

        while (menu_choice != 6) {
            menu_choice = getMenu_Choice();

            if (menu_choice == 1) {
                Project.detailsProject();
                Project.printProject();

            } else if (menu_choice == 2) {
                Project.projectChangeDate();
            } else if (menu_choice == 3) {
                Person.contractorDetails();
                Person.printPerson();
            } else if (menu_choice == 4) {
                Project.amountPaidNew();
            } else if (menu_choice == 5) {
                Project.projectFinalise();
            }
            menuShow();
        }

        // creates a getMenu_choice method for menu choice

    }

    private static int getMenu_Choice() {
        Scanner keyboard = new Scanner(System.in);
        int menu_choice = 0;

        // Try block to check for Integer for Menu Option [ 1 - 6 ]

        try {
            menu_choice = Integer.parseInt(keyboard.nextLine());
            return menu_choice;

            // Catch block returns an error message if choice is not [ 1 - 6 ]

        } catch (NumberFormatException e){
            System.out.print("\n*** ERROR! Please enter an option (1 - 6) from the Menu ***\n");
        }
        return menu_choice;
    }
}



