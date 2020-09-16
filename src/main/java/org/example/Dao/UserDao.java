package org.example.Dao;

import org.apache.ibatis.annotations.Select;
import org.example.entity.User;

public interface UserDao {
  @Select("select * from t_user")
  User findUserById(int id);
}
