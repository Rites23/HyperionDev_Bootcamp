public class Main {

    public static void main(String[] args) {

        // Welcoming User
        System.out.println("Hi!, Welcome to the BOOKSTORE ASSISTANT");

        label:
        while (true){
            // Presenting options to the user
            System.out.println("""
                
                Please Enter a number corresponding to an Option:
                                
                1. Enter book
                2. Update book
                3. Delete book
                4. Search books
                0. Exit
                                
                """);

            // taking user's option
            System.out.println("Enter Option here:");
            String userOption = UserInput.StringInput();

            // if userOption = 1
            switch (userOption) {
                case "1":
                    CaptureBook.RecordBook();
                    break;
                //--------------------------------------
                // if userOption is to update a book
                case "2":
                    UpdateBook.UpdateABook();
                    break;
                //--------------------------------------
                // if userOption is to delete a book
                case "3":
                    DeleteBook.DeleteABook();
                    break;
                //--------------------------------------
                // if userOption is to search for a specific book
                case "4":
                    SearchBooks.LookForBook();
                    break;
                //--------------------------------------
                // if userOption is to exit
                case "0":
                    System.out.println("Thank you for using the BookStore Assistant...Bye!");
                    break label;
                //--------------------------------------
                // if userOption is not valid
                default:
                    System.out.println("Invalid Option, Please Retry!");
                    break;
            }
        }
    }
}
