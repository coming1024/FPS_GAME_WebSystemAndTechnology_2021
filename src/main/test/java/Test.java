import database.JdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn = JdbcUtils.getConnection();
        if (conn != null) {
            System.out.println("连接成功");
        }
        JdbcUtils.close(conn);

    }
}
