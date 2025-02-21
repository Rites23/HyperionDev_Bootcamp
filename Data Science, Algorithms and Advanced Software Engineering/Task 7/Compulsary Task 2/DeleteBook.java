import java.sql.*;

public class DeleteBook {

    /**
     * class DeleteABook is used to delete specific book
     */

    public static void DeleteABook() {

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

            // asking to enter id of book they want deleted
            System.out.println("Enter book Id:");
            int bookId = UserInput.IntegerInput();

            // deleting the book as per user request
            PreparedStatement pstmt = connection.prepareStatement("DELETE FROM`books` WHERE id=?");
            pstmt.setInt(1,bookId);

            // executing the update
            rowsAffected = pstmt.executeUpdate();

            // informing user whether their query has been executed or not
            if (rowsAffected != 0){
                System.out.println("Query complete, " + rowsAffected + " rows updated.");
            }
            else{
                System.out.println("Book with Id: " + bookId + " does not exist!");
            }

            //closing connections
            statement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}