package JDBC;

import java.sql.*;

public class Main {
    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Desktop\\JavaUdemy\\src\\JDBC\\testjava.db";

    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(CONNECTION_STRING);
             Statement statement = conn.createStatement();) {
//            conn.setAutoCommit(false);
            statement.execute("DROP table if exists " + TABLE_CONTACTS);
            statement.execute("CREATE TABLE if not exists " + TABLE_CONTACTS +
                    " (" + COLUMN_NAME + " text, " +
                    COLUMN_PHONE + " integer, " +
                    COLUMN_EMAIL + " text" + ")");
            insertContact(statement, "Marry", 0111, "marry@gmail.com");
            insertContact(statement, "John", 0112, "john@gmail.com");
            insertContact(statement, "Joe", 0113, "joe@gmail.com");
            insertContact(statement, "Kane", 0114, "kane@gmail.com");

            statement.execute("UPDATE " + TABLE_CONTACTS + " SET " + COLUMN_PHONE + " = 99999 WHERE " + COLUMN_NAME + " = 'Jane'");
            statement.execute("Delete From " + TABLE_CONTACTS + " WHERE " + COLUMN_NAME + " ='John'");

            ResultSet results = statement.executeQuery("SELECT * FROM " + TABLE_CONTACTS);
            while (results.next()) {
                System.out.println(results.getString(COLUMN_NAME) + " " + results.getInt(COLUMN_PHONE) +
                        " " + results.getString(COLUMN_EMAIL));
            }
            results.close();
        } catch (SQLException e) {
            System.out.println("Something went wrong" + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void insertContact(Statement statement, String name, int phone ,String email) throws SQLException {
        statement.execute("INSERT INTO " + TABLE_CONTACTS +
                "( " + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL + ") " +
                "VALUES ('" + name + "', " + phone + ", '" + email + "')");
    }


}