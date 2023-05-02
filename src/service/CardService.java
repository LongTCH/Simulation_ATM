package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CardService {
    private static final String connectionString = "";
    private static final String user = "root";
    private static final String password = "";
    private Connection connection = null;
    java.sql.Statement stmt = null;

    private void openConnection() throws Throwable {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            if (connection == null || connection.isClosed())
                connection = DriverManager.getConnection(connectionString, user, password);
            stmt = connection.createStatement();
        } catch (Throwable ex) {
            throw ex;
        }
    }

    private void closeConnection() throws Throwable {
        if (connection != null) {
            try {
                if (!connection.isClosed())
                    connection.close();
            } catch (Throwable ex) {
                throw ex;
            }
        }
    }

    public String getPin(String cardNumber) throws Throwable {
        openConnection();
        String query = "select pin from cardinformation where cardnumber = " + cardNumber;
        ResultSet rs = stmt.executeQuery(query);
        String pin = null;
        while (rs.next())
            pin = rs.getString(1);
        closeConnection();
        return pin;
    }
}
