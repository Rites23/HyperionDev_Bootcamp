import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.ArrayList;

public class alphabeticalWords {

    public static void main(String[] args) throws FileNotFoundException {

        // Scanner reads the randomWords.txt file.
        Scanner reader = new Scanner(new File("randomWords.txt"));

        // We create an Array List to display the words in the file.
        ArrayList<String> words = new ArrayList<>();

        // The file has next lines, each line to read from the file.
        while (reader.hasNext()) {
            String word = reader.next();

            // The words start with an alphabet at index 0, the word is added for reading.
            if (Character.isAlphabetic(word.charAt(0))) ;
            words.add(word);

        }

        // The words are sorted in ascending order with the sort method.
        Collections.sort(words);
        System.out.println("Words in ascending order: ");
        for (String w : words) {
            System.out.println(w);
        }

        // The reader is closed after reading from the file.
        reader.close();
    }
}









