public class Teacher {

    //attributes
    private String firstName;
    private String lastName;
    private String qualification;
    private int age;
    private double salary;


   //Constructor
    public Teacher(String firstName, String lastName, String qualification, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.qualification = qualification;
        this.age = age;
        this.salary = salary;
    }

    public String getName(){
        return firstName;
    }
    public int getAge(){
        return age;
    }

    // toString method
    public String toString(){
        String output = "firstName:" + firstName;
        output += "\nlastName:" + lastName;
        output += "\nqualification:" + qualification;
        output += "\nage:" + age;
        output += "\nsalary:" + salary;

        return output;

    }
}



