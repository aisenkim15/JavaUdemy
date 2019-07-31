package JDBC;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/aisen/IdeaProjects/JavaUdemy/src/JDBC/testjava.db");
             Statement statement = conn.createStatement();) {
//            conn.setAutoCommit(false);
            statement.execute("CREATE TABLE if not exists contacts " +
                    "(name TEXT, phone INTEGER, email TEXT)");
//            statement.execute("insert into contacts (name, phone, email)" +
//                    "values ('Joe', 0101122222, 'joe@gmail.com')");
//            statement.execute("insert into contacts (name, phone, email)" +
//                    "values ('Chris', 01033333333, 'chris@gmail.com')");
//            statement.execute("insert into contacts (name, phone, email)" +
//                    "values ('Mark', 01088889999, 'mark@gmail.com')");
//            statement.execute("Update contacts set email='james@gmail.com' where name = 'James'");
//            statement.execute("Delete from contacts where name = 'Chris'");

            statement.execute("Select * from contacts");
            ResultSet results = statement.getResultSet();
            while (results.next()) {
                System.out.println(results.getString("name") + " " + results.getInt("phone") +
                        " " + results.getString("email"));
            }
            results.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Something went wrong" + e.getMessage());
        }
    }
}