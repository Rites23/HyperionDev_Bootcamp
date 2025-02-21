//Software Engineering Task 24 - Capstone Project III.

// Person is a subclass that creates and displays a person object.
// This class contains variables and a constructor to create person objects for the Poised Management System.
// It also contains a method to display the created person object.
// The PoisedMenu class, which runs the main program, calls on methods from this class to add new projects.

public class Person {

    // Attribute variables declared for use in this class.
    // These are set to 'private' to ensure weak coupling between classes.
    private String personType;
    private String name;
    private int number;
    private String email;
    private String address;

     // The constructor method Person creates a new person object with five parameters of information.
     // A person object will contain info and contact details related to someone involved with a project undertaken
     // by the Poised Engineering Company.

    public Person(String personType, String name, int number, String email, String address) {
        this.personType = personType;
        this.name = name;
        this.number = number;
        this.email = email;
        this.address = address;  // Person object constructed with variable attributes.

    }

     // The method DisplayPerson displays all the attributes of the person object in an easy-to-read format
     // @return returns a string output with all person object information

    public String DisplayPerson() {
        System.out.println(personType + " details are as follows: \n");
        String output = "Title: " + personType;
        output += "\nName: " + name;
        output += "\nNumber: " + number;
        output += "\nEmail Address: " + email;
        output += "\nPhysical Address: " + address;

        return output;  // Output string returned.

    }
}


