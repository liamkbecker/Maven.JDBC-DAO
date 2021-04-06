import daos.LowerDAO;

import java.sql.SQLException;

public class Runner {

    public void run() throws SQLException {
        LowerDAO dao = new LowerDAO();
        System.out.println(dao.findById(1));
    }

}
