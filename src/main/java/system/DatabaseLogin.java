package system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class DatabaseLogin {
    private String host = "jdbc:mysql://moktok.javawebdev.com:33306/nino";
    private String user = "nino";
    private String password = "nino2020";
    private Connection connection;


    public DatabaseLogin() throws SQLException {
        this.connectToDB();

    }

    public void connectToDB() throws SQLException {
        connection = DriverManager.getConnection(host, user, password);
    }

}
