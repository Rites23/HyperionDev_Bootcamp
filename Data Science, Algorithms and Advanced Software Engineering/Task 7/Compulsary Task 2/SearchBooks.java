import java.sql.*;

public class SearchBooks {

    /**
     * Class Look for a book is used to search for a specific book
     */
    public static void LookForBook() {

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
            //-----------------------------------------------------------

            // asking user to enter book id they would like to search for
            System.out.println("Enter book Id");
            int bookId = UserInput.IntegerInput();

            // converting bookId to string, so we may use it the resultSet
            String StrBookId = String.valueOf(bookId);

            // selecting the book as per user request
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM`books` WHERE id=?");
            pstmt.setString(1,StrBookId);

            // Executing the query
            results = pstmt.executeQuery();

            // processing and printing out the user selected row
            if (results.next()){
                while (results.next()){
                    int id = results.getInt(1);
                    String title = results.getString(2);
                    String author = results.getString(3);
                    int qty = results.getInt(4);


                    // Initiating a variable wherein row info is stored in a way that it can be printed in a
                    // user-friendly manner
                    String outPut = "Book ID: " + id + ", ";
                    outPut += "Book Title: " + title + ", ";
                    outPut += "Book Author: " + author + ", ";
                    outPut += "Book Quantity: " + qty + ", ";
                    outPut += "\n";

                    // Printing book info only if book exists
                    System.out.println(outPut);
                }
            }
            else {
                System.out.println("Book: " + StrBookId + " does not exist!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}