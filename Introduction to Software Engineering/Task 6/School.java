public class School {

    public static void main (String [] args){

        //Students

        Student sally = new Student("Sally", 15, 8, 'D');
        Student sipho = new Student("Sipho", 17 , 11, 'A');
        Student rajesh = new Student("Rajesh", 19, 12, 'B');

        System.out.println("Students\n");
        System.out.println(sally + "\n");
        System.out.println(sipho + "\n");
        System.out.println(rajesh);

        // Teacher

        Teacher Ronaldo = new Teacher("Cristiano", "Ronaldo", "Worlds Best", 37, 1000);
        Teacher Cavani = new Teacher("Edison", "Cavani", "Striker", 35, 5000);
        Teacher Pogba = new Teacher("Paul", "Pogba", "Midfielder", 30, 3000);

        System.out.println("\nTeachers\n");
        System.out.println(Ronaldo + "\n" );
        System.out.println(Cavani + "\n");
        System.out.println(Pogba + "\n");

        // Secretary

        Secretary Tyla = new Secretary("Tyla", "Erasmus", "Developer", 30, 10000);
        Secretary Janet = new Secretary("Janet", "Jackson", "Data Engineer", 25, 15000);
        Secretary Whitney = new Secretary("Whitney", "Houston", "Web Developer", 23, 12000);

        System.out.println("\nSecretary\n");
        System.out.println(Tyla + "\n");
        System.out.println(Janet + "\n");
        System.out.println(Whitney + "\n");

    }
}
