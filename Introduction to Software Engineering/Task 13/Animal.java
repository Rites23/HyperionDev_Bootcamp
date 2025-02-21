import java.util.Scanner;

// Create Super Class Animal

public class Animal {

    public static void main(String[] args){

        // Creating Lion Object

        System.out.println("\nLion Attributes");

        Animal.Lion lion = new Animal.Lion(30, false, 80);
        System.out.println(lion);

        // Creating Cheetah Object

        System.out.println("\nCheetah Attributes");

        Lion.Cheetah cheetah = new Lion.Cheetah(30, true, 120);
        System.out.println(cheetah);
    }

    Scanner keyboard = new Scanner(System.in);

    // Variables

    public static int numTeeth = 0;
    private boolean spots = false;
    private int weight = 0;

    public Animal(int numTeeth, boolean spots, int weight) {
        this.setNumTeeth(numTeeth);
        this.setSpots(spots);
        this.setWeight(weight);
    }

    // Getters and Setters

    public static int getNumTeeth() {
        return numTeeth;
    }

    public void setNumTeeth(int numTeeth) {
        Animal.numTeeth = numTeeth;
    }

    public boolean getSpots() {
        return spots;
    }

    public void setSpots(boolean spots) {
        this.spots = spots;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // Creating an Object Lion - Extends Animal

    public static class Lion extends Animal {
        String type = "";

        public Lion(int numTeeth, boolean spots, int weight) {
            super(numTeeth, spots, weight);
            type(weight);
        }

        // Asking user to input weight for Type Classification

        public void type(int weight) {
            super.setWeight(weight);

            System.out.print("\nPlease enter weight of Lion : ");
            Lion.super.weight = keyboard.nextInt();
            if (Lion.super.weight <= 80) {
                type = "Cub";
            } else if (Lion.super.weight <= 120) {
                type = "Female";
            } else {
                type = "Male";
            }
        }

        // Print toString Method

        public String toString() {
            String output = "\nLion : Number Teeth " + getNumTeeth();
            output += "\nLion - Spots  : " + getSpots();
            output += "\nLion - Weight : " + getWeight() + " Kilograms";
            output += "\nThe Type of the Lion is a : " + type;
            return output;
        }

        // Creating an Object Cheetah - Extends Animal

        public static class Cheetah extends Animal{

            public Cheetah(int numTeeth, boolean spots, int weight) {
                super(numTeeth, spots, weight);
            }

            //Print toString Method

            public String toString() {
                String output = "\nCheetah : Number Teeth " + getNumTeeth();
                output += "\nCheetah - Spots  : " + getSpots();
                output += "\nCheetah - Weight : " + getWeight() + " Kilograms";
                return output;
            }
        }
    }
}
