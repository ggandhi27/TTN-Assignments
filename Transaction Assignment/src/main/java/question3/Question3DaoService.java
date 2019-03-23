package question3;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Repository
public class Question3DaoService {
    
    @Autowired
    DataSource dataSource;
    
    @Autowired
    BasicDataSource basicDataSource;
    
    Connection getConnection() throws SQLException {
        return  dataSource.getConnection();
    }
    
    Connection getBasicDataSourceConnection() throws SQLException {
        return basicDataSource.getConnection();
    }

}
