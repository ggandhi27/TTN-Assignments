package question3;

import Mapper.UserMapper;
import entity.User;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Repository
public class Question3DaoService {
    
    @Autowired
    DataSource dataSource;
    
    @Autowired
    BasicDataSource basicDataSource;
    
    @Autowired
    SingleConnectionDataSource singleConnectionDataSource;
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    Connection getConnection() throws SQLException {
        return  dataSource.getConnection();
    }
    
    Connection getBasicDataSourceConnection() throws SQLException {
        return basicDataSource.getConnection();
    }

    Connection getSingleConnectionDataSource() throws SQLException {
        return singleConnectionDataSource.getConnection();
    }
    
    void printUserCount() {
        String countSql = "SELECT COUNT(*) FROM user";
        System.out.println(jdbcTemplate.queryForObject(countSql, Integer.class));
    }
    
    public String getName(String username) {
        String getNameSql = "SELECT name FROM user WHERE username=?";
        return jdbcTemplate.queryForObject(getNameSql,new Object[]{username},String.class);
    }
    
    public void insertUser(User user) {
        String insertSql = "INSERT INTO user (username,password,name,age,dob)values(?,?,?,?,?)";
        jdbcTemplate.update(insertSql,new Object[]{user.getUsername(),user.getPassword(),user.getName(),
        user.getAge(),user.getDob()});
    }
    
    public Map queryUserDetails(String username) {
        String mapQuery = "SELECT * FROM user WHERE username=?";
        return jdbcTemplate.queryForMap(mapQuery,new Object[]{username});
    }
    
    public List fetchAllRecords() {
        String fetchAllSql = "SELECT * FROM user";
        return jdbcTemplate.queryForList(fetchAllSql);
    }
    public User fetchUserDetails(String username) {
        String fetchDetailsQuery = "SELECT * FROM user WHERE username=?";
        return jdbcTemplate.queryForObject(fetchDetailsQuery,new Object[]{username}, new UserMapper()
        );
    }
}
