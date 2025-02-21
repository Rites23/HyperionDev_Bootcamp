public class CompulsoryTask2 {

        public static void main(String args[]) {
            // Create a String to test with
            String testMessage = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

            // Prints out the number of characters in the String
            System.out.println(testMessage.length());

            // Prints out the character at the index of '4'
            System.out.println(testMessage.charAt(4));

            // Prints out a new String starting at index '11' and ending at index '20'
            System.out.println(testMessage.substring(11, 20));

            // Prints out the index number that the alphabets 'JKLMNO' starts at
            System.out.println(testMessage.indexOf("JKLMNO"));
        }

    }

