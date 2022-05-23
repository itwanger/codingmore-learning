package top.codingmore.mapper;

import org.apache.ibatis.annotations.*;
import top.codingmore.entity.User;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM user")
    List<User> getAll();

    @Select("SELECT * FROM user WHERE id = #{id}")
    User getOne(Integer id);

    @Insert("INSERT INTO user(name,password,age) VALUES(#{name}, #{password}, #{age})")
    void insert(User user);

    @Update("UPDATE user SET name=#{name},password=#{password},age=#{age} WHERE id =#{id}")
    void update(User user);

    @Delete("DELETE FROM user WHERE id =#{id}")
    void delete(Integer id);
}
