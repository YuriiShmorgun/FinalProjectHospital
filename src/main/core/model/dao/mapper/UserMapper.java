package model.dao.mapper;

import model.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class UserMapper implements ObjectMapper {
    @Override
    public Object extractFromResultSet(ResultSet resultSet) throws SQLException {
       // User user = new User();
       // user.setLogin(resultSet.getString("login"));
       // user.setPassword(resultSet.getString("password"));

        return null;
    }

    @Override
    public Object makeUnique(Map cache, Object teacher) {
        return null;
    }
}
