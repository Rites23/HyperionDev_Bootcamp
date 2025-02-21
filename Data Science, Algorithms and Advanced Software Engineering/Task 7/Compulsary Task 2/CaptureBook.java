import java.sql.*;

/**
 * <h1>Capture</h1>
 * <p>
 *     This class contains 1 method and is used to allow the user to record a book
 * <p/>
 *
 */
public class CaptureBook {

    /**
     * <h1>RecordBook</h1>
     * Being the only method in thw CaptureBook class, this
     * method allows user to capture some book information
     *
     * @exception SQLException
     */

    public static void RecordBook() {

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
            //Asking the user to enter book info
            System.out.println("Enter book Id:\n");
            int bookId = UserInput.IntegerInput();

            System.out.println("Enter book title:\n");
            String bookTitle = UserInput.StringInput();

            System.out.println("Enter book Author:\n");
            String bookAuthor = UserInput.StringInput();

            System.out.println("Enter book quantity:\n");
            int bookQty = UserInput.IntegerInput();

            // Executing the sql query to add book info to the database
            PreparedStatement pstmt = connection.prepareStatement("INSERT INTO `books` (id, title, author, qty) VALUE(?,?,?,?)");

            pstmt.setInt(1, bookId);
            pstmt.setString(2, bookTitle);
            pstmt.setString(3, bookAuthor);
            pstmt.setInt(4, bookQty);

            rowsAffected = pstmt.executeUpdate();
            System.out.println("Query complete, " + rowsAffected + " rows added.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}