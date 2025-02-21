// We create a Student interface [ which is a special type of class that acts as a blueprint of classes to come.
// It is an abstract type that specifies the behavior of future classes.
// An interface will contain method headings, in this case, describe() , but the methods in an interface do not
// contain any code or logic.
// The logic for the methods specified in the interface is written in the classes that implement the interface.
// In essence, an interface shows a class what to do, and not how to do it ]

interface Student {
    void describe();
}

 // We create the Student 1 class that implements the Student interface.
 // Since Student 1 class implements the Student interface, it must implement describe() method specified in the
 // Student interface


class Student1 implements Student {

    @Override
    public void describe() {
        System.out.println();
        System.out.println("""
                ==================================================
                
                Student RegNo. and Full Name
                Student 1: Susan Smith
                           
                Bootcamp
                -Registered for the Software Engineering Bootcamp
                           
                Level Completed
                - Completed Level 1
                
                ==================================================
                """);
    }
}


 // We create the Student 2 class that implements the Student interface.
 // Since Student 2 class implements the Student interface, it must implement describe() method specified in the
 // Student interface

class Student2 implements Student {

    @Override
    public void describe() {

        System.out.println("""
                Student RegNo. and Full Name
                Student 2 : Michael Jackson

                Bootcamp
                - Registered for the Web Development Bootcamp

                Level Completed
                - Completed Level 1
                - Completed Level 2
                - Completed Level 3

                Bootcamp
                - Registered for the Software Engineering Bootcamp
                
                ==================================================
                """);
    }
}

 // We create the Student 3 class that implements the Student interface.
 // Since Student 3 class implements the Student interface, it must implement describe() method specified in the
 // Student interface


class Student3 implements Student {

    @Override
    public void describe() {

        System.out.println("""
               Student RegNo. and Full Name
               Student 3 : Saoirse Ronan
                           
               Bootcamp
               - Registered for the Web Development Bootcamp
                           
               Level Completed
               - Completed Level 1
               - Completed Level 2
               - Completed Level 3
                           
               Bootcamp
                           
               - Registered for the Software Engineering Bootcamp
                           
               Level Completed
               - Completed Level 1
               
               ==================================================
               """);
    }
}

class StudentFactory {

// Use getStudent method to get an object of type Student

    public Student getStudent(String studentType) {
        if(studentType == null) {
            return null;
        }
        if (studentType.equalsIgnoreCase("Susan Smith")) {
            return new Student1();

        } else if (studentType.equalsIgnoreCase("Michael Jackson")) {
            return new Student2();

        } else if (studentType.equalsIgnoreCase("Saoirse Ronan")) {
            return new Student3();
        }

        return null;
    }
}

// Main Class where the three New Student objects are described

public class StudentBootcamp {

    public static void main(String[] args ) {
        StudentFactory studentFactory = new StudentFactory();

        // get an object of Student 1 and call its describe method.
        Student student1 = studentFactory.getStudent("Susan Smith");
        student1.describe();

        // get an object of Student 2 and call its describe method.
        Student student2 = studentFactory.getStudent("Michael Jackson");
        student2.describe();

        // get an object of Student 3 and call its describe method.
        Student student3 = studentFactory.getStudent("Saoirse Ronan");
        student3.describe();
    }
}

