import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Create a Java file called chores.java . Inside, write a Java lot-drawing
//program that allows the user to enter a list of names and a list of chores
//(equal lengths). The program should assign each person a random chore. Print
//out the pairs (i.e. name + chore)

public class chores {

    public static void main(String[] args) {
        System.out.println("Enter 3 names----------------------");

        List<String> nameList = new ArrayList<String>();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name: ");
            nameList.add(input.next());
        }

        System.out.println("\nEnter 3 chores-------------------");

        List<String> choreList = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter chore: ");
            choreList.add(input.next());
        }

        input.close();

        // Prints in original order
        System.out.println("\nChores list------------------------");

        List<String> list3 = new ArrayList<>();
        for (int i = 0; i < nameList.size(); i++) {
            list3.add(nameList.get(i) + ", " + choreList.get(i));
        }
        for (String str : list3) {
            System.out.println(str);
        }

        // Shuffles list
        System.out.println("\nShuffled Chores List------------------------");
        Collections.shuffle(nameList);
        // System.out.println( "Shuffled Names: " + nameList);

        Collections.shuffle(choreList);
        // System.out.println( "Shuffled Chores: " + choreList);

        List<String> list4 = new ArrayList<>();
        for (int i = 0; i < nameList.size(); i++) {
            list4.add(nameList.get(i) + ": " + choreList.get(i));
        }
        for (String str : list4) {
            System.out.println(str);
        }

    }

}
