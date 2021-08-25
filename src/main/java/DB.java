
import org.sql2o.*;
import java.sql.*;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker", "kepha", "0703874756");
}
//    public DB() throws SQLException {
//    }
//
//    public static Sql2o sql2o = new Sql2o("jdbc:postgres://ec2-52-72-125-94.compute-1.amazonaws.com:5432/d3qcmcv58u09tu", "uxcsgwdlgfzrlq", "ab76dda5b51f71a85449094811f776d454e4e1476fc35add721b52c3d7992438");
//}
