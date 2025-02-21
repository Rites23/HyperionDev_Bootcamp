public class Errors
{

    public static void main (String[] args)
    {
        //Semicolon was missing at the end next to the bracket.
        //Logical Error
        System.out.println("Welcome to my first program!\n");

        //"24 years" is the incorrect input. We only require input as "24".
        //Logical Error
        String ageStr = "24";

        int age = Integer.parseInt(ageStr);

        System.out.println("I'm " + age + " years old.");

        //String cannot be converted to int. Therefore, we changed it to String.
        //Logical Error
        String three = "3";

        //ToString added to the below. 
        int ageToString = Integer.parseInt(ageStr);
        int threeToString = Integer.parseInt(three);
        int answerYears = ageToString + threeToString;

        System.out.println("Total number of years: " + answerYears);

        //As with "int answerMonths = answerYears * 12", "it will print "In 3 years and 6 months, I'll be 324 months old",
        //which is incorrect. It has to be changed to "int answerMonths = answerYears * 12 + 6" which will be 330 months.
        int answerMonths = answerYears * 12 + 6;

        System.out.println("In 3 years and 6 months, I'll be " + answerMonths + " months old");

        //Once you've corrected all the errors, the answer should be 330.
    }

}
