package Mapper;

import entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setUsername(rs.getString(1));
        user.setPassword(rs.getString(2));
        user.setName(rs.getString(3));
        user.setAge(rs.getInt(4));
        user.setDob(rs.getDate(5));
        
        return user;
    }
}
