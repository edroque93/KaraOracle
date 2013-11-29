package kataoracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import oracle.jdbc.OracleDriver;

public class KataOracle {

    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new OracleDriver());
        Connection connection = DriverManager.getConnection("jdbc:orcl:localhost:100");
        
    }
}
