import java.sql.*;

public class UpdateBook {
    /**
     * Class UpdateBook is used to change specific info about a book
     */

    public static void UpdateABook() {
        try {
            // Connecting to the ebookstore database, via the jdbc:mysql: channel on localhost (this PC)
            // Using username "root", password "P@ss.123!".
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ebookstore?useSSL=false",
                    "root",
                    "P@ss.123!"
            );
            // Create a direct line to the database for running our queries
            Statement statement = connection.createStatement();
            ResultSet results;
            int rowsAffected;
            //---------------------------------------------------------

            // asking user to enter id of book they want to change
            System.out.println("Enter Book Id:");
            int bookId = UserInput.IntegerInput();

            // Asking user to select info they want updated
            System.out.println("""
                       Enter number corresponding to book information you would like to change:
                       
                       1 - id
                       2 - title
                       3 - author
                       4 - Quantity
                       """);

            // Taking users option
            int infoToChange = UserInput.IntegerInput();

            // if user's choice is to change the id
            if (infoToChange == 1){
                System.out.println("Enter new id:");
                int newId = UserInput.IntegerInput();

                // Updating the book id
                PreparedStatement pstmt = connection.prepareStatement("UPDATE`books` SET id=?  WHERE id=?");
                pstmt.setInt(1,newId);
                pstmt.setInt(2,bookId);

                // executing the update
                rowsAffected = pstmt.executeUpdate();

                // informing user whether their query has been executed or not
                if (rowsAffected != 0){
                    System.out.println("Query complete, " + rowsAffected + " rows updated.");
                }
                else{
                    System.out.println("Book with Id: " + bookId + " does not exist!");
                }
            }
            //-----------------------------------------------------------------------------
            // if user's choice is to change the title
            else if (infoToChange == 2){
                System.out.println("Enter new Title:");
                String newTitle = UserInput.StringInput();

                // Updating the book title
                PreparedStatement pstmt = connection.prepareStatement("UPDATE`books` SET title=?  WHERE id=?");
                pstmt.setString(1,newTitle);
                pstmt.setInt(2,bookId);

                // executing the update
                rowsAffected = pstmt.executeUpdate();

                // informing user whether their query has been executed or not
                if (rowsAffected != 0){
                    System.out.println("Query complete, " + rowsAffected + " rows updated.");
                }
                else{
                    System.out.println("Book with Id: " + bookId + " does not exist!");
                }
            }
            //----------------------------------------------------------------------------------
            // if user's choice is to change the author
            else if (infoToChange == 3){
                System.out.println("Enter new Author:");
                String newAuthor = UserInput.StringInput();

                // Updating the book author
                PreparedStatement pstmt = connection.prepareStatement("UPDATE`books` SET author=?  WHERE id=?");
                pstmt.setString(1,newAuthor);
                pstmt.setInt(2,bookId);

                // executing the update
                rowsAffected = pstmt.executeUpdate();

                // informing user whether their query has been executed or not
                if (rowsAffected != 0){
                    System.out.println("Query complete, " + rowsAffected + " rows updated.");
                }
                else{
                    System.out.println("Book with Id: " + bookId + " does not exist!");
                }
            }
            //-----------------------------------------------------------------------------------
            // if user's choice is to change the quantity of book
            else if (infoToChange == 4){
                System.out.println("Enter new Quantity Number:");
                int newAuthor = UserInput.IntegerInput();

                // Updating the quantity of books
                PreparedStatement pstmt = connection.prepareStatement("UPDATE`books` SET qty=?  WHERE id=?");
                pstmt.setInt(1,newAuthor);
                pstmt.setInt(2,bookId);

                // executing the update
                rowsAffected = pstmt.executeUpdate();

                // informing user whether their query has been executed or not
                if (rowsAffected != 0){
                    System.out.println("Query complete, " + rowsAffected + " rows updated.");
                }
                else{
                    System.out.println("Book with Id: " + bookId + " does not exist!");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
