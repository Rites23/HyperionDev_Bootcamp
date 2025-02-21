public class Project {

    // Attributes
    int projectNumber;
    String projectName;
    String buildingType;
    String address;
    String erfNumber;
    double totalFee;
    double amountPaid;
    String deadline;

    // Constructor
    public Project(int projectNumber, String projectName, String buildingType,
                      String address, String erfNumber, double totalFee, double amountPaid, String deadline) {

        this.projectNumber = projectNumber;
        this.projectName = projectName;
        this.buildingType = buildingType;
        this.address = address;
        this.erfNumber = erfNumber;
        this.totalFee = totalFee;
        this.amountPaid = amountPaid;
        this.deadline = deadline;

    }

    // This method to displays the project.
    public String DisplayProject() {

        System.out.println("The details for project " + projectName + " are as follows: \n");
        String output = "Project Number: " + projectNumber;
        output += "\nProject Name: " + projectName;
        output += "\nBuilding Type: " + buildingType;
        output += "\nPhysical Address: " + address;
        output += "\nERF Number: " + erfNumber;
        output += "\nProject Fee Total: R" + totalFee;
        output += "\nAmount Paid to Date: R" + amountPaid;
        output += "\nProject Deadline: " + deadline;

        return output;  // Output string returned.

    }

}

