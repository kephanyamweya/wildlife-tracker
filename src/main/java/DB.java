
import org.sql2o.*;
import java.sql.*;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker", "kepha", "0703874756");
}

//postgres://eqxnmiwdiwflst:4adb232261ef2e7346b4dfd468d143a65c7f9b86c4d9e4bd457f4db2db10d298@ec2-54-156-60-12.compute-1.amazonaws.com:5432/d4usvin9sjtdck);