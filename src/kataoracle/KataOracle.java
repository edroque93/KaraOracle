package kataoracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import oracle.jdbc.OracleDriver;

public class KataOracle {

    public static void main(String[] args) throws SQLException {
        String userName = "system";
        String password = "orcl";
        String server = "localhost:100:orcl";
        DriverManager.registerDriver(new OracleDriver());
        
        // "jdbc:oracle:thin:@server" ,username,password
        Connection connection = DriverManager.getConnection(
                "jdbc:oracle:thin:@" + server, userName, password);
        
        Statement statement = connection.createStatement();
        ResultSet set = statement.executeQuery("select * from CAMBIO_EUR_A");
        
        while(set.next()) {
            printRegister(set);
        }
    }

    private static void printRegister(ResultSet set) throws SQLException {
        System.out.println(set.getString("DIVISA"));
        System.out.println(set.getBigDecimal("CAMBIO"));
    }
}
