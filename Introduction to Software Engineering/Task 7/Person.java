public class Person {

    // Attributes
    String personType;
    String name;
    String number;
    String email;
    String address;

    // Constructor
    public Person(String personType, String name, String number, String email, String address) {

        this.personType = personType;
        this.name = name;
        this.number = number;
        this.email = email;
        this.address = address;

    }


    // This method displays the person object details.
    public String DisplayPerson() {

        System.out.println(personType + " details are as follows: \n");
        String output = "Title: " + personType;
        output += "\nName: " + name;
        output += "\nNumber: " + number;
        output += "\nEmail Address: " + email;
        output += "\nPhysical Address: " + address;

        return output;  // String output returned.
    }
}

