package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.ResourceBundle;

public class JdbcTest {

    public static void main(String[] args) throws SQLException {
        Statement s = null;
        s.executeQuery("");

        DriverManager.getConnection("");

        Locale l;
        ResourceBundle bundle = null;
        bundle.getObject("");
    }
}
