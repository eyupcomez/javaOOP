import java.sql.*;

public class Main {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = helper.getConnection();

            statement= connection.createStatement();
            resultSet = statement.executeQuery("select * from Category ");

        } catch (SQLException exception) {

            helper.showErrorMessage(exception);

        } finally {
            connection.close();
        }

    }
}
