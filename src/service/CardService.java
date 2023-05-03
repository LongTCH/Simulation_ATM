package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CardService {
    private static final String connectionString = "jdbc:mysql://127.0.0.1:3306/atm";
    private static final String user = "root";
    private static final String password = "";
    private Connection connection = null;
    java.sql.Statement stmt = null;

    private void openConnection() throws Throwable {
        try {
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
        String query = "select * from cardinformation where cardnumber = " + cardNumber;
        ResultSet rs = stmt.executeQuery(query);
        String pin = null;
        while (rs.next())
            pin = rs.getString("PIN");
        closeConnection();
        return pin;
    }

    public void setPin(String cardNumber, String pin) throws Throwable {
        openConnection();
        String query = "update table cardinformation set PIN = " + pin + " where CardNumber = " + cardNumber;
        stmt.executeUpdate(query);
        closeConnection();
    }

    public String getName(String cardNumber) throws Throwable {
        openConnection();
        String query = "SELECT * FROM cardinformation WHERE CardNumber = " + cardNumber;
        ResultSet rs = stmt.executeQuery(query);
        String name = null;
        while (rs.next())
            name = rs.getString("CustomerName");
        closeConnection();
        return name;
    }

    public float getMoney(String cardNumber) throws Throwable {
        openConnection();
        String query = "SELECT * FROM cardinformation WHERE CardNumber = " + cardNumber;
        ResultSet rs = stmt.executeQuery(query);
        float money = 0;
        while (rs.next())
            money = rs.getFloat("Money");
        closeConnection();
        return money;
    }

    public void setMoney(String cardNumber, float money) throws Throwable {
        openConnection();
        String query = "update cardinformation set Money = " + money + " where CardNumber = " + cardNumber;
        stmt.executeUpdate(query);
        closeConnection();
    }
}
